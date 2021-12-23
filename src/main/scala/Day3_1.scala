package aoc21

import scala.io.Source

object Day3_1 extends App {
  val lList = Source.fromFile("inputAOC3.1.txt").getLines.toList

  def whichDigit(index: Int): Char = {
    val nOf1 = lList.count(str => str.charAt(index) == '1')
    if (nOf1 >= lList.length / 2) '1' else '0'
  }

  val indices = (0 until 12).toList
  val digits = indices.map(index => whichDigit(index))
  val nDigits = digits.map(digit =>
    if (digit == '0') '1'
    else '0'
  )
  val totalA = Integer.parseInt(digits.mkString, 2)
  val totalB = Integer.parseInt(nDigits.mkString, 2)
  println(totalA * totalB)

}
