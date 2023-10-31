package cz.vutbr.feec.cisla;

public class P09VypsaniTahuReseni {
	public static void main(String[] args) {
		int nahoru = 1;
		int dolu = 2;
		int doleva = 3;
		int doprava = 4;
		
		
		HraciPole h = new HraciPole();
		System.out.println("" + h + h.jeReseni());
		
		System.out.println(); // odradkuj
		h = h.klonujAPohni(nahoru);
		h = h.klonujAPohni(dolu);
		h = h.klonujAPohni(doleva);
		h = h.klonujAPohni(doprava);
		h = h.klonujAPohni(nahoru);
		System.out.println("" + h + h.jeReseni());
	}
}
