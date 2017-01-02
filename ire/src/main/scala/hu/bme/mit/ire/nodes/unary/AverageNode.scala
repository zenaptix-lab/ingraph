package hu.bme.mit.ire.nodes.unary

import hu.bme.mit.ire.SingleForwarder
import hu.bme.mit.ire.datatypes._
import hu.bme.mit.ire.messages.{ChangeSet, ReteMessage}
import hu.bme.mit.ire.util.{GenericMath, SizeCounter}

class AverageNode(override val next: (ReteMessage) => Unit,
                  val aggregationKeys: Mask,
                  val sumKey: Int) extends UnaryNode with SumLike with CountLike with SingleForwarder {

  override def onSizeRequest(): Long = SizeCounter.count(counts.keys, sums.keys)

  def average(sums: Iterable[Tuple], counts: Iterable[Tuple]): Iterable[Tuple] = {
    for ( (sum, count) <- (sums zip counts) )
      yield sum.slice(0, sum.size - 1) :+ GenericMath.divide(sum.last, count.last)
  }

  override def onChangeSet(changeSet: ChangeSet): Unit = {
    val sumChangeSet = maintainSum(changeSet, aggregationKeys, sumKey)
    val countChangeSet = maintainCount(changeSet, aggregationKeys)

    val averagePositive = average(sumChangeSet.positive, countChangeSet.positive)
    val averageNegative = average(sumChangeSet.negative, countChangeSet.negative)

    forward(ChangeSet(positive = averagePositive, negative = averageNegative))
  }

}
