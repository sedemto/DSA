package cv3;

import java.util.ArrayList;

public class Cansas {
	public Cansas(int length, int width) {
		super();
		this.width = width;
		this.length = length;
	}
	private int width;
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	private int length;
	
	
	private ArrayList<grObject> objects = new ArrayList<>();
	
	
	public void addToCansas(grObject object) {
		this.objects.add(object);
	}
	public void vytvorRastr(String name) {
		System.out.println("----OBJEKT "+name+" VYTVORENY----");
		for (grObject gr : objects ) {
			gr.vykresli();
		}
	}
}
