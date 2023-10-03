package cv3;

public abstract class grObject {
	protected int x;
	protected int y;
	
	public grObject(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	public abstract void vykresli();
}
