name := "sbt-onejar"
crossSbtVersions := Seq("0.13.18", "1.3.l3")
organization := "org.scala-sbt.plugins"
version := "0.9-SNAPSHOT"
scalaVersion := "2.12.12"
sbtPlugin := true
scalacOptions in Compile ++= Seq("-deprecation")

publishMavenStyle := true

//Mesosphere users, ensure MAWS credentials are set to [default] in ~/.aws/config
publishTo := {
  //val repo = "s3://downloads.mesosphere.io"
  //TODO@kjoshi switch this to production before release!
  val repo = "s3://kjoshi-dev.s3.us-east-1.amazonaws.com"
  if (version.value.endsWith("-SNAPSHOT"))
      Some("Mesosphere Public Snapshot Repo (S3)" at s"${repo}/maven-snapshots")
  else
      Some("Mesosphere Public Snapshot Repo (S3)" at s"${repo}/maven")
}