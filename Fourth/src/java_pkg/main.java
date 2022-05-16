package java_pkg;

public class main {

	public static void main(String[] args) {
		
		Coffee order1 = new Coffee();//Coffee class er under a obj banailam
		Coffee order2 = new Coffee();
		
		
//		obj1.milk = "no milk";
//		obj1.type ="Americano";
//		obj1.price = 350;
//		
//		obj2.milk = "extra milk";
//		obj2.type ="Iced Latter";
//		obj2.price = 410;
		
		order1.order_details("Americano", 350, "no milk");
		order2.order_details("Iced Latte", 410, "extra milk");
		
		
		
	}

}
