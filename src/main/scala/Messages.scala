import akka.actor.ActorRef

case class Start(target: ActorRef)
case object Ping
case object Pong
