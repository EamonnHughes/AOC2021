package aoc21

object Invest extends App {

  var mo = 01
  var invest = 0.0
  var depos = 3000.0
  var perc = .1
  while (mo <= 300) {
    invest += depos
    invest += invest * perc / 12
    mo += 1
  }
  println(invest.toInt)
  println((invest * (.06/12)).toInt)
}
