package aoc21

object Day1 extends App {
  println("hello world")
  var nOfHigher = 0

  val lList = List(
    0, 1, 2, 3, 2, 15, 3, 16, 17, 15
  )
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
