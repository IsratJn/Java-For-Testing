package java_pkg;

public class Garage {

	Garage(Car carP){
		System.out.println("The name of the car is: "+carP.car_name);
	}
	
	Garage(Bicycle bicycle){
		System.out.println("The cycle "+bicycle.name+" costs "+bicycle.price);
	}
	
}
