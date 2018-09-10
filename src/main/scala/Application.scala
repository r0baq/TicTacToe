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
  preferredSize = new Dimension(400, 240)

//  val button = new Button() {
//    text = "Click me"
//    action = {
//      println("RMR")
//    }
//  }

  val panel = new GridPanel(4, 3)
  panel.contents += Button(Board.getData(0, 0)) { Board.add("0 0"); Board.printBoard() }
  panel.contents += Button(Board.getData(0, 0)) { Board.add("0 0") }
  panel.contents += Button(Board.getData(0, 0)) { Board.add("0 0") }
  panel.contents += Button(Board.getData(0, 0)) { Board.add("0 0") }
  panel.contents += Button(Board.getData(0, 0)) { Board.add("0 0") }
  panel.contents += Button(Board.getData(0, 0)) { Board.add("0 0") }
  panel.contents += Button(Board.getData(0, 0)) { Board.add("0 0") }
  panel.contents += Button(Board.getData(0, 0)) { Board.add("0 0") }
  panel.contents += Button(Board.getData(0, 0)) { Board.add("0 0") }
  panel.contents += new Label("RMR1")
  contents = panel
}

object GuiProgramOne {
//  def main(args: Array[String]) {
//    val ui = new UI
//    ui.visible = true
//    println("End of main function")
//  }
}