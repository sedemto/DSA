package cv6;

import java.util.ArrayList;

public class Road {
	private int cost = 0;
	private Graph g;
	private ArrayList<String> road = new ArrayList<String>();
	private String previous;
	public Road(Graph g,String nodeName) {
		super();
		this.g = g;
		this.road.add(nodeName);
		this.previous = nodeName;
	}
	public void addNode(String nodeName) {
		road.add(nodeName);
		this.cost += g.getCostBetweenNodes(previous, nodeName);
		this.previous = nodeName;
		
	}
	public int getCost() {
		return cost;
	}
	public void printRoad() {
		for (String string : road) {
			System.out.print(string+" ");
		}
	}
	
	
	
	
}
