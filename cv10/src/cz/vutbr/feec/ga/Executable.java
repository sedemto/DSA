package cz.vutbr.feec.ga;

import java.io.IOException;
import java.util.LinkedList;

public class Executable {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Populace p = new Populace();
		for(int i = 0; i < 300;i++) {
			p.evolution();
			if(i % 50 == 0) {
				ShowChromozome.show(p.getPop().getFirst(), "best"+i);
				System.out.println(p.best_fitness);
			}
		
		}
		ShowChromozome.show(p.getPop().getFirst(), "best");
		System.out.println("bestf: "+p.best_fitness);
	}

}
