package Methods;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(add(4,5));
		hello("John");
		System.out.println("Overloading the add method");
		System.out.println(add(3,4,8.9));
	}

	
	public static int add(int num1, int num2) {
		int sum;
		sum=num1+num2;
		return sum;
	}
	
	public static void hello(String name) {
		System.out.println("Hello "+name);
	}
	
	
	
	public static double add(int num1, int num2, double num3) {
		double sum;
		sum=num1+num2+num3;
		return sum;
	}
	
	
}
