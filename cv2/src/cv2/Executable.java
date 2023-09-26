package cv2;

public class Executable {

	public static void main(String[] args) {
		// CARS - example
		var car1 = new Car();
		var car2 = new Car();
		var car3 = new Car();
		var car4 = new Car();
		
		var map = new Mapa();
		map.addAuto(car1);
		map.addAuto(car2);
		map.addAuto(car3);
		map.addAuto(car4);
		
		
		// PACKETS - PRIKLAD 2
		var packet1 = new Packet();
		var packet2 = new Packet();
		var packet3 = new Packet();
		var packet4 = new Packet();
		
		packet1.setNext(packet2);
		packet2.setNext(packet3);
		packet3.setNext(packet4);
		
		
		// ADRESAR - PRIKLAD 3
		var adr1 = new Adresar();
		var adr2 = new Adresar();
		var adr3 = new Adresar();
		var adr4 = new Adresar();
		var adr5 = new Adresar();
		
		adr1.setLeft(adr4);
		adr1.setRight(adr2);
		
		adr2.setLeft(adr5);
		adr2.setRight(adr3);
		
		
		// UZEL - PRIKLAD 4
		var uzel1 = new Node();
		var uzel2 = new Node();
		var uzel3 = new Node();
		var uzel4 = new Node();
		var uzel5 = new Node();
		var uzel6 = new Node();
		
		uzel1.addNeighbour(uzel6);
		uzel1.addNeighbour(uzel2);
		uzel1.addNeighbour(uzel4);
		uzel1.addNeighbour(uzel5);
		
		uzel2.addNeighbour(uzel1);
		uzel2.addNeighbour(uzel3);
		uzel2.addNeighbour(uzel5);
		
		uzel5.addNeighbour(uzel4);
		
		//uzel1.printNodes();
		
		// HRACIPOLE - PRIKLAD 5
		
		// 1 = up, 2 = down, 3 = left, 4 = right
		
		var pole = new HraciPole();
		pole.initialize();
		pole.printBoard();
		
		pole.shiftZero(1);
		pole.printBoard();
		
		pole.shiftZero(3);
		pole.printBoard();
		
		pole.shiftZero(2);
		pole.shiftZero(2);
		pole.printBoard();
	}

}
