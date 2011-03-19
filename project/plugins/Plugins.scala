import sbt._
 
class Plugins(info: ProjectInfo) extends PluginDefinition(info) {

val akka = "Akka" at "http://www.scalablesolutions.se/akka/repository/"
  val multiverse = "Multiverse" at "http://multiverse.googlecode.com/svn/maven-repository/releases/"
  val guiceyfruit = "GuiceyFruit" at "http://guiceyfruit.googlecode.com/svn/repo/releases/"
  val jboss = "JBoss" at "https://repository.jboss.org/nexus/content/groups/public/"

  val akkaPlugin = "se.scalablesolutions.akka" % "akka-sbt-plugin" % "1.0-RC2"
}
