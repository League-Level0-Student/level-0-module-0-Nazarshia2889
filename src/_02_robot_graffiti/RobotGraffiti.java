package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot dave = new Robot();
		dave.setSpeed(100);
		dave.penDown();
		dave.turn(45);
		dave.move(200);
		dave.turn(90);
		dave.move(200);
		dave.turn(180);
		dave.move(100);
		dave.turn(-45);
		dave.move(150);
		
	}

}
