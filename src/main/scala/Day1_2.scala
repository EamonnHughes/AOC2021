package aoc21
import scala.io.Source

object Day1_2 extends App {
  println("hello eamonn(the best person)")
  var nOfHigher = 0

  val lList =
    Source.fromFile("inputAOCD1.1.txt").getLines.toList
  val lLength = lList.length

  for (i <- 0 to lLength - 4) {
    val n1 = lList(i).toInt
    val n2 = lList(i + 1).toInt
    val n3 = lList(i + 2).toInt
    val n4 = lList(i + 3).toInt
    val sum1 = n1 + n2 + n3
    val sum2 = n2 + n3 + n4
    if (sum1 < sum2) {
      nOfHigher += 1
    }
  }
  println(nOfHigher)

}
