package aoc21

import scala.io.Source

object Day2_1 extends App {
  val lList = Source.fromFile("inputAOCD2.1.txt").getLines.toList

  val ForwardRE = "forward ([0-9]+)".r
  val UpRE = "up ([0-9]+)".r
  val DownRE = "down ([0-9]+)".r

  var pX = 0
  var pY = 0

  val lLup = lList.map {
    case ForwardRE(num) => num.toInt
    case UpRE(num)      => num.toInt
    case DownRE(num)    => num.toInt
  }
  for (i <- 0 to lList.length - 1) {
    if (lList(i) contains ("forward")) {
      pX += lLup(i)
    }
    if (lList(i) contains ("up")) {
      pY -= lLup(i)
    }
    if (lList(i) contains ("down")) {
      pY += lLup(i)
    }
  }

  println(pX * pY)

}
