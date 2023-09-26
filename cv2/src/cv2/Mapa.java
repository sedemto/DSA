package cv2;

import java.util.Vector;

public class Mapa {
	private Vector<Car> cars = new Vector<Car>();
	
	public void addAuto(Car car) {
		cars.add(car);
	}
	
	
	public Car getAuto(int i) {
		return cars.get(i);
	}
	
	
	public void removeAuto(int i) {
		cars.remove(i);
	}
	
	
	public void removeAuto(Car car) {
		cars.remove(car);
	}
	
	
	public int getPocetAut() {
		return cars.size();
	}
	
	
	public void vypisVsechnaAuta() {
		for (Car car : cars) {
			System.out.println("Car: "+car.getName()+" "+car.getX()+", "+car.getY());
		}
	}
}
