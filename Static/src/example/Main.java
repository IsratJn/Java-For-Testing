package example;

public class Main {
	
	public static void main(String[] args) {
		
		Student stu1 = new Student(33,"Israt");
		Student stu2 = new Student(16,"Konka");
		
		Student.change();
		
		stu1.display();
		stu2.display();
		
		
	}

}
