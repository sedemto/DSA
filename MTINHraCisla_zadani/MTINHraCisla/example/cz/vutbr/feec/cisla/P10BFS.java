package cz.vutbr.feec.cisla;

import java.util.Random;

public class P10BFS {
	public static void main(String[] args) {
		int nahoru = 1;
		int dolu = 2;
		int doleva = 3;
		int doprava = 4;
		HraciPole h = new HraciPole();
		Random rnd = new Random();
		for (int i = 0; i < 100000; i++) {
			// nahodne cislo 0 - 3
			int nahodne = rnd.nextInt(4);
			h.pohni(1 + nahodne);
		}
		System.out.println(h);
		BFS bfs = new BFS();
		bfs.vypisTahy(h);
		
	}
}
