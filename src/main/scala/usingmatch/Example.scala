package usingmatch

import java.time.LocalDate

object Example {
  def main(args: Array[String]): Unit = {
//    val x: Any = "Value is " + math.random()
//    val x: Any = LocalDate.now()//.toString
    val x: Any = -3.14
    x match {
      case 1 => println("Looks like a one to me")
      case "Hello" => println("looks like a greeting to me")
      case _ => println("Huh, what's that")
    }

    val s = x match {
      case 1 => "Looks like a one to me"
      case "Hello" => "looks like a greeting to me"
      case collector: String => s"A string that looks like ${collector} to me"
      case collector: LocalDate => s"Something else that looks like ${collector} to me"
      case aDoubleValue: Double if aDoubleValue < 0 => s"a negative number is ${aDoubleValue}"
      case _ => "Huh, what's that"
    }
    println(s"value of s is ${s}")
  }
}
