
@main def main: Unit = 
  val myGreeter = new Greeter("John")
  for (i <- 1 to 2)
    println(myGreeter.hi)
    println(myGreeter.bye)


