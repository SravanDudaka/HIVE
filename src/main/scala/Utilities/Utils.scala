package Utilities
import org.apache.log4j.Logger
import org.apache.spark.sql.functions._
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.col
import org.apache.spark.{SparkConf, SparkContext}
//import com.typesafe.config.{Config, ConfigFactory}
import java.io.File

class Utils {
  val logger = Logger.getLogger(getClass.getName)
  val spark = SparkSession.builder().appName("Test").master("local[*]").enableHiveSupport().config("spark.sql.warehouse.dir","hdfs://localhost:9000/user/hive/warehouse").getOrCreate()

  spark.sparkContext.setLogLevel("ERROR")
  import spark.implicits._

  println("git testing")
  spark.sql("show databases").show()
  spark.catalog.listDatabases().show(false)
spark.catalog.listTables().show(false)
}
