import lejos.nxt.NXTRegulatedMotor;

public class MotorController {
	
	private final NXTRegulatedMotor leftMotor;
	private final NXTRegulatedMotor rightMotor;
	
	public MotorController(NXTRegulatedMotor leftMotor, NXTRegulatedMotor rightMotor) {
		this.leftMotor = leftMotor;
		this.rightMotor = rightMotor;
	}
	
	public MotorController(NXTRegulatedMotor leftMotor, NXTRegulatedMotor rightMotor, int speed) {
		this.leftMotor = leftMotor;
		this.rightMotor = rightMotor;
		
		leftMotor.setSpeed(speed);
		rightMotor.setSpeed(speed);
	}
	
	public void forward() {
		leftMotor.forward();
		rightMotor.forward();
	}
	
	public void forward(int degrees) {
		leftMotor.rotate(degrees);
		rightMotor.rotate(degrees);
	}
	
	public void backward() {
		leftMotor.backward();
		rightMotor.backward();
	}
	
	public void spinLeft() {
		leftMotor.rotate(280, true);
		rightMotor.rotate(-280);
	}
	
	public void spinRight() {
		rightMotor.rotate(280, true);
		leftMotor.rotate(-280);
	}
	
	public void turnLeft() {
		leftMotor.flt();
		rightMotor.forward();
	}
	
	public void turnRight() {
		leftMotor.forward();
		rightMotor.flt();
	}
	
	public void stop() {
		leftMotor.flt();
		rightMotor.flt();
	}
	
}
