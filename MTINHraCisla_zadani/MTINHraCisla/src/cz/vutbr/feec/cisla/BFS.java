package cz.vutbr.feec.cisla;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class BFS {
	public void vypisTahy(HraciPole zadani) {
		// TIP: Vyzkousejte s ruznyma strukturama
		HashSet<HraciPole> closed = new HashSet<HraciPole>();
		//TreeSet<HraciPole> closed = new TreeSet<HraciPole>();
		//LinkedList<HraciPole> closed = new LinkedList<HraciPole>();
	
		LinkedList<HraciPole> open = new LinkedList<HraciPole>();
		open.addLast(zadani);
		boolean run = true;
		while(run) {
			if(open.isEmpty()) {
				System.out.println("riesenie sa nenaslo"); run = false;
			}
			else {
				HraciPole tmp = open.pop();
				if(tmp.jeReseni()) {
					System.out.println("riesenie sa naslo"+tmp);run = false;
				}
				else {
					closed.add(tmp);
					for (int i = 1; i <= 4; i++) {
						HraciPole nove = tmp.klonujAPohni(i);
						if(nove != null && !closed.contains(nove)) {
							open.addLast(nove);
						}
				}
			}
		}
		
		

	}
	}
}
