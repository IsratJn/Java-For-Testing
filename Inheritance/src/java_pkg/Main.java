package java_pkg;

public class Main {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		car1.speed = 50.5;
		car1.go();
		
		System.out.println("The speed of the car is: "+car1.speed);

	}

}
