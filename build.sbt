name := "sbt-onejar"

crossSbtVersions := Seq("0.13.18", "1.3.l3")

organization := "org.scala-sbt.plugins"

version := "0.9-SNAPSHOT"

sbtPlugin := true

scalacOptions in Compile ++= Seq("-deprecation")

publishTo := Some(Resolver.url("sbt-plugin-releases", new URL("http://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns))

publishMavenStyle := false

scalaVersion := "2.12.12"
