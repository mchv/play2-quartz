import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "play2-quartz"
    val appVersion      = "1.2"

    val appDependencies = Seq(
      "org.quartz-scheduler" % "quartz" % "2.1.6"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      organization := "mchv",
      publishTo := Some(Resolver.file("file", file(Option(System.getProperty("repository.path")).getOrElse("/tmp"))))
    )

}