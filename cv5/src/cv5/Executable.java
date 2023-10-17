package cv5;

public class Executable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree strom = new Tree();
		strom.add(7);
		strom.add(5);
		strom.add(14);
		strom.add(1);
		strom.add(6);
		strom.add(16);
		strom.add(10);
		
		System.out.println(strom.contains(51));
		strom.print();
		
		//strom.print();
	}

}
