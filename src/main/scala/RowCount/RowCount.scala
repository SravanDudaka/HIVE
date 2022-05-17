package RowCount
import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.types._
import org.apache.spark.sql.functions._

import Utilities.Utils


class RowCount {

  def getRowCount(dfObj2:DataFrame,Tname2:String):Unit ={
   // dfObj.show(false)
    val TCount=dfObj2.filter(col("Date")===current_date()).count()
    println("Printing Row Counts")
    println(TCount)
    val dt = current_date()
    println(dt)


  }
}
