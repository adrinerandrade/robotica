
public class Robot {

	private MotorController motorController;
	private EnvironmentController environmentController;
	
	public Robot(MotorController motorController, EnvironmentController environmentController) {
		this.motorController = motorController;
		this.environmentController = environmentController;
	}

	public MotorController getMotorController() {
		return motorController;
	}

	public EnvironmentController getEnvironmentController() {
		return environmentController;
	}
	
}
