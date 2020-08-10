package functions

object FunctDefs {

  // all function args are VAL, not VAR...
  def dayOfWeek(d: Int, m: Int, y: Int = 2020): Int = {
    // Zeller's congruence
//    val month = if (m < 3) 13 + m else m
//    val year = if (m < 3) y - 1 else y
    val (month, year) = if (m < 3) (12 + m, y - 1) else (m, y)
    (d + (13 * (month + 1) / 5) + year + year / 4 - year / 100 + year / 400) % 7
  }

  def dayName(i: Int): String = i match {
    case 0 => "Saturday"
    case 1 => "Sunday"
    case 2 => "Monday"
    case _ => "Some other day"
  }

  // lazy assignment/evaluation
  def lazything(s: => String): Unit = {
    lazy val str = s
    println("in lazything")
    if (math.random() > 0.5 ) {
      println(s"Value of str is ${str}")
    } else {
      println("Not using value")
    }
  }

  // "Currying"
  // "Pass by name" kinda send in the code, and let me deal with it!
  // NOT evaluated prior to the call
  // => creates pass by name
  def repeat(n: Int)(s: => Unit): Unit = {
    println("Executing repeat")
    n match {
      case x if x > 1 => s; repeat(n - 1)(s)
      case _ => ()
    }
  }

  def main(args: Array[String]): Unit = {
    println("Day of week of jan 1 2000 was " + dayOfWeek(1, 1, 2000))
    println("WRONG Day of week of August 10 2020 is " + dayOfWeek(8, 10, 2020))
    println("Day of week of August 10 2020 is " + dayOfWeek(m = 10, d = 8, y = 2020))
    println("Day of week of August 10 2020 is " + dayOfWeek(m = 10, d = 8))

    val n = dayName {
      println("Calculating day number")
      2
    }
    println(n)

    repeat(3) {
      println("Hello")
    }

    lazything{
      println("Evaluating lazything")
      "Hellooooo"
    }
  }
}
