object Board {
  private val data = Array.ofDim[Char](3, 3);
  private var currentPlayer = 'O';

  def printBoard() = {
    data.foreach(row => {
      println(row(0) + '|' + row(1) + '|' + row(2))
      println("---")
    })
  }

  def isWon(): Boolean = isWon(1) || isWon(2)

  def printPlayer() = println("Gracz '" + currentPlayer + "' wybiera pole: ")

  private def isWon(player : Int) = {
    horizontal(player, 0) || horizontal(player, 1) || horizontal(player, 2) || vertical(player, 0)|| vertical(player, 1) || vertical(player, 2) ||
      diagonalFirst(player) || diagonalSecond(player)
  }

  private def horizontal(player: Int, row: Int) =
    data(row)(0) == player && data(row)(1) == player && data(row)(2) == player

  private def vertical(player: Int, column: Int) =
    data(0)(column) == player && data(1)(column) == player && data(2)(column) == player

  private def diagonalFirst(player: Int) =
    data(0)(0) == player && data(1)(1) == player && data(2)(2) == player

  private def diagonalSecond(player: Int) =
    data(2)(0) == player && data(1)(1) == player && data(0)(2) == player
}
