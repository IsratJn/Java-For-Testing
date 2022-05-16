package java_pkg;

public class Coffee {
	
	String type;
	double price;
	String size;
	String milk;
	
	public void order_details(String type,double price, String milk ) {
		System.out.println("One "+type+" with "+milk+" will cost "+price);
	}
	
	public static void spill() {
		System.out.println("Damn! I spill the coffee");
	}
	

}
