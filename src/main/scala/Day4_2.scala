package aoc21

import scala.io.Source

val cIndices = (0 to 4).toList

case class Board(rows: List[List[Int]]) {
  def check(Bingoed: List[Int]): Boolean = {
    def isBingo(int: Int) = Bingoed.contains(int)
    def isRowComplete(row: List[Int]) = row.forall(int => isBingo(int))
    def isColumnComplete(col: Int) = rows.forall(row => isBingo(row(col)))
    rows.exists(isRowComplete) || cIndices.exists(isColumnComplete)
  }
  def sumUnmarked(Bingoed: List[Int]): Int = {
    rows.map(row => row.filter(
      item => !Bingoed.contains(item)
    ).sum
    ).sum
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
  var isWon = false
  while (!isWon) {
    val nextNum = Input(index)
    bingoed = nextNum :: bingoed
    isWon = BoardList.exists(board => board.check(bingoed))
    index += 1
  }
  val wonBoard = BoardList.find(board => board.check(bingoed)).get
  println(bingoed(0) * wonBoard.sumUnmarked(bingoed))

}
