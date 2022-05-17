package java_pkg;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Car("Vespa");
		Bicycle bicycle = new Bicycle("Harculis", 18000);
	    
	    Garage garage = new Garage(car);
	    Garage garage_4_cycle = new Garage(bicycle);
	    
	}
}
