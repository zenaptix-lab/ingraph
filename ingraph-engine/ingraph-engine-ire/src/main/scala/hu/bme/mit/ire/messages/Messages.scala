package hu.bme.mit.ire.messages

import akka.actor.ActorRef
import hu.bme.mit.ire.datatypes.Tuple
import hu.bme.mit.ire.datatypes.TupleBag

import scala.concurrent.Promise
import scala.collection.mutable

class ReteMessage() {}

case class ChangeSet(positive: TupleBag = Vector(), negative: TupleBag = Vector())
//case class ChangeSet(positive: TupleBag = new mutable.HashMap(), negative: TupleBag = new mutable.HashMap())
  extends ReteMessage()

case class ExpectMoreTerminators(id: Int, inputs: Iterable[ReteMessage => Unit])

case class TerminatorMessage(terminatorID: Int, messageID: Int, route: List[ActorRef] = List.empty) extends ReteMessage()

case class ExpectTerminator(terminatorID: Int, messageID: Int, promise: Promise[Iterable[Tuple]]) extends ReteMessage()

case class Pause(messageID: Int) extends ReteMessage()

case class Resume(messageID: Int) extends ReteMessage()

case class SizeRequest()
