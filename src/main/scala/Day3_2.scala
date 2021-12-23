package aoc21

import scala.io.Source

object Day3_2 extends App {
  val lList = Source.fromFile("inputAOC3.1.txt").getLines.toList
  var cList = lList
  var nCList = lList

  def whichDigit(index: Int): Char = {
    val nOf1 = lList.count(str => str.charAt(index) == '1')
    if (nOf1 >= lList.length / 2) '1' else '0'
  }
  while (cList.length > 1) {
    for (index <- cList) {}
  }
}
