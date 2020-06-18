class Person {
  var name = ""

  override def toString: String = name
}

object Person {
  def apply(name: String): Person = {
    var p = new Person
    p.name = name
    p
  }
}

val s = Person("Jack Sparrow")
println(s)