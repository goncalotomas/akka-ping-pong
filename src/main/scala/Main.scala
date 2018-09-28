import akka.actor.ActorSystem
import akka.actor.ActorRef
import akka.actor.Actor
import akka.actor.Props


object Main {
  def main(args: Array[String]): Unit = {
    // Create the actor system that will spawn our actors
    val actorSystem = ActorSystem("akka4scala");

    // Create the actor that will send out the messages
    val actor1 = actorSystem.actorOf(Props[PingPongActor], "actor1")
    val actor2 = actorSystem.actorOf(Props[PingPongActor], "actor2")

    actor1 ! Start(actor2)
  }
}
