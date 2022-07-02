package Super3;

public class Student extends Person{

	Student(){
		System.out.println("I am from Student class");
	}
	
	Student(String name){
		super("Vicky");//the super() calls the constructor of parent class
	}
}
