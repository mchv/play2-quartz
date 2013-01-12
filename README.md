# Quartz module for play 2

Schedule your scala functions without dealing with quartz API nor Akka.
Use cron expression or a time fluent API.


```scala

import akka.util.duration._
import play.api.Application
import play.api.GlobalSettings

import utils.QuartzScheduler

object Global extends GlobalSettings {

  override def onStart(app: Application) {
    QuartzScheduler.start()
    QuartzScheduler schedule("job 1 ", foo) every (5 seconds)
    QuartzScheduler schedule("job 2 ", bar) at "0 0 3 * * ? *"
  }

  override def onStop(app: Application) {
    QuartzScheduler.stop()  
  }


  def foo {
    println("foo")
  }

  def bar {
    println("bar")
  }

}

```

## Setting up with sbt

Configure a new resolver:

```scala
val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
  resolvers += "Mariot Chauvin" at "http://mchv.me/repository"
)
```

Add the app dependency:

```scala
val appDependencies = Seq(
  "mchv" %% "play2-quartz" % "1.1"
)
```
