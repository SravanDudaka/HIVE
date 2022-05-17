package com.citius

import org.apache.spark.sql.SparkSession;
import NullRecords.NullRecords
import Utilities.Utils
import RowCount.RowCount
import org.apache.spark.SparkContext;
import org.apache.spark.SparkConf;
import org.apache.spark.sql.types._
import org.apache.spark.sql.functions._
/*import org.apache.spark.sql.hive.HiveSessionStateBuilder
import org.apache.hadoop.hive.conf.HiveConf*/

object TestObj extends Utils{
  def main(args: Array[String]): Unit = {
   /* val spark = SparkSession.builder().appName("Test").master("local[*]").enableHiveSupport().config("spark.sql.warehouse.dir","hdfs://localhost:9000/user/hive/warehouse").getOrCreate()

    spark.sparkContext.setLogLevel("ERROR")
    import spark.implicits._

    println("git testing")


    spark.sql("show databases").show()
    spark.catalog.listDatabases().show(false)*/

     val nullR=new NullRecords
     val TC = new RowCount

    val MA_MAMB_DIM_Tab = spark.read.table("pc9.MA_MAMB_DIM")
    nullR.getNullRecords(MA_MAMB_DIM_Tab,"MA_MAMB_DIM")

    TC.getRowCount(MA_MAMB_DIM_Tab,"MA_MAMB_DIM")
    //spark.sql("create database pc9")
    //spark.sql("show databases").show()
    /*spark.sql("create table pc9.test(empid int, ename string)")
   spark.sql("describe formatted pc9.test").show(false)*/

    /*
    val data1=spark.read.format("csv").option("header","true").load("D:\\Uday-Project-citius\\Files\\MA_MAMB_DIM.csv")
    data1.write.mode("overwrite").saveAsTable("pc9.MA_MAMB_DIM")
    val data2 = spark.read.table("pc9.MA_MAMB_DIM")
    data2.show(false)

        println("*************MA_MAMB_CVG_CMP****************")
        val data3=spark.read.format("csv").option("header","true").load("D:\\Uday-Project-citius\\Files\\MA_MAMB_CVG_CMP.csv")
        data3.write.mode("overwrite").saveAsTable("pc9.MA_MAMB_CVG_CMP")
        val data4 = spark.read.table("pc9.MA_MAMB_CVG_CMP")
        data4.show(false)
        println("*************wkdy_payroll_hrs****************")
        val data5=spark.read.format("csv").option("header","true").load("D:\\Uday-Project-citius\\Files\\wkdy_payroll_hrs.csv")
        data5.write.mode("overwrite").saveAsTable("pc9.wkdy_payroll_hrs")
        val data6 = spark.read.table("pc9.wkdy_payroll_hrs")
        data6.show(false)
        println("*************kelly_services_payroll_hrs****************")
        val data7=spark.read.format("csv").option("header","true").load("D:\\Uday-Project-citius\\Files\\kelly_services_payroll_hrs.csv")
        data7.write.mode("overwrite").saveAsTable("pc9.kelly_services_payroll_hrs")
        val data8 = spark.read.table("pc9.kelly_services_payroll_hrs")
        data8.show(false)
    */

    println("   ")
    println("Jai Bhavani")
  }

}
