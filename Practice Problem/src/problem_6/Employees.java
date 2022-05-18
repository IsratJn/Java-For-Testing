//Write a program by creating an 'Employee' class having the following methods and print 
//the final salary.
//1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
//2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
//3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day 
//is more than 6 hours.

package problem_6;

public class Employees {
	
	int salary;
	int num_of_workinghours;

	public void getInfo(int salary, int num_of_workinghours) {
		
		this.salary = salary;
		this.num_of_workinghours = num_of_workinghours;
			
	}
	
	
	public int AddSal() {
		salary += 10;
		return salary;
	}
	
	public int AddWork() {
		salary += 5;			
		return salary;
	}
	
	
	
}

