//Write a program that would print the information (name, year of joining, salary, address) of 
//three employees by creating a class named 'Employee'. The output should be as follows:
//Name        Year of joining        Address
//Robert            1994                64C- WallsStreat
//Sam                2000                68D- WallsStreat
//John                1999                26B- WallsStreat


package problem_5;

public class Employees {
	
	Employees(String name, int year_of_joining, String address){
		System.out.println(name+"\t"+"   "+year_of_joining+"\t"+"\t"+"   "+address);
	}

}
