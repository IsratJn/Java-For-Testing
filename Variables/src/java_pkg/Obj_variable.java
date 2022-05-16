package java_pkg;
import java.util.Scanner;

public class Obj_variable {
	
	Scanner scan_obj = new Scanner(System.in);
	
    String name;
	int score;
	

	public static void main(String[] args) {
		//When you create a new object of the class you create an instance(obj1 and obj2).
		//Now each object would have his own name and score right? So the value that is stored inside
		//‘name’ and ‘score’ would vary for different students, they are called ‘variables’. 
		//And like you saw that these variables hold their own value for each instance, 
		//they are called Instance Variables in Java.
		
		Obj_variable obj1 = new Obj_variable();
		Obj_variable obj2 = new Obj_variable();
		
		obj1.name = "Ross";
		obj2.name = "Rachel";
		
		System.out.println("Obj1 is "+obj1.name);
		System.out.println("Obj2 is "+obj2.name);
		
		
		
	}

}
