package java_Koffee;

public class Order {
	
//	Order(Latte latte){
//		System.out.println("One "+latte.variety+" with "+latte.milk+ " costs "+latte.price);
//	}
	
	
	Tea tea;
	public void getObject(Tea tea) {
		this.tea = tea;
	}
	
	public void display() {
		System.out.println("The tea is from "+tea.origin);
		System.out.println("It is a "+tea.variety);
		System.out.println("The flavour is "+tea.type);
		
	}
	
	
	
		
   
}
