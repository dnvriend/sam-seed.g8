
lazy val `$name$` = (project in file("."))

libraryDependencies += "com.github.dnvriend" %% "sam-annotations" % "1.0.0-SNAPSHOT"
libraryDependencies += "com.github.dnvriend" %% "sam-lambda" % "1.0.0-SNAPSHOT"
libraryDependencies += "com.amazonaws" % "aws-lambda-java-core" % "1.2.0"
  
scalaVersion := "2.12.4"

//Sam config
samStage := "hello"