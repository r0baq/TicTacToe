import scala.io.StdIn

//object Application {
//  def main(args: Array[String]): Unit = {
//    println("Start")
//    Board.printBoard()
//
//    while (!Board.isWon()) {
//      Board.printPlayer()
//      val read = StdIn.readLine()
//      if ("abort".equals(read)) return
//      Board.add(read)
//      Board.printBoard()
//    }
//  }
//}

import scala.swing._

class UI extends MainFrame {
  title = "Kółko i krzyżyk"
  preferredSize = new Dimension(320, 240)
  contents = new GridPanel(4, 3) {
    contents += new Button()
    contents += new Button()
    contents += new Button()
    contents += new Button()
    contents += new Button()
    contents += new Button()
    contents += new Button()
    contents += new Button()
    contents += new Button()
    contents += new Label("A Label")
  }
}

object GuiProgramOne {
  def main(args: Array[String]) {

    Board.printPlayer()

    val ui = new UI
    ui.visible = true
    println("End of main function")
  }
}