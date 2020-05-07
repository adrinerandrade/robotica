import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Mapping {
	
	private final Robot robot; 
	private final Queue queue = new Queue();
	private final List visitedNodes = new LinkedList();
	
	public Mapping(Robot robot) {
		this.robot = robot;
	}

	/***
	 * @return The mapping result with the signature: Map<Node, List<Node>> 
	 */
	public Map map() {
		Map mappingResult = new HashMap(); 
		queue.push(new Node(0, 0));
		while (!queue.isEmpty()) {
			Node currentNode = (Node) queue.pop();
			visitedNodes.add(currentNode);
			
			List siblings = getSiblings(currentNode);
		}
		return mappingResult;
	}
	
	private List getSiblings(Node node) {
		String currentOrientation = robot.getVirtualCompass().getCurrentOrientation();
		LinkedList siblings = new LinkedList();
		if (currentOrientation.equals(Orientation.NORTH)) {
			siblings.add(new Node(node.getX() - 1, node.getY()));
			siblings.add(new Node(node.getX(), node.getY() + 1));
			siblings.add(new Node(node.getX() + 1, node.getY()));
			
		} else if (currentOrientation.equals(Orientation.EAST)) {
			siblings.add(new Node(node.getX(), node.getY() + 1));
			siblings.add(new Node(node.getX() + 1, node.getY()));
			siblings.add(new Node(node.getX(), node.getY() - 1));
			
		} else if (currentOrientation.equals(Orientation.SOUTH)) {
			siblings.add(new Node(node.getX() + 1, node.getY()));
			siblings.add(new Node(node.getX(), node.getY() - 1));
			siblings.add(new Node(node.getX() - 1, node.getY()));
			
		} else if (currentOrientation.equals(Orientation.WEST)) {
			siblings.add(new Node(node.getX(), node.getY() - 1));
			siblings.add(new Node(node.getX() - 1, node.getY()));
			siblings.add(new Node(node.getX(), node.getY() + 1));
			
		} else {
			throw new IllegalStateException("No valid orientation found.");
		}
		return siblings;
	}
	
}
