package java_pkg;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bicycle bicycle = new Bicycle();
		
		bicycle.changeGear(2);
		bicycle.speedUp(3);
		bicycle.applyBreaks(1);
		
		bicycle.printStates();

	}

}
