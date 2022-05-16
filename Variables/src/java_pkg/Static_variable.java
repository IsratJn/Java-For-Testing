package java_pkg;

public class Static_variable {
	
	//instance variable
	int roll;
	String name;
	
//	Static variable
//	If you declare any variable as static, it is known as a static variable.
//	The static variable can be used to refer to the common property of all objects (which is not unique for each object), for example, the company name of employees, college name of students, etc.
//	The static variable gets memory only once in the class area at the time of class loading.
	
//	Suppose there are 500 students in my college, now all instance data members will get memory each
//	time when the object is created. All students have its unique rollno and name, so instance data
//	member is good in such case. Here, "college" refers to the common property of all objects.
//	If we make it static, this field will get the memory only once.
	
		
	static String college_name = "RUMC";
	
	//constructor
	Static_variable(int r, String n) {
		roll=r;
		name=n;
	}
	
	public void showdata() {
		System.out.println(name+" is roll no "+roll+" of college "+Static_variable.college_name);
	}
	
	
	public static void main(String[]args) {
		
		Static_variable stu1 = new Static_variable(1,"Konka");
		Static_variable stu2 = new Static_variable(2,"Toha");
		
		stu1.showdata();
		stu2.showdata();
		
	}

}
