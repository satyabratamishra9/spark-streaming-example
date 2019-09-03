name := "spark-streaming-kafka"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  //"org.apache.spark" %% "spark-streaming" % "2.4.0" % "provided",
  //"org.apache.spark" %% "spark-streaming-kafka-0-10" % "2.4.4",
  //"org.apache.spark" % "spark-streaming_2.12" % "2.4.4" % "provided",
  //"org.apache.spark" % "spark-streaming-kafka-0-10_2.12" % "2.4.4",
  "org.mongodb.scala" %% "mongo-scala-driver" % "2.7.0"
  //"org.apache.spark" %%  "spark-streaming-kafka-0-8_2.11" % "2.1.1",
  //"org.scalikejdbc" %% "scalikejdbc" % "3.0.1",
  //"mysql" % "mysql-connector-java" % "5.1.43"
)
libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.3.1" % "provided"
libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka-0-10" % "2.3.1"
libraryDependencies += "org.reactivemongo" %% "reactivemongo" % "0.18.0"

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}