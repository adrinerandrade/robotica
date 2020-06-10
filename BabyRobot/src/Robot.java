import lejos.nxt.NXTRegulatedMotor;
import lejos.nxt.UltrasonicSensor;

public class Robot {

	private final NXTRegulatedMotor shoulderMotor;
	private final NXTRegulatedMotor elbowMotor;
	private final UltrasonicSensor distanceSensor;
	
	private int currentState;
	
	public Robot(NXTRegulatedMotor shoulderMotor, NXTRegulatedMotor elbowMotor, UltrasonicSensor distanceSensor) {
		this.shoulderMotor = shoulderMotor;
		this.elbowMotor = elbowMotor;
		
		this.shoulderMotor.stop();
		this.elbowMotor.stop();
		
		this.shoulderMotor.setSpeed(RobotSpecs.MOTOR_SPEED);
		this.elbowMotor.setSpeed(RobotSpecs.MOTOR_SPEED);
		
		this.distanceSensor = distanceSensor;
		this.currentState = 2; // -45 +45
	}
	
	public void doAction(int actionId) {
		Action action = Action.getActions()[actionId];
		this.rotate(action.member, action.angle);
	}
	
	public int getState() {
		return this.currentState;
	}
	
	private void rotate(String member, int angle) {
		if (Members.ELBOW.equals(member)) {
			this.elbowMotor.rotate(-angle);
			
			//State currentState = State.getStates()[getState()];
			//this.currentState = State.getStateId(currentState.getShoulderDegree(), currentState.getElbowDegree() + angle);
		} else if (Members.SHOULDER.equals(member)) {
			this.shoulderMotor.rotate(-angle);
			
			//State currentState = State.getStates()[getState()];
			//this.currentState = State.getStateId(currentState.getShoulderDegree() + angle, currentState.getElbowDegree());
		}
	}
	
	public int getDistance() {
		return this.distanceSensor.getDistance();
	}
	
}
