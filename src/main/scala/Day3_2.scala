package aoc21

import scala.io.Source

object Day3_2 extends App {
  val lList = Source.fromFile("inputAOC3.1.txt").getLines.toList
  var MoCom = ""
  var cList = lList

  for (i <- 0 to 11) {

    var numX = 0
    var numY = 0
    var numZ = ' '
    for (y <- 0 to cList.length - 1) {

      if (cList(y).charAt(i) == '0') {
        numX += 1
      } else {
        numY += 1
      }

    }
    if (numX > numY) {
      numZ = '0'
    } else {
      numZ = '1'
    }
    cList = cList.filter(linX => linX.charAt(i) == numZ)

  }

  val ls = Integer.parseInt(cList(0), 2).toInt
  println(cList)
  println(ls)
}
