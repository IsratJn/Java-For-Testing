package java_Koffee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Latte latte = new Latte();
		latte.setValue("no milk", "regular", 320, "turmeric latte");
		Tea tea = new Tea();
		tea.setValue("Japan", "green tea", "no sugar", "jasmine", 290);
		
//		Order order1 = new Order(latte);
		
		Order order2 = new Order();
		order2.getObject(tea);
		
		order2.display();
		

	}

}
