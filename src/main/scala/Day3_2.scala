package aoc21

import scala.io.Source

object Day3_2 extends App {
  val lList = Source.fromFile("inputAOC3.1.txt").getLines.toList
  var cList = lList
  var nCList = lList
  var indexA = 0
  var indexB = 0
  def mostCommonDigitAtIndex(
      index: Int,
      strings: List[String],
      dDigit: Char
  ): Char = {
    val nOf1 = strings.count(str => str.charAt(index) == '1')
    val nOf0 = strings.length - nOf1
    if (nOf1 > nOf0) '1'
    else if (nOf1 < nOf0) '0'
    else dDigit
  }
  while (cList.length > 1) {
    val mC = mostCommonDigitAtIndex(indexA, cList, '1')
    cList = cList.filter(str => str.charAt(indexA) == mC)
    indexA += 1
  }
  while (nCList.length > 1) {
    val mC = mostCommonDigitAtIndex(indexB, nCList, '1')
    nCList = nCList.filterNot(str => str.charAt(indexB) == mC)
    indexB += 1
  }

  val x1 = Integer.parseInt(cList(0), 2)

  val x2 = Integer.parseInt(nCList(0), 2)
  println(x1 * x2)
}
