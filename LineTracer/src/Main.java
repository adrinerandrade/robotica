import lejos.nxt.Motor;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;


public class Main {
	
	public static void main(String[] args) {
		MotorController motorController = new MotorController(Motor.A, Motor.C, 200);
		EnvironmentController environmentController = new EnvironmentController();
		Robot robot = new Robot(motorController, environmentController);
		
		Arbitrator arbitrator = new Arbitrator(new Behavior[] {
				new WalkBehaviour(robot),
				new ObstacleBehaviour(robot)
		});
		arbitrator.start();
	}

}
