package lecture.part1

object Expressions extends App {

  val x = 1 + 2 //Expressions
  println(x)

  println(2 + 4 * 5)
  // + - * | ^ << >> >>> (right shift with zero extension)

  println(1 == x)

  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= .... side effects
  println(aVariable)

  // Instructions (Do for example print this, send this to there)vs Expressions (Something that has value)

  // If expression

  val aCondition = true
  val aConditionValue = if (aCondition) 7 else 3 // IF expression

  println(aConditionValue)
  println(if (aCondition) 7 else 3)
  println(1 + 3)

  // Everything in Scala is an Expression!


  val aWeirdValue = (aVariable = 3) // Unit == void

  println(aWeirdValue) // Unit value

  //side effect: println(), whiles, reassigning

  // Code blocks

  val aCodeBlock = {

    val y = 2
    val z = y + 1
    if (z > 2) "hello" else "goodbye"
  }

  val aCodeBlockTwo = {

    val y = 2
    val z = y + 1
  }

  println(aCodeBlock)

  // 1. difference between "hello world" vs println("hello world")?
  // 2.

  val someValue = {
    2 < 3
  }
  println(someValue)

  val someOtherValue = {

    if (someValue) 239 else 986
    42

  }
  println(someOtherValue)

}
