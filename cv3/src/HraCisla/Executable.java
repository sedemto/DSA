package HraCisla;

import java.util.HashSet;
import java.util.TreeSet;

public class Executable {

	public static void main(String[] args) {
		var b1 = new Board();
		var b2 = new Board();
		b1.moveUp();
		b2.moveUp();
		//b2.moveDown();
		
		b1.printBoard();
		b2.printBoard();
		
		
		TreeSet<Board> mnozina = new TreeSet<>();
		mnozina.add(b1);
		mnozina.add(b2);
		//System.out.println(b1.equals(b2));
		//System.out.println(b2.equals(b1));
		System.out.println(b1.compareTo(b2));
		System.out.println(b2.compareTo(b1));
		
		System.out.println(mnozina.size());
	}
}

