package aoc21

import scala.io.Source

object Day4_1 extends App {
  val lIter = Source.fromFile("AOCD4.txt").getLines
  val firstLine = lIter.next()
  val lList = lIter.toList
  val Input = firstLine.split(",")
  println(Input.mkString(","))
  println(lList)

}
