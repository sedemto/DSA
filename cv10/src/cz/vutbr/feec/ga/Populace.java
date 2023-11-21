package cz.vutbr.feec.ga;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TreeMap;

public class Populace {
	private LinkedList<Chromozome> populace = new LinkedList<Chromozome>();
	public int best_fitness = 1000000000;
	public LinkedList<Chromozome> getPop() {
		return this.populace;
	}
	public void setPop(LinkedList<Chromozome> pop) {
		this.populace = pop;
	}
	
	public void createPop() {
		for(int i=0; i < 50;i++) {
			Chromozome ch = new Chromozome();
			ch.mutateAll();
			this.populace.add(ch);
		}
	}
	public Populace() {
		createPop();
	}
	
	
	public void tournament() throws IOException {
		TreeMap<Integer,Chromozome> fit_fncs = new TreeMap<Integer,Chromozome>();
		Fitness fitness  = new Fitness("image/orloj.jpg");
		for (Chromozome ch : this.populace) {
			int error = fitness.getFitness(ch);
			fit_fncs.put(error, ch);
		}
		LinkedList<Chromozome> best = new LinkedList<Chromozome>();
		int i =0;
		for (Entry<Integer, Chromozome> entry : fit_fncs.entrySet()) {
			if(i == 0 && entry.getKey() < best_fitness) {
				this.best_fitness = entry.getKey();
			}
			if(i < 50) {
			best.add(entry.getValue());
			}
			i++;
		}
		this.populace = best;
	}
	
	public void evolution() throws IOException {
		Random rnd = new Random();
		// mutovanie a pridanie 25
		for(int i = 0; i < 25;i++) {
			int random = rnd.nextInt(25);
			Chromozome ch = this.populace.get(random);
			Chromozome ch1 = ch.cloneChromozome();
			ch1.mutace();
			this.populace.add(ch1);
		}
		// krizenie a pridanie 25
		for(int i = 0; i < 25;i++) {
			int random = rnd.nextInt(25);
			Chromozome ch1 = this.populace.get(random);
			Chromozome ch2 = this.populace.get(random);
			Chromozome ch1Clone = ch1.cloneChromozome();
			Chromozome ch2Clone = ch2.cloneChromozome();
			ch1Clone.crossOver(ch2Clone);
			this.populace.add(ch1Clone);
		}
		tournament();
	}
}
