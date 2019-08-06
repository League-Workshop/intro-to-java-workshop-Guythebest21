package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
Robot hamoshe = new Robot();
hamoshe.setPenColor(100,200,210);
hamoshe.setSpeed(100);
	hamoshe.penDown();
	
	
	
	for(int i=0; i<4; i++) {
		hamoshe.move(200);
		hamoshe.turn(90);
	}

		
	}
}
