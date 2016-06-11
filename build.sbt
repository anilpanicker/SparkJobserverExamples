name := "sp2"

version := "0.0.1"

scalaVersion := "2.10.5"

 resolvers += "Job Server Bintray" at "https://dl.bintray.com/spark-jobserver/maven"
 
libraryDependencies ++= Seq(
		 	"org.scalatest" % "scalatest_2.10" % "3.0.0-M16-SNAP6",
			"org.apache.spark" %% "spark-core" % "1.6.1",
			"org.apache.spark" %% "spark-sql" % "1.6.1",
			"org.apache.spark" %% "spark-streaming" % "1.6.1",
			"org.apache.spark" %% "spark-mllib" % "1.6.1",
			"org.apache.spark" %% "spark-hive" % "1.6.1",
			"spark.jobserver" %% "job-server-api" % "0.6.2",
			"spark.jobserver" %% "job-server-extras" % "0.6.2",
			"spark.jobserver" %% "job-server" % "0.6.2"
			)
			


