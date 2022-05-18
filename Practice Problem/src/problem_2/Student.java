//Create a class named 'Student' with String variable 'name' and integer variable
//'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating
//an object of the class Student.
package problem_2;

public class Student {
	
	String name;
	int roll_no;
	
	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.name = "Israt";
		stu.roll_no = 33;
		
		System.out.println("Student name: "+stu.name);
		System.out.println("Roll no: "+stu.roll_no);
		
	}

}
