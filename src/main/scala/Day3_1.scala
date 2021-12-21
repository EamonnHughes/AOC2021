package aoc21

import scala.io.Source

object Day3_1 extends App {
  val lList = Source.fromFile("inputAOC3.1.txt").getLines.toList
  var MoCom = ""
  var LeCom = ""
  for (i <- 0 to 11) {
    var numX = 0
    var numY = 0
    for (y <- 0 to lList.length - 1) {

      if (lList(y).charAt(i) == '0') {
        numX += 1
      } else {
        numY += 1
      }
    }
    if (numX > numY) {
      MoCom = MoCom.patch(i, "0", 0)
      LeCom = LeCom.patch(i, "1", 0)
    } else {
      MoCom = MoCom.patch(i, "1", 0)
      LeCom = LeCom.patch(i, "0", 0)
    }
  }
  val gam = Integer.parseInt(MoCom, 2).toInt
  val eps = Integer.parseInt(LeCom, 2).toInt
  println(gam)
  println(eps)
  println(gam * eps)

}
