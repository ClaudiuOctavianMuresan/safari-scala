package hello

object Hello {
  def main(args:Array[String]): Unit = {
//    Console.println("Hello World!")
    println("Hello World!")
    println("Still running!")

//    val x: Int = 99 // val is like final in Java and const in JavaScript/C#
    val x = 99
//    x = x + 1
    val xPlusOne = x + 1
    println(s"The value of x is $x and with an extra hundred that makes ${x + 100}")
  }
}
