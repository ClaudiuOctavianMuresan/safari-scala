package exrpressionset

object ExpressionsEtc {
//  def doubleIt(num: Int): Int = {
//    2 * num // NO RETURN needed, style says "don't use return" but it is valid
//  }

  def doubleIt(num: Int): Int = 2 * num

  def +=+=+ (num: Int): Int = 5 * num

  def main(args: Array[String]): Unit = {
    val x = {
      println("Hello, calculating a value")
      99 // value of curly brace expression is value of the last expression in the block
    }

    println(s"x is ${x}")

    var count = 3
    while (count > 0) {
      println(s"count is ${count}") // ++ -- not allowed
      count -= 1
    }

    val name = if (math.random() > 0.5) "Albert" else "Sheila" // equivalent to ? : "ternary operator"
    println(s"name is ${name}")

    val res = if (Math.random() > 0.5) { // Math is Java (java.lang.Math) math is a scala object
      println("that's big")
    } else {
      println("that's small")
    }

    println(s"value of res is ${res}")

//    val sum = (2).+(3)
//    val sum =  2 + (3)
    val sum =  2 + 3
    println(s"sum is ${sum}")

    Console.println("Hello")
    Console println "Hello"

    println(ExpressionsEtc +=+=+ 5)
  }
}
