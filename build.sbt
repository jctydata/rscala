name := "rscala"

organization := "org.ddahl"

version := "3.2.3"
//version := "3.2.4-SNAPSHOT"

scalaVersion := "2.12.7"

crossScalaVersions := Seq("2.11.12", "2.12.7", "2.13.0-M5")

publishMavenStyle := true

publishTo := sonatypePublishTo.value

pomExtra := (
  <url>https://github.com/dbdahl/rscala/</url>
  <licenses>
    <license>
      <name>Apache License 2.0</name>
      <url>https://www.apache.org/licenses/LICENSE-2.0</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>https://dahl-git.byu.edu/dahl/rscala/</url>
    <connection>scm:git:https://github.com/dbdahl/rscala.git</connection>
  </scm>
  <developers>
    <developer>
      <id>dbdahl</id>
      <name>David B. Dahl</name>
      <url>https://dahl.byu.edu</url>
    </developer>
  </developers>
)

scalacOptions ++= List("-feature", "-deprecation", "-unchecked")

sources in (Compile, doc) ~= (_ filter (_.getName endsWith ".scala"))

scalacOptions in (Compile,doc) ++= Seq("-no-link-warnings", "-skip-packages", "scala:org.ddahl.rscala.server")

libraryDependencies ++= List(
  "org.scala-lang" % "scala-compiler" % scalaVersion.value,
  "org.scala-lang" % "scalap" % scalaVersion.value
)

