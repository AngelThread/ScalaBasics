package lecture.part1

object StringOps extends App {

  val str: String = "Hello, I am learning Scala"
  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.toUpperCase())
  println(str.length)
  println(str.length())

  val aNumString = "3"
  val aNum = aNumString.toInt
  println(aNum)
  println('a' + aNumString)
  println('a' +: aNumString)
  println(aNumString :+ 's')
  println(str.reverse)
  println(str.take(4))

  //Scala-specific:String interpolators.

  //S-interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name, and I am $age years old!"
  val anotherGreeting = s"Hello, my name is $name, and I am ${age + 1} years old!"

  println(greeting)
  println(anotherGreeting)

  //F-interpolators

  val speed = 1.2f

  val myth = f"$name can eat $speed%2.2f burgers"

  println(myth)

  // raw-interpolator

  println(raw"This is a \n newline")
  private val escaped = "This is a \n newline"
  println(escaped)
  println(raw"$escaped")


}
