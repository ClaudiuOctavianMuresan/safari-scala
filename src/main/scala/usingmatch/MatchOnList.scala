package usingmatch

import scala.annotation.tailrec

object MatchOnList {
  @tailrec
  def printAll(n: List[String]): Unit = n match {
    case Nil => /* () // Unit!!! */
    // in this case, :: is an "extractor".. many classes provide them
    case head :: tail => println(s"> ${head}"); printAll(tail)
  }

//  @tailrec
  def join(l: List[String]): String = l match {
    case Nil => ""
    case head :: tail => head + ", " + join(tail)
  }

  def counter(n: Int): Unit = {
    println(n)
    counter(n + 1)
  }

  def main(args: Array[String]): Unit = {
    val names = List("Fred", "Jim", "Sheila");
    printAll(names)
//    counter(0)

    println(join(names))
  }
}
