

import lejos.robotics.subsumption.Behavior;

public class WalkBehaviour implements Behavior {

	private static final int LIGHT_TRESHOLD = 180; 
	
	private Robot robot;
	
	public WalkBehaviour(Robot robot) {
		this.robot = robot;
	}
	
	public boolean takeControl() {
		return true;
	}

	public void action() {
		EnvironmentController environment = this.robot.getEnvironmentController();
		MotorController motorController = robot.getMotorController();
		int lightSensorLeft = environment.getLightSensorLeft().getLightValue();
		int lightSensorRight = environment.getLightSensorRight().getLightValue();
		boolean isOnLineLeft = lightSensorLeft <= LIGHT_TRESHOLD;
		boolean isOnLineRight = lightSensorRight <= LIGHT_TRESHOLD;
		if (isOnLineLeft) {
			motorController.turnLeft();
		} else if (isOnLineRight) {
			motorController.turnRight();
		} else {
			motorController.forward();
		}
	}

	public void suppress() {
		this.robot.getMotorController().stop();
	}

}
