import lejos.nxt.Motor;
import lejos.nxt.SensorPort;


public class Main {
	
	public static void main(String[] args) {
		MechanicalArm mechanicalArm = new MechanicalArm(Motor.B, SensorPort.S1);
		Robot robot = new Robot(Motor.A, Motor.C, mechanicalArm);
		
		System.out.print("NORTH -");
		System.out.println(robot.getVirtualCompass().getCurrentOrientation());
		robot.rotate(Direction.Rotate.LEFT);
		System.out.print("WEST -");
		System.out.println(robot.getVirtualCompass().getCurrentOrientation());
		robot.rotate(Direction.Rotate.LEFT);
		System.out.print("SOUTH -");
		System.out.println(robot.getVirtualCompass().getCurrentOrientation());
		robot.rotate(Direction.Rotate.LEFT);
		System.out.print("EAST -");
		System.out.println(robot.getVirtualCompass().getCurrentOrientation());
		robot.rotate(Direction.Rotate.RIGHT);
		System.out.print("SOUTH -");
		System.out.println(robot.getVirtualCompass().getCurrentOrientation());
		robot.rotate(Direction.Rotate.RIGHT);
		System.out.print("WEST -");
		System.out.println(robot.getVirtualCompass().getCurrentOrientation());
		robot.rotate(Direction.Rotate.LEFT);
		System.out.print("SOUTH -");
		System.out.println(robot.getVirtualCompass().getCurrentOrientation());
		robot.rotate(Direction.Rotate.LEFT);
		System.out.print("EAST -");
		System.out.println(robot.getVirtualCompass().getCurrentOrientation());
		robot.rotate(Direction.Rotate.LEFT);
		System.out.print("NORTH -");
		System.out.println(robot.getVirtualCompass().getCurrentOrientation());
		robot.rotate(Direction.Rotate.LEFT);
		System.out.print("WEST -");
		System.out.println(robot.getVirtualCompass().getCurrentOrientation());
		robot.rotate(Direction.Rotate.RIGHT);
		System.out.print("NORTH -");
		System.out.println(robot.getVirtualCompass().getCurrentOrientation());
		robot.rotate(Direction.Rotate.RIGHT);
		System.out.print("EAST -");
		System.out.println(robot.getVirtualCompass().getCurrentOrientation());
		robot.rotate(Direction.Rotate.RIGHT);
		System.out.print("SOUTH -");
		System.out.println(robot.getVirtualCompass().getCurrentOrientation());
		robot.rotate(Direction.Rotate.RIGHT);
		System.out.print("WEST -");
		System.out.println(robot.getVirtualCompass().getCurrentOrientation());
		
		while (true);
		
		/*Mapping graph = new Mapping(robot);
		System.out.println(graph);
		while (true);*/
	}

}
