package cz.vutbr.feec.cisla;

public class P03KlonovaniPameti {
	public static void main(String[] args) {
		HraciPole g = new HraciPole();
		System.out.println("Original: \n" + g);

		int nahoru = 1;
		int dolu = 2;
		int dolava = 3;
		int doprava = 4;

		HraciPole g3 = g.klonujAPohni(nahoru);
		HraciPole g4 = g.klonujAPohni(dolu);
		HraciPole g5 = g.klonujAPohni(dolava);
		HraciPole g6 = g.klonujAPohni(doprava);
		/*
		 * // Vyzkousejte nahradit timto kodem predchozi radek a pozorujte efekt
		 * HraciPole g3 = g;
		 * g3.pohni(nahoru);
		 */
		
		System.out.println("Kopie s pohybem " + nahoru + " je: \n" + g3);
		System.out.println("Kopie s pohybem " + nahoru + " je: \n" + g4);
		System.out.println("Kopie s pohybem " + nahoru + " je: \n" + g5);
		System.out.println("Kopie s pohybem " + nahoru + " je: \n" + g6);
	}
}
