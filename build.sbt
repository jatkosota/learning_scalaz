name := "learning_scalaz"

version := "1.0"

scalaVersion := "2.11.7"

val scalazVersion = "7.2.4"

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % scalazVersion
)

scalacOptions in ThisBuild ++= Seq(
  "-feature"
)

initialCommands in console := "import scalaz._, Scalaz._"
