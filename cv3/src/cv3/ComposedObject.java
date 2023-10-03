package cv3;

import java.util.LinkedList;

public class ComposedObject extends grObject {
	private LinkedList<grObject> objects  = new LinkedList<>();

	public void addObjects(grObject object) {
		this.objects.add(object);
	}

	public ComposedObject(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void vykresli() {
		for (grObject gr : objects ) {
			gr.vykresli();
		}
		
	}
	

}
