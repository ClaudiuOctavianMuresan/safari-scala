package functions

object FirstClassFunctions {
  // Operation of this kind "bucket, operation, make new bucket from each item and the operation"
  // Functor
  // operation is usually called map
  def doToAList[T, U](list: List[T])(op: T => U): List[U] = list match {
    case Nil => Nil
    case h :: t => op(h) :: doToAList(t)(op)
  }

  def main(args: Array[String]): Unit = {

    val names = List("Fred", "Jim", "Sheila")
//    val shouted = doToAList(names, (s: String) => s.toUpperCase())
    val shouted = doToAList(names)(s => s.toUpperCase())
    println("> " + shouted)
    doToAList(doToAList(names){
      s => s.toUpperCase()
    })(s => println(">> " + s))

    names.map(s => s.toUpperCase).foreach(s => println(s))
  }
}
