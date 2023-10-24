package cv6;

import java.util.HashMap;

public class Graph {
	private HashMap<String,Node> nodes = new HashMap<String,Node>();
	
	public void add(String node1, String node2, int cost) {
		Node u1 = newOrExisting(node1);
		Node u2 = newOrExisting(node2);
		u2.setValue(node2);
		u1.setValue(node1);
		u1.addNeighbour(u2, cost);
		u2.addNeighbour(u1, cost);
		
	}

	private Node newOrExisting(String nodeName) {
		if(nodes.containsKey(nodeName)) {
			
			return nodes.get(nodeName);
		}
		else {
			nodes.put(nodeName, new Node());
		}
		return nodes.get(nodeName);
	}
	public int getCostBetweenNodes(String node1,String node2) {
		int cost = nodes.get(node1).getNeighbours().get(nodes.get(node2));
		return cost;

	}
}
