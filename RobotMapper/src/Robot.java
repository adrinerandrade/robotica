import lejos.nxt.NXTRegulatedMotor;

public class Robot {

	private final NXTRegulatedMotor leftMotor;
	private final NXTRegulatedMotor rightMotor;
	private final MechanicalArm mechanicalArm;
	
	public Robot(NXTRegulatedMotor leftMotor, NXTRegulatedMotor rightMotor, MechanicalArm mechanicalArm) {
		this.leftMotor = leftMotor;
		this.rightMotor = rightMotor;
		this.mechanicalArm = mechanicalArm;
	}
	
	public void move(String direction) {
		if (direction.equals(Direction.Move.FRONT)) {
			leftMotor.rotate(RobotSpecs.SPEED, true);
			rightMotor.rotate(RobotSpecs.SPEED);
		} else if (direction.equals(Direction.Move.BACK)) {
			leftMotor.rotate(-RobotSpecs.SPEED, true);
			rightMotor.rotate(-RobotSpecs.SPEED);
		}
	}
	
	public void rotate(String direction) {
		if (direction.equals(Direction.Rotate.LEFT)) {
			leftMotor.rotate(-RobotSpecs.ROTATE_SPEED, true);
			rightMotor.rotate(RobotSpecs.ROTATE_SPEED);
		} else if (direction.equals(Direction.Rotate.RIGHT)) {
			leftMotor.rotate(RobotSpecs.ROTATE_SPEED, true);
			rightMotor.rotate(-RobotSpecs.ROTATE_SPEED);
		}
	}
	
	public MechanicalArm getMechanicalArm() {
		return this.mechanicalArm;
	}
	
}
