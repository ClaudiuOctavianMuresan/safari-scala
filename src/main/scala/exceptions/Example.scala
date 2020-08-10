package exceptions

import java.io.IOException
import java.sql.{SQLException, SQLType}

object Example {
  def dodgy:String =
    if(math.random() > 0.9) "Success" else throw new IOException("DB Broke")

  def main(args: Array[String]): Unit = {
    try {
      println(dodgy)
    } catch {
      case sqle: SQLException => println(s"Problem ${sqle.getMessage}")
      case ex: Throwable => println("Some other problem")
    }
  }

}
