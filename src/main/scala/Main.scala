import DataStructures.{Cons, List, Nil}

object Main {

  def main(args: Array[String]): Unit = {
    val x1: List[Int] = Cons(1, Cons(2, Cons(3, Nil)))
    val x2: List[String] = Cons("a", Cons("b", Nil))
    println(x1)
    println(x2)
    val x = List(1, 2, 3, 4, 5) match {
      case Cons(x, Cons(2, Cons(4, _))) => x
      case Nil => 42
      case Cons(x, Cons(y, Cons(3, Cons(4, _)))) => x + y
      case Cons(h, t) => h + List.sum(t)
      case _ => 101
    }
    println(x)

    println(List.fill("hello", 5))
    println(List.head(Cons(1, Nil)))
    // println(List.head(Nil))
    // println(List.tail(Nil))
    println(List.tail(Cons(1, Cons(2, Nil))))
  }
}
