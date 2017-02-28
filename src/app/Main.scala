package app

import scala.collection.mutable.ArrayBuffer

/**
  * Created by sfujimoto on 2017/02/28.
  */
object Main {
  def main(args: Array[String]): Unit = println("hello world!")
  // language fundamentals

  val xmax, ymax = 100
  val a0 = 1; var b0 = 3; var c0 = 2.4

  println(xmax, ymax)
  println(a0, b0, c0)

  val (a, b, c) = (5, "Hello", 3.14)

  println(a, b, c)

  val s1 = "String"
  println(s1)

  val s2 = "My " + s1
  println(s2)

  val s3 = s1 + " " +  100
  println(s3)

  val s4 = 100.toString()
  println(s4)
  val s5 =
    """fist line
      |second line
    """
  println(s5)
  println("".isEmpty())

  println("abc".getBytes)
  println("abc".charAt(1))
  println("abc".length())

  println("Hello".intersect("world"))
  println("Hello" intersect "world")
  println("aaabbbccc".distinct)
  println("abcde".head)
  println("abcde".size)
  println("abcde".reverse)
  println("aBcDe".filter(x => x.isLower))

  //Variable Length Arrays
  val b2 = ArrayBuffer[Int]()
  b2 += 1
  println(b2)
  b2 += (1, 2, 3, 5)
  println(b2)
  b2 ++= Array(8, 13, 21)
  println(b2)

  b2.insert(2, 7, 8, 9)
  println(b2)

  val c2 = b2.toArray
  println("c2= ", c2.toBuffer)

  b2.trimEnd(5)
  println(b2)



}
