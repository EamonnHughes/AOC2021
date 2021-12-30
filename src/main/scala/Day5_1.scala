package aoc21

import scala.io.Source

case class lines(first: List[Int], second: List[Int]) {
  def CheckIntersect(lineAgainst: lines): Boolean = {}
}

object Day5_1 extends App {

  val lList =
    Source.fromFile("5_1inp.txt").getLines.toList.map()
  val Input = lList.split(" -> ").map(s => s.toInt)
  println("EEEEEEEEE")
}
