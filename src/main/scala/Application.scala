import scala.io.StdIn

object Application {
  def main(args: Array[String]): Unit = {
    println("Start")
    Board.printBoard()

    while (!Board.isWon()) {
      Board.printPlayer()
      val read = StdIn.readLine()
      if ("abort".equals(read)) return
      println(read)
      Board.printBoard()
    }
  }
}
