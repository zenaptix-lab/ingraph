package ingraph.ire

import hu.bme.mit.ire.datatypes.Tuple
import hu.bme.mit.ire.util.GenericMath
import org.scalatest.{FlatSpec, FunSuite}

class HistogramTest extends FunSuite {
  object EquiDepthHistogram {
    def apply(buckets: Int, iterable: Iterable[Long]): EquiDepthHistogram = {
      val sorted = iterable.toVector.sorted
      val bucketSize = sorted.size / buckets
      val bucketBoundaries: Vector[Long] = sorted.grouped(bucketSize).map(_.head).toVector
      new EquiDepthHistogram(bucketSize, bucketBoundaries)
    }
  }
  class EquiDepthHistogram private (val bucketSize: Int, val bucketBoundaries: Vector[Long]) {

    def join(other: EquiDepthHistogram): EquiDepthHistogram = {
      val firstIndex = this.index(other.bucketBoundaries.head)
      val lastIndex = this.index(other.bucketBoundaries.last)
      new EquiDepthHistogram(this.bucketSize, bucketBoundaries.slice(firstIndex, lastIndex))
    }

    def antijoin(other: EquiDepthHistogram): EquiDepthHistogram = {
      val firstIndex = this.index(other.bucketBoundaries.head)
      val lastIndex = this.index(other.bucketBoundaries.last)
      new EquiDepthHistogram(this.bucketSize,
        bucketBoundaries.slice(0, firstIndex) ++ bucketBoundaries.drop(lastIndex) )
    }

    private def index(number: Long): Int = {
      import scala.collection.Searching._
      bucketBoundaries.search(number).insertionPoint
    }

    def cardinality: Int = bucketBoundaries.size * bucketSize

    override def toString: String = bucketBoundaries.toString()
  }
  test("equi") {
    val h1 = EquiDepthHistogram(10, (0L to 20L).toSet) // Deterministically shuffle
    val h2 = EquiDepthHistogram(10, (10L to 30L).toSet)
    println(h1.join(h2))
    println(h1.join(h2).cardinality)
    println(h1.antijoin(h2))
    println(h1.antijoin(h2).cardinality)
  }
}
