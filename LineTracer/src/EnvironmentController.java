import lejos.nxt.ColorSensor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;


public class EnvironmentController {

	private ColorSensor lightSensorLeft = new ColorSensor(SensorPort.S2);
	private ColorSensor lightSensorRight = new ColorSensor(SensorPort.S3);
	private UltrasonicSensor sonar = new UltrasonicSensor(SensorPort.S4);
	
	public ColorSensor getLightSensorLeft() {
		return lightSensorLeft;
	}
	public ColorSensor getLightSensorRight() {
		return lightSensorRight;
	}
	public UltrasonicSensor getSonar() {
		return sonar;
	}
	
}
