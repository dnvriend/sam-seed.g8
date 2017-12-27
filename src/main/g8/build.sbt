
lazy val `$name$` = (project in file("."))
  .settings(
	libraryDependencies += "com.github.dnvriend" %% "sam-annotations" % "1.0.6",
    libraryDependencies += "com.github.dnvriend" %% "sam-lambda" % "1.0.6",
    libraryDependencies += "com.amazonaws" % "aws-lambda-java-core" % "1.2.0",
    resolvers += Resolver.bintrayRepo("dnvriend", "maven"),
    scalaVersion := "2.12.4",
	samStage := "hello"
  )

  

