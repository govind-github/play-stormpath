name := """stormpath"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
"com.stormpath.sdk" % "stormpath-sdk-api" % "1.0.RC3.1",
"com.stormpath.sdk" % "stormpath-sdk-httpclient" % "1.0.RC3.1",
"com.stormpath.sdk" % "stormpath-sdk-impl" % "1.0.RC3.1",
"com.stormpath.sdk" % "stormpath-sdk-oauth" % "1.0.RC3.1",
  javaJdbc,
  javaEbean,
  cache,
  javaWs
)

