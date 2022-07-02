package Super2;

public class Car extends Vehicle{

	int maxspeed = 180;
	
	void display() {
		System.out.println(super.maxspeed);
	}
	
	
	//method overridden
	void move() {
		
		System.out.println("The car is the vehicle which is moving");
		super.move();
	}
}
