package NullRecords
import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.types._
import org.apache.spark.sql.functions._

import Utilities.Utils

class NullRecords extends Utils {
  def getNullRecords(dfObj:DataFrame,Tname:String):Unit ={
    dfObj.show(false)
    val nullData=dfObj.filter(col("LOB").isNull)
    nullData.show(false)
    val tableName=Tname.concat("_NullRecords")


    nullData.write.mode("overwrite").saveAsTable(s"pc9.$tableName")

  }

}
