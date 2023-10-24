package cv6;

import java.util.HashMap;

public class Node {
	private String value;
	private HashMap<Node,Integer> neighbours = new HashMap<Node,Integer>();
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	public void addNeighbour(Node neighbour, int cost) {
		this.neighbours.put(neighbour, cost);
	}

	public HashMap<Node, Integer> getNeighbours() {
		return neighbours;
	}

}
