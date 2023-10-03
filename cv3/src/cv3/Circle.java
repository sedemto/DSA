package cv3;

public class Circle extends grObject{
	private int polomer;
	
	public int getPolomer() {
		return polomer;
	}

	public void setPolomer(int polomer) {
		this.polomer = polomer;
	}

	public Circle(int x, int y, int polomer) {
		super(x, y);
		this.polomer = polomer;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void vykresli() {
		System.out.println("KRESLIM KRUH: "+x+" "+y+ " polomer: "+polomer);
	}
	
	
}
