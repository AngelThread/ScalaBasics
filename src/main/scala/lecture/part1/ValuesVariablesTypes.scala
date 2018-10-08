package lecture.part1

object ValuesVariablesTypes extends App {

  // Vals are immutable
  // Types are vals are not mandatory
  //Compiler can infer types
  val x = 42
  println(x)

  val y: Int = 3
  val aString: String = "Hello!"
  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 10000
  val aLong: Long = 242424223232322L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.25

  var aVariable: Int = 4

  aVariable = 5 // side effects



}
