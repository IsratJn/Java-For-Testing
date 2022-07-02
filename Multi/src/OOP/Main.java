package OOP;

public class Main {

	public static void main(String[] args) {
		
//		Coffee drink1 = new Coffee();
//		Coffee drink2 = new Coffee();
//		
//		drink1.price = 250;
//		drink1.name = "latte";
//		System.out.println("Drink 1 is: "+drink1.name);
//		drink1.milk("Put some milk");
//		System.out.println("It costs: "+ drink1.price);
//		
//		System.out.println();
//		
//		
//		drink2.price = 280;
//		drink2.name = "mocha";
//		System.out.println("Drink 2 is: "+drink2.name);
//		drink2.milk("Extra sugar with milk");
//		System.out.println("It costs: "+ drink2.price);
		
		
		Coffee drink1 = new Coffee("Mocha",280);
		
		System.out.println(drink1.name);
		System.out.println(drink1.price);
		
		
		
		
		
	}

}
