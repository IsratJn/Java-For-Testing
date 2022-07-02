package SupurDeluxe;

public class Teacher extends Person{

	double salary;
	
	Teacher(String name, int age, double salary){
		super(name,age);
		this.salary = salary;
	}
}
