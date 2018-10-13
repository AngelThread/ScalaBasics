package lecture.part1

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 4))

  def aParameterlessFuction(): Int = 42

  println(aParameterlessFuction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else
      aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("hello", 3))

  def aBigFunction(a: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(a, a - 1)
  }

  println(aBigFunction(3))

  /**
    *
    * 1. a greeting function (name, age)  -> " Hi, my name is  &name and I am &age years old.
    * 2. Factorial function 1 * 2 * 3 * 4
    * 3. A Fibonacci function
    * f(1) = 1
    * f(2) = 1
    * f(n) = f(n-1) + f(n-2)
    * 4. test if a number is a prime
    */

  def aGreetingFuncion(name: String, age: Int): String = {
    s"Hi, my name is $name and I am $age years old"

  }

  println(aGreetingFuncion("Ugur", 34))

  def factorial(number: Int): Int = {
    if (number == 1) return number
    factorial(number - 1) * number
  }

  println(factorial(5))

  def fibonacci(number: Int): Int = {
    if (number == 1 || number == 2) return 1
    fibonacci(number - 1) + fibonacci(number - 2)
  }

  println("fibonacci:" + fibonacci(8))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    }

    isPrimeUntil(n / 2)
  }

  println(isPrime(7))
  println(isPrime(37))
  println(isPrime(2003))

  println(isPrime(8))

}
