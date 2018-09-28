import akka.actor.Actor
import akka.actor.ActorRef

class PingPongActor extends Actor {
  var otherActor: ActorRef = null

  def receive = {
    case Start(target) =>
        otherActor = target
        otherActor ! Ping
    case Ping =>
        println("received ping")
        Thread.sleep(500)
        sender ! Pong
    case Pong =>
        println("received pong")
        Thread.sleep(500)
        sender ! Ping
  }
}
