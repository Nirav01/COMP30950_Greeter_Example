import scala.util.Random

class Oracle(range: Int):
  private val secret = Random().nextInt(range) + 1

  def isCorrect(guess: Int): Int =
    if guess == secret then 0 else 1