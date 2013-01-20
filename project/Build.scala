import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

    val appName         = "play2-quartz"
    val appVersion      = "1.1"

    val appDependencies = Seq(
      "org.quartz-scheduler" % "quartz" % "2.1.6"
    )

    val main = play.Project(appName, appVersion, appDependencies).settings(
      organization := "mchv",
      publishTo := Some(Resolver.file("file", file(Option(System.getProperty("repository.path")).getOrElse("/tmp"))))
    )

}
