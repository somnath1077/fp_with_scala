package DataStructures

abstract class List[+A]

case object Nil extends List[Nothing] {
  override def toString: String = "$"
}

case class Cons[+A](head: A, tail: List[A]) extends List[A] {
  override def toString: String = head.toString + "." + tail.toString
}

object List {
  def sum(ints: List[Int]): Int = ints match {
    case Nil => 0
    case Cons(x, xs) => x + sum(xs)
  }

  def product(ds: List[Double]): Double = ds match {
    case Nil => 1
    case Cons(x, xs) => x * product(xs)
  }

  def apply[A](as: A*): List[A] =
    if (as.isEmpty) Nil
    else Cons(as.head, apply(as.tail: _*))
}