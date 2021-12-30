package aoc21

import scala.io.Source

object Day4_2 extends App {
  val lIter = Source.fromFile("AOCD4.txt").getLines
  val firstLine = lIter.next()
  val lList = lIter.toList.filter(str => str != "")
  val RowList =
    lList.map(item => item.trim.split(" +").toList.map(s => s.toInt))
  var BoardList = RowList.grouped(5).toList.map(item => new Board(item))
  var CompBoards: List[Board] = List()
  val Input = firstLine.split(",").map(s => s.toInt)
  var index = 0
  var bingoed: List[Int] = List()

  while (BoardList.nonEmpty) {
    val nextNum = Input(index)
    index = index + 1
    bingoed = nextNum :: bingoed
    CompBoards = CompBoards :::
      BoardList.filter(board => board.isComplete(bingoed))
    BoardList = BoardList.filter(board => !board.isComplete(bingoed))
  }
  println(bingoed(0) * CompBoards.last.sumUnmarked(bingoed))

}
