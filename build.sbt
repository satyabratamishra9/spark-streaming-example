name := "kafka-spark-streaming"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.3.1" % "provided"

//libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka-0-10" % "2.0.0"


libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka-0-10" % "2.3.1"
//libraryDependencies += "org.apache.kafka" % "kafka-clients" % "0.10.0.1"

assemblyMergeStrategy in assembly := {
  case PathList("javax", "servlet", xs @ _*)         => MergeStrategy.first
  case PathList(ps @ _*) if ps.last endsWith ".html" => MergeStrategy.first
  case PathList(ps @ _*) if ps.last endsWith ".class" => MergeStrategy.first
  case "application.conf"                            => MergeStrategy.concat
  case "unwanted.txt"                                => MergeStrategy.discard
  case x =>
    val oldStrategy = (assemblyMergeStrategy in assembly).value
    oldStrategy(x)
}