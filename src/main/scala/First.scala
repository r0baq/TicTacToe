import scala.swing._
import scala.swing.event.ButtonClicked

object First extends SimpleSwingApplication {
  def top = new MainFrame {
    title = "Kółko i krzyżyk"
    preferredSize = new Dimension(500, 240)

    val button1 = new Button()
    val button2 = new Button()
    val button3 = new Button()
    val button4 = new Button()
    val button5 = new Button()
    val button6 = new Button()
    val button7 = new Button()
    val button8 = new Button()
    val button9 = new Button()

    val label = new Label{ text = Board.getDescription() }

    contents = new GridPanel(4, 3) {
      contents += button1
      contents += button2
      contents += button3
      contents += button4
      contents += button5
      contents += button6
      contents += button7
      contents += button8
      contents += button9
      contents += label
      border = Swing.EmptyBorder(30, 30, 10, 30)
    }

    listenTo(button1)
    listenTo(button2)
    listenTo(button3)
    listenTo(button4)
    listenTo(button5)
    listenTo(button6)
    listenTo(button7)
    listenTo(button8)
    listenTo(button9)

    reactions += {
      case ButtonClicked(b) => {
        if (b == button1) {
          Board.add("0 0")
          button1.text = Board.getData(0, 0)
        }
        if (b == button2) {
          Board.add("0 1")
          button2.text = Board.getData(0, 1)
        }
        if (b == button3) {
          Board.add("0 2")
          button3.text = Board.getData(0, 2)
        }
        if (b == button4) {
          Board.add("1 0")
          button4.text = Board.getData(1, 0)
        }
        if (b == button5) {
          Board.add("1 1")
          button5.text = Board.getData(1, 1)
        }
        if (b == button6) {
          Board.add("1 2")
          button6.text = Board.getData(1, 2)
        }
        if (b == button7) {
          Board.add("2 0")
          button7.text = Board.getData(2, 0)
        }
        if (b == button8) {
          Board.add("2 1")
          button8.text = Board.getData(2, 1)
        }
        if (b == button9) {
          Board.add("2 2")
          button9.text = Board.getData(2, 2)
        }
        label.text = if (Board.isWon()) "Koniec" else Board.getDescription()
      }
    }
  }
}