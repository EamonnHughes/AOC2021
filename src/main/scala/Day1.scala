package aoc21
import scala.io.Source

object Day1 extends App {
  println("hello eamonn(the best person)")
  var nOfHigher = 0

  val lList =
    Source.fromFile("inputAOCD1.1.txt").getLines.toList
  val lLength = lList.length

  for (i <- 0 to lLength - 2) {
    val nFirst = lList(i).toInt
    val nSecond = lList(i + 1).toInt
    if (nFirst < nSecond) {
      nOfHigher += 1
    }
  }
  println(nOfHigher)

}
