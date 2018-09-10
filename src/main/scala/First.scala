import scala.swing._
import scala.swing.event.ButtonClicked

object First extends SimpleSwingApplication {
  def top = new MainFrame {
    title = "Kółko i krzyżyk"
    preferredSize = new Dimension(400, 240)

    val button1 = new Button()
    val button2 = new Button()
    val button3 = new Button()
    val button4 = new Button()
    val button5 = new Button()
    val button6 = new Button()
    val button7 = new Button()
    val button8 = new Button()
    val button9 = new Button()

    val label = new Label{ text = "The button hasn't been clicked yet" }

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
          println("1")
          Board.add("0 0")
          button1.text = Board.getData(0, 0)
        }
        if (b == button2) {
          println("2")
          Board.add("0 1")
          button2.text = Board.getData(0, 1)
        }
      }
    }
  }
}