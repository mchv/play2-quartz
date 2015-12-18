organization := "mchv"

name := """play2-quartz"""

version := "1.1"

scalaVersion := "2.11.7"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies ++= List(
	"org.quartz-scheduler" % "quartz" % "2.2.2"
)