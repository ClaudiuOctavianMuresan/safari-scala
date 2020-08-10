package functions

import java.time.LocalDate

object MagicValue {
  implicit val num = 100
}

object UseImplicit {
//  def addTo(i: Int)(j: Int = 10): Int = i + j
  def addTo(i: Int)(implicit j: Int): Int = i + j

  def main(args: Array[String]): Unit = {
//    println(addTo(3)())
    {
      import MagicValue.num

      println(addTo(3))
      println(addTo(10))
    }
    println(addTo(22)(10))

  }
}
