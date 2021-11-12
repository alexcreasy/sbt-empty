import Dependencies._

ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "1.0.0"
ThisBuild / organization     := "io.github.alexcreasy"

ThisBuild / publishMavenStyle := true

lazy val root = (project in file("."))
  .settings(
    name := "sbt-empty",
    libraryDependencies += scalaTest % Test
  )
