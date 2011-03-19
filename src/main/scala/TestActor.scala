import akka.actor.Actor
import akka.actor.Actor._
import akka.camel.{Message, Consumer}
 
class MyActor extends Actor with Consumer {
  def endpointUri = "jetty:http://localhost:8877/example"
 
  def receive = {
    case msg: Message => { self.reply("Hello %s" format msg.bodyAs[String]) }
    case _            => { println("WTF?") }
  }
}
