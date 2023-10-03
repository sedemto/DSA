package cv3;

public class Square extends grObject {

	public Square(int x, int y, int dlzka) {
		super(x, y);
		this.dlzka = dlzka;
		// TODO Auto-generated constructor stub
	}

	private int dlzka;
	
	public int getDlzka() {
		return dlzka;
	}

	public void setDlzka(int dlzka) {
		this.dlzka = dlzka;
	}

	@Override
	public void vykresli() {
		System.out.println("KRESLIM STVOREC: "+x+" "+y+ " dlzka: "+dlzka);
		
	}
	

}
