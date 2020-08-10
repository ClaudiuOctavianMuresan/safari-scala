package useclasses

// Case classes:
// Define:
// factory
// toString
// equals & hashcode
case class AnotherDate(day: Int, month: Int, year: Int) {
  // can add my own instance functions
  // can define an object, and add "static" like features
}

object UseCCDAte {
  def main(args: Array[String]): Unit = {
    val ccd = AnotherDate(2, 3, 2022)
    val ccd2 = AnotherDate(2, 3, 2022)
    val ccd3 = AnotherDate(2, 4, 2022)

    ccd match {
      case AnotherDate(d, m, y) => println(s"That's a date, day is ${d}")
    }

    println(s"ccd == ccd2 ${ccd == ccd2}")
    println(s"ccd == ccd3 ${ccd == ccd3}")
  }
}
