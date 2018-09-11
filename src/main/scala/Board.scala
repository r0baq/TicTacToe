object Board {

  private val data = Array.ofDim[Player.Value](3, 3)
  private var currentPlayer = Player.O
  private var description = ""

  updateDescription

  def printBoard() = {
    printRow(data(0))
    println("-----")
    printRow(data(1))
    println("-----")
    printRow(data(2))
  }

  def isWon(): Boolean = isWon(Player.O) || isWon(Player.X)

  def getDescription() = description
  def getData(x: Int, y: Int) = {
    val result = data(x)(y);
    if (result != null) result.toString else ""
  }

  def add(read: String) = {
    val numbers = read.split(" ")
    data(numbers(0).toInt)(numbers(1).toInt) = currentPlayer
    changePlayer()
  }

  private def changePlayer() = {
    if (currentPlayer == Player.O) currentPlayer = Player.X else currentPlayer = Player.O
    updateDescription
  }
  private def updateDescription = description = "Gracz '" + currentPlayer + "' wybiera pole"

  private def printRow(row : Array[Player.Value]) = println(printCell(row(0)) + "|" + printCell(row(1)) + "|" + printCell(row(2)))

  private def printCell(cell: Player.Value) = if (cell == null) " " else cell

  private def isWon(player : Player.Value) =
    horizontal(player, 0) || horizontal(player, 1) || horizontal(player, 2) || vertical(player, 0)|| vertical(player, 1) || vertical(player, 2) ||
      diagonalFirst(player) || diagonalSecond(player)

  private def horizontal(player: Player.Value, row: Int) =
    data(row)(0) == player && data(row)(1) == player && data(row)(2) == player

  private def vertical(player: Player.Value, column: Int) =
    data(0)(column) == player && data(1)(column) == player && data(2)(column) == player

  private def diagonalFirst(player: Player.Value) =
    data(0)(0) == player && data(1)(1) == player && data(2)(2) == player

  private def diagonalSecond(player: Player.Value) =
    data(2)(0) == player && data(1)(1) == player && data(0)(2) == player
}
