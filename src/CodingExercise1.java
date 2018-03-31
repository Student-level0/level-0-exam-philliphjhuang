import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.setSpeed(10);

		// 3. ask the user what color they would like the Robot to draw

		// 4. use an if/else statement to set the pen color that the user requested
		// (minimum of 2 colors)

		// 2. set the pen width to 10
		rob.penDown();
		rob.setPenWidth(10);
		String x = JOptionPane.showInputDialog("What color would you like the robot to draw?");
		// 1. make the Robot draw a shape
		if (x.equalsIgnoreCase("red")) {
			rob.setPenColor(255, 0, 0);
			;

		} else if (x.equalsIgnoreCase("Blue")) {
			rob.setPenColor(0, 0, 255);

		} else {}

		for (int i = 0; i <= 3; i++) {
			rob.move(50);
			rob.turn(90);

		}
		rob.hide();
	}

}
