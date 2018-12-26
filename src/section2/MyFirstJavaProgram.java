package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		// START HERE
		Robot Ultron = new Robot();
		Ultron.setPenColor(Color.cyan);
		Ultron.setPenWidth(5);
		Ultron.penDown();
		Ultron.setSpeed(200);
		for (int x = 0; x < 4; x++) {
			Ultron.move(100);
			Ultron.turn(90);
		}

	}
}