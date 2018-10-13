package playground

import scala.annotation.tailrec

object Recursion extends App {

  def factiorial(n: Int): Int = {
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n - 1))
      val result = n * factiorial(n - 1)
      println("Computed factorial of " + n)
      result
    }

  }

  //println(factiorial(5000)) // Stackoverflow error
  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) //TAIL recursion = use recursive call as the LAST expression

    factHelper(n, 1)
  }

  println(anotherFactorial(5000)) // No Stackoverflow error

  // When you need loop, use tail recursive

  /**
    * 1. Concatenate a string n times
    * 2. IsPrime function tail recursive
    * 3. Fibonaci function, tail recursive
    *
    */

  def concatenateThis(string: String, times: Int): String = {
    @tailrec
    def factHelper(string: String, times: Int, load: String): String = {
      if (times == 1) load
      else factHelper(string, times - 1, string + load)
    }

    factHelper(string, times, string)
  }

  println(concatenateThis("AV", 2))


  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    }

    isPrimeUntil(n / 2)
  }

  def isPrimeTailVersion(number: Int): Boolean = {
    @tailrec
    def helper(number: Int, carried: Int, t: Int): Boolean = {
      if (t <= 1) true
      else if (carried == 0) false
      else helper(number, number % t, t - 1)
    }

    helper(number, number, number / 2)
  }

  println(isPrimeTailVersion(70))

  def fibonacciTailRecursionVersion(n: Int): Int = {
    @tailrec
    def helper(num: Int, index: Int, reachedNumber: Int, following: Int): Int = {
      if (index == num) reachedNumber
      else helper(num, index + 1, reachedNumber + following, reachedNumber);
    }

    helper(n, 1, 1, 0);
  }

  def fibonacci(number: Int): Int = {
    if (number == 1 || number == 2) return 1
    fibonacci(number - 1) + fibonacci(number - 2)
  }

  println("fibonacciTailRecursionVersion:" + fibonacciTailRecursionVersion(78))
}

