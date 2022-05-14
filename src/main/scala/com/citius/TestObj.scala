package com.citius

import org.apache.spark.sql.SparkSession;
import org.apache.spark.SparkContext;
import org.apache.spark.SparkConf;
import org.apache.spark.sql.types._
import org.apache.spark.sql.functions._
/*import org.apache.spark.sql.hive.HiveSessionStateBuilder
import org.apache.hadoop.hive.conf.HiveConf*/

object TestObj {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName("Test").master("local[*]").enableHiveSupport().config("spark.sql.warehouse.dir","hdfs://localhost:9000/user/hive/warehouse").getOrCreate()
    //hdfs://localhost:9000/user/hive/warehouse
    //config("spark.sql.warehouse.dir","hdfs://localhost:9000/user/hive/warehouse").
    ///user/hive/warehouse

    //spark.sparkContext.setLogLevel("ERROR")
    import spark.implicits._
    /*val data = spark.read.table("hivedb.emp")
    data.show()*/

    println("git testing")


    spark.sql("show databases").show()
    spark.catalog.listDatabases().show(false)
    //spark.sql("create database pc9")
    //spark.sql("show databases").show()
    spark.sql("create table pc9.test(empid int, ename string)")
   spark.sql("describe formatted pc9.test").show(false)
    //spark.sql("describe formatted default.emp").show(false)
    /*spark.sql("use hivedb")
    val data = spark.read.table("emp")
    data.show()*/

    println("Jai Bhavani")
  }

}
