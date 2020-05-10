import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import lejos.nxt.Motor;
import lejos.nxt.SensorPort;


public class Main {
	
	public static void main(String[] args) {
		MechanicalArm mechanicalArm = new MechanicalArm(Motor.B, SensorPort.S1);
		Robot robot = new Robot(Motor.A, Motor.C, mechanicalArm);
		
		// Calibrar o sensor de distância
		/*
		while(true) {
			System.out.println(robot.getMechanicalArm().hasObstacle(Direction.FRONT));
		}
		*/
		
		// Calibrar a movimentação do robô
		/*
		robot.move(Direction.Move.FRONT);
		robot.move(Direction.Move.BACK);
		robot.rotate(Direction.Rotate.LEFT);
		robot.rotate(Direction.Rotate.RIGHT);
		
		robot.getMechanicalArm().hasObstacle(Direction.LEFT);
		robot.getMechanicalArm().hasObstacle(Direction.FRONT);
		robot.getMechanicalArm().hasObstacle(Direction.RIGHT);
		*/
		
		// Exucutar o mapeamento
		Mapping mapping = new Mapping(robot);
		Hashtable graph = mapping.map();
		System.out.println("----Output----");
		Enumeration vertexes = graph.keys();
		while (vertexes.hasMoreElements()) {
			Node vertex = (Node) vertexes.nextElement();
			System.out.println(vertex);
			System.out.print("=>");
			Iterator children = ((CustomSet) graph.get(vertex)).iterator();
			while (children.hasNext()) {
				System.out.print(children.next());
				System.out.print(",");
			}
			System.out.println();
		}
		while (true);
	}

}

