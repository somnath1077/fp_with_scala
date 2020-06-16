import DataStructures.{Cons, List, Nil}

object Main {

  def main(args: Array[String]): Unit = {
    val x1: List[Int] = Cons(1, Cons(2, Cons(3, Nil)))
    val x2: List[String] = Cons("a", Cons("b", Nil))
    println(x1)
    println(x2)
  }
}
