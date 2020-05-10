import lejos.nxt.Motor;
import lejos.nxt.SensorPort;


public class Main {
	
	public static void main(String[] args) {
		MechanicalArm mechanicalArm = new MechanicalArm(Motor.B, SensorPort.S1);
		Robot robot = new Robot(Motor.A, Motor.C, mechanicalArm);
		
		Mapping mapping = new Mapping(robot);
		System.out.println(mapping.map());
		while (true);
	}

}
