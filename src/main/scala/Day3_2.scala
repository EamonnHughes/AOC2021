package aoc21

import scala.io.Source

object Day3_2 extends App {
  val lList = Source.fromFile("inputAOC3.1.txt").getLines.toList

  def whichDigit(index: Int): Char = {

    var higherNum = ' '
    val nOf1 = lList.count(str => str.charAt(index) == '1')
    return higherNum

  }
  println()

}
