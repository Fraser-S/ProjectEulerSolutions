name := "ProjecteulerSolutions"

version := "1.0"

scalaVersion := "2.12.2"

wartremoverErrors ++= Warts.unsafe

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"