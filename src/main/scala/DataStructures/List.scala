package DataStructures

import scala.annotation.tailrec

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
    case Cons(0.0, _) => 0.0
    case Cons(x, xs) => x * product(xs)
  }

  def fill[A](a: A, n: Int): List[A] = {
    @tailrec
    def build(lst: List[A], n: Int): List[A] = {
      if (n <= 0) lst
      else build(Cons(a, lst), n - 1)
    }
    build(Nil, n)
  }

  def apply[A](as: A*): List[A] =
    if (as.isEmpty) Nil
    else Cons(as.head, apply(as.tail: _*))
}
