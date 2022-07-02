package example;

public class Student {
	int rollNo;
	String name;
	static String ins_name = "RUMC";
	
	Student(int rollNo, String name){
		this.rollNo = rollNo;
		this.name = name;
		
	}
	
	static void change() {
		ins_name = "Sust";
	}
	
    public void display() {
    	System.out.println(rollNo + " " +name + " "+ ins_name);
    }

}
