import sbt._

class MyProject(info: ProjectInfo) extends DefaultProject(info) with AkkaProject {

  val akka = "Akka" at "http://www.scalablesolutions.se/akka/repository/"
  val multiverse = "Multiverse" at "http://multiverse.googlecode.com/svn/maven-repository/releases/"
  val guiceyfruit = "GuiceyFruit" at "http://guiceyfruit.googlecode.com/svn/repo/releases/"
  val jboss = "JBoss" at "https://repository.jboss.org/nexus/content/groups/public/"
  val scala_tools = "Scala_Tools" at "http://scala-tools.org/repo-releases/"

  val akkaCamel = akkaModule("camel")
  
  val camelJetty = "org.apache.camel" % "camel-jetty" % "2.5.0" % "compile"



}
