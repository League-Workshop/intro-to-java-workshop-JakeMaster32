package section2;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	// 2. Create a new Robot
	Robot Ultron = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		Ultron.setSpeed(200);
		// 5. Set the pen width to 5
		Ultron.setPenWidth(200);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for (int x = 0; x < 4; x++) {
			// 7. Set the pen color to random
			Ultron.setRandomPenColor();

			// 1. Call the drawSquare() method
			drawSquare();
			// 8. Turn the robot 90 degrees to the right
			Ultron.turn(90);
		}
	}

	void drawSquare() {
		/* 3. Fill in the code to draw a square inside the method below. */
		Ultron.penDown();
		for (int x = 0; x < 4; x++) {
			Ultron.move(100);
			Ultron.turn(90);
		}

	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
