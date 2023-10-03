package cv3;

public class Executable {

	public static void main(String[] args) {
		Cansas cansas = new Cansas(800,800);
		
		cansas.addToCansas(new Circle(10, 15,30));
		cansas.addToCansas(new Circle(22,4,14));
		cansas.addToCansas(new Square(50,50,30));
		
		ComposedObject composed = new ComposedObject(50, 50);
		composed.addObjects(new Circle(30,30,100));
		composed.addObjects(new Square(100,100,80));
		cansas.addToCansas(composed);
		
		cansas.vytvorRastr("obrazek.png");

	}

}
