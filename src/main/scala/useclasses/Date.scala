package useclasses

object Date {
  def dayOfWeek(d: Int, m: Int, y: Int): Int = {
    val (month, year) = if (m < 3) (12 + m, y - 1) else (m, y)
    (d + (13 * (month + 1) / 5) + year + year / 4 - year / 100 + year / 400) % 7
  }
  private val dayNames = List("Saturday", "Sunday", "Monday", "Tuesday", "Wenedsay", "Thursday", "Friday")
  def dayName(n: Int): String = dayNames(n)
}

class Date(val day: Int, val month: Int, val year: Int) {
  override def toString: String = s"Date d = ${this.day} / ${this.month} / ${this.year} " +
    s"which is ${Date.dayName(Date.dayOfWeek(day, month, year))}"
}
object Holiday {
  def apply(d: Int, m: Int, y: Int, name: String): Holiday =
    new Holiday(d, m, y, name)
}
class Holiday private (d: Int, m: Int, y: Int, val name: String) extends Date(d, m, y) {
  println(s"Running constructor for Holiday... d is ${d}")

  override def toString: String = super.toString + s" a holiday called ${name}"

  println("Still running constructor...")
}

object UseDate {
  def main(args: Array[String]): Unit = {
    val d = new Date(1, 2, 2020)
    println(s"date is ${d}")

//    val h: Date = new Holiday(1, 1, 2021, "new years day")
    val h: Date = Holiday(1, 1, 2021, "new years day")
    println(h.toString)
  }
}
