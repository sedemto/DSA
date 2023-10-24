package cv6;

public class Executable {

	public static void main(String[] args) {
		Graph g = new Graph();
		g.add("1","7",16);
		g.add("1","6",6);
		g.add("6","5",5);
		g.add("6","7",8);
		
		Road c = new Road(g,"1");
		c.addNode("6");
		c.addNode("5");
		int cost = c.getCost();
		System.out.println(cost);
		c.printRoad();

	}

}
