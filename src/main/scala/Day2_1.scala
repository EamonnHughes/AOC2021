package aoc21

import scala.io.Source

object Day2_1 extends App {
  val lList = Source.fromFile("inputAOCD2.1.txt").getLines.toList
  val lLength = lList.length

  var pX = 0
  var pY = 0
  var total = 0

  for (i <- 0 to lLength - 1) {
    val s = lList(i).toString
    val mX = "forward"
    val Up = "up"
    val Down = "down"
    if (s contains mX) {
      pX += 1
    } else if (s contains Up) {
      pY += 1
    } else {
      total += 1
    }
  }
  //total = pX * pY
  println(s" $pX" + s" $pY" + s" $total")

}
