import lejos.robotics.subsumption.Behavior;


public class ObstacleBehaviour implements Behavior {

	private Robot robot;
	
	public ObstacleBehaviour(Robot robot) {
		this.robot = robot;
	}

	public boolean takeControl() {
		EnvironmentController environmentController = this.robot.getEnvironmentController();
		return environmentController.getSonar().getDistance() <= 15;
	}

	public void action() {
		MotorController motorController = robot.getMotorController();
		motorController.spinRight();
		motorController.forward(720);
		motorController.spinLeft();
		motorController.forward(960);
		motorController.spinLeft();
		motorController.forward(720);
		motorController.spinRight();
	}

	public void suppress() {
		robot.getMotorController().stop();
	}

}
