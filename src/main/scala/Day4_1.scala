package aoc21

import scala.io.Source

object Day4_1 extends App {
  val lIter = Source.fromFile("AOCD4.txt").getLines
  val firstLine = lIter.next()
  val lList = lIter.toList
  val Input = firstLine.split(",")
  var index = 0
  // while no bingo
  while (index < Input.length) {

    println(Input(index))
    index += 1
  }
  //if bingo
  if (1 == 1) {
    println("u " + 1)
  }

}
