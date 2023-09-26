package cv2;

import java.util.Vector;

public class Node {
	private Vector<Node> neighbours = new Vector<Node>();
	
	public void addNeighbour(Node node) {
		neighbours.add(node);
	}
	
	public Node getNode(int i){
		return neighbours.get(i);
	}
	
	public void printNodes() {
		for (Node node : neighbours) {
			System.out.println("Node: "+node);
		}
	}
	
	
	
	public void removeNode(int i) {
		neighbours.remove(i);
	}
	
	public void removeNode(Node node) {
		neighbours.remove(node);
	}
}
