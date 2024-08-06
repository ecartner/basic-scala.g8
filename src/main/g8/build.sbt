// give the user a nice default project!
ThisBuild / scalaVersion := "3.4.2"
ThisBuild / version := "0.1-SNAPSHOT"
ThisBuild / javacOptions += "-Xlint:deprecation"
ThisBuild / scalacOptions += "-deprecation"


lazy val root = (project in file(".")).
  settings(
    name := "$name$"
  )
