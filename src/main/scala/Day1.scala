package aoc21
import scala.io.Source

object Day1 extends App {
  println("hello world")
  var nOfHigher = 0

  val lList =
    Source.fromFile("https://adventofcode.com/2021/day/1/input").getLines.toList
  val lLength = lList.length

  for (i <- 0 to lLength - 2) {
    val nFirst = lList(i)
    val nSecond = lList(i + 1)
    if (nFirst < nSecond) {
      nOfHigher += 1
    }
  }
  println(nOfHigher)

}
