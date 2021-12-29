package aoc21

import scala.io.Source

val Indices = (0 to 4).toList

case class Board(rows: List[List[Int]]) {
  def check(Bingoed: List[Int]): Boolean = {

      Indices.exists(
      rows.forall(row => Bingoed.contains(row()))
      )
      rows.exists(row => row.forall(int => Bingoed.contains(int)))
  }
}

object Day4_1 extends App {
  val lIter = Source.fromFile("AOCD4.txt").getLines
  val firstLine = lIter.next()
  val lList = lIter.toList.filter(str => str != "")
  val RowList =
    lList.map(item => item.trim.split(" +").toList.map(s => s.toInt))
  val BoardList = RowList.grouped(5).toList.map(item => new Board(item))
  val Input = firstLine.split(",").map(s => s.toInt)
  var index = 0
  var bingoed: List[Int] = List()
  while (1 == 1) {
    val nextNum = Input(index)

    bingoed = nextNum :: bingoed
    index += 1
  }
  for (i <- 0 until BoardList.length) {
    println(BoardList(i))
  }

}
