import lejos.nxt.Motor;
import lejos.nxt.SensorPort;


public class Main {
	
	public static void main(String[] args) {
		MechanicalArm mechanicalArm = new MechanicalArm(Motor.B, SensorPort.S1);
		Robot robot = new Robot(Motor.A, Motor.C, mechanicalArm);
		
		robot.move(Direction.Move.FRONT);
		robot.move(Direction.Move.BACK);
		robot.rotate(Direction.Rotate.LEFT);
		robot.rotate(Direction.Rotate.RIGHT);
	
		System.out.println(robot.getMechanicalArm().hasObstacle(Direction.LEFT));
		System.out.println(robot.getMechanicalArm().hasObstacle(Direction.FRONT));
		System.out.println(robot.getMechanicalArm().hasObstacle(Direction.RIGHT));
	}

}
