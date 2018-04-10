
name := "gecko"

version := "0.1"

scalaVersion := "2.11.12"

resolvers += "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository"
resolvers += "Local Ivy Repository" at "file://"+Path.userHome.absolutePath+"/.ivy2/repository"

resolvers ++= Seq("Sonatype OSS Releases" at "https://oss.sonatype.org/content/repositories/releases/",
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
  "Typesafe Repo" at "http://repo.typesafe.com/typesafe/releases",
  "spray repo" at "http://repo.spray.io",
  "Bintray Repo" at "http://dl.bintray.com/sbt/sbt-plugin-releases/",
  "dnvriend at bintray" at "http://dl.bintray.com/dnvriend/maven",
  "Jemstep Plugin Snapshots" at "https://ci.jemstep.com/artifactory/plugins-snapshots-local/",
  "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.5" % "test",
//  "org.scalatest" %% "scalatest" % "2.1.7" % "test",
  "org.scalatestplus" %% "play" % "1.4.0" % "test",
//  "com.codeborne" % "phantomjsdriver" % "1.3.0" % "test",
  "org.scala-js" %% "scalajs-env-selenium" % "0.2.0",
  "org.seleniumhq.selenium" % "selenium-htmlunit-driver" % "2.29.0" % "test",
  "org.seleniumhq.selenium" % "selenium-java" % "3.8.0" % "test",
  "org.seleniumhq.selenium" % "selenium-api" % "3.8.0" % "test"
)