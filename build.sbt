
import ohnosequences.sbt.GithubRelease.keys.ghreleaseNotes
import sbt.Keys._
import ohnosequences.sbt._

lazy val commonSettings = Seq(
  organization := "com.spotsinc.akkhttp.marshaller",
  version := "0.1.2",
  scalaVersion := "2.11.8",
  fork in run := true,
  parallelExecution in ThisBuild := false,
  parallelExecution in Test := false,
  ghreleaseNotes := {
    tagName => tagName.repr + " fixed datetime iso8601 conversion"
  },
  ghreleaseRepoOrg := "SpotsInc"
)


lazy val versions = new {
  val akkaHttp = "10.0.0"
  val akkaHttpCore = "10.0.0"

  val akkaHttpSprayJson = "10.0.0"
  val jodaTime = "2.9.7"
}

lazy val marshaller = project.in(file("marshaller")).
  settings(commonSettings: _*).
  settings(
    name := "akka-http-marshaller",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-http-core" % versions.akkaHttpCore,
      "com.typesafe.akka" %% "akka-http" % versions.akkaHttp,
      "com.typesafe.akka" %% "akka-http-spray-json" % versions.akkaHttpSprayJson,
      "joda-time" % "joda-time" % versions.jodaTime
    )
  )
