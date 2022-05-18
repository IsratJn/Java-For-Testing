package problem_6;

public class Main {

	public static void main(String[] args) {
		Employees emp = new Employees();
		
		emp.getInfo(450, 6);
		
		if(emp.salary<500) {
			emp.AddSal();
		}
		if(emp.num_of_workinghours>6) {
			emp.AddWork();
		}
		
		System.out.println("The final salary is: "+emp.salary);
		

	}

}
