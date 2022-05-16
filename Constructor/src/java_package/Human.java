package java_package;

public class Human {
	
	//Constructor is a method which is called when a object is created
	//No return type and name should be same as the class name
	String name;
	int age;
	
	
	Human(String name, int age) {
		this.name = name;
		this.age = age;
		
		//System.out.println(name+" is "+age+" years old");
		//System.out.println("Mama ami kintu working :D");
		
	}
	public void display() {
		System.out.println(name + age);
	}

	public void eat() {
		System.out.println(name + " eats Pasta");
	}
}
