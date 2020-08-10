package exrpressionset

object UseArraysAndLists {
  def main(args: Array[String]): Unit = {
//    val names = Array.apply("Fred", "Jim", "Sheila") // "factory" initialization
    val names/*:Array[String]*/ = Array("Fred", "Jim", "Sheila") // "factory" initialization
//    println(s"first name in list is ${names apply 0}")
    println(s"first name in list is ${names.apply(0)}")
    names(0) = "Frederick" // syntactic sugar for update method.
    names.update(0, "Frederick") //
    println(s"first name in list is ${names(0)}") // object-parens(args) implies (syntactic sugar) object.apply(args)

    val moreNames = List("Alan", "Bruce", "Camilla")
    println(moreNames)
    println(s"first name is ${moreNames(0)}")
    println(s"moreNames head is ${moreNames.head}")
    println(s"moreNames tail is ${moreNames.tail.tail}")
    val yemore = "Alfred" :: moreNames.tail // "cons" short for construct
    println(s"moreNames tail is ${moreNames.tail.tail.tail}") // Nil
    println(s"yetmore is ${yemore}") // Nil
    // no "update" method in list, but there is "updated" -> makes a NEW LIST

  }
}
