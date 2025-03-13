import scala.util.Random

class RandomPlayer(val name: String, oracle: Oracle, range: Int):
  private val rng = Random()

  def guess(): Boolean =
    val g = rng.nextInt(range) + 1
    val result = oracle.isCorrect(g)
    if result == 0 then
      println(s"$name guessed $g and won!")
      true
    else
      println(s"$name guessed $g")
      false
