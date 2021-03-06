package ingraph.ire

import hu.bme.mit.ire.TransactionFactory
import hu.bme.mit.ire.datatypes.Tuple

import scala.io.Source

object TrainbenchmarkUtils {
  def modelPath(size: Int, entityName: String) = s"../../graphs/trainbenchmark/railway-repair-$size-$entityName.csv"
  def queryPath(query: String): String = s"../../queries/trainbenchmark/$query.cypher"
  def nodeFilenames(size: Int): Map[String, List[String]] = Map(
    modelPath(size, "Region") -> List("Region"),
    modelPath(size, "Route") -> List("Route"),
    modelPath(size, "Segment") -> List("Segment", "TrackElement"),
    modelPath(size, "Semaphore") -> List("Semaphore"),
    modelPath(size, "Sensor") -> List("Sensor"),
    modelPath(size, "Switch") -> List("Switch", "TrackElement"),
    modelPath(size, "SwitchPosition") -> List("SwitchPosition")
  )

  def relationshipFilenames(size: Int): Map[String, String] = Map(
    modelPath(size, "connectsTo") -> "connectsTo",
    modelPath(size, "entry") -> "entry",
    modelPath(size, "exit") -> "exit",
    modelPath(size, "follows") -> "follows",
    modelPath(size, "monitoredBy") -> "monitoredBy",
    modelPath(size, "requires") -> "requires",
    modelPath(size, "target") -> "target"
  )

  def readModelAndGetResults(queryName: String, querySpecification: String, size: Int): Iterable[Tuple] = {
    val adapter = new IngraphIncrementalAdapter(querySpecification, queryName)
    val tf = new TransactionFactory(16)
    tf.subscribe(adapter.engine.inputLookup)
    val tran = tf.newBatchTransaction()
    adapter.readCsv(nodeFilenames(size), relationshipFilenames(size), tran)
    tran.close()
    adapter.engine.getResults()
  }
}
