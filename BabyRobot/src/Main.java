import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;


public class Main {

	public static void main(String[] args) throws InterruptedException {
		Robot robot = new Robot(Motor.B, Motor.A, new UltrasonicSensor(SensorPort.S1));
		
		for (int i = 0; i < 4; i++) {
			robot.doAction(3);
			robot.doAction(1);
			robot.doAction(2);
			robot.doAction(0);
		}
	}
	
}
