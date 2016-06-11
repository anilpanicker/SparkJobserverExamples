package com.anil.sp2

import com.typesafe.config.{Config, ConfigFactory}
import org.apache.spark._
import org.apache.spark.sql.hive.HiveContext
import spark.jobserver.SparkHiveJob
import spark.jobserver._


object DBTest extends spark.jobserver.SparkHiveJob{
  
  def validate(hive: HiveContext, config: Config): SparkJobValidation = SparkJobValid
  
  def runJob(hive: HiveContext, config: Config): Any = {
    val dbs= hive.sql("show databases")
    dbs.count()
}
  
}