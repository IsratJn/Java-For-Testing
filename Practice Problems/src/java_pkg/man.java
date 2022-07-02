package java_pkg;

import java.util.Scanner;

public class man {

	public static void main(String[] args) {
		
//		Write a Java program that reads a floating-point number and prints 
//		"zero" if the number is zero. Otherwise, print "positive" or "negative"
//		. Add "small" if the absolute value of the number is less than 1, or "large" 
//		if it exceeds 1,000,000
		
//		Write a Java program that keeps a number from the user and generates
//		an integer between 1 and 7 and displays the name of the weekday.
		
//		System.out.println("Enter a number:");
//		Scanner scanInput = new Scanner(System.in);
//		int a = scanInput.nextInt();
//		
//		switch(a) {
//		case 1:{ 
//			System.out.println("Saturday");
//			break;
//			}
//		case 2: {
//			System.out.println("Sunday");
//			break;
//		}
//		case 3: {
//			System.out.println("Monday");
//			break;
//		}
//		case 4:{
//			System.out.println("Tuesday");
//			break;
//		}
//		case 5: {
//			System.out.println("Wednesday");
//			break;
//			
//		}
//		case 6:{
//			System.out.println("Thursday");
//			break;
//		}
//		case 7:{
//			System.out.println("Friday");
//			break;
//		}
//		
//		
//		}
//	
	
	
		//Write a Java program to find the number of days in a month
		Scanner scanInput = new Scanner(System.in);  
		
		System.out.println("Enter a number of month:");
		int month = scanInput.nextInt();
		System.out.println("Enter a year:");
		int year = scanInput.nextInt();
		
		switch(month) {
		case 1:{
			System.out.println("January of "+year+" has 31 days");
			break;
				
		}
		case 2:{
			if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {
				System.out.println("February of "+year+" has 28 days");
			}
			else {
				System.out.println("February of "+year+" has 29 days");
			}
			
			break;
				
		}
		case 3:{
			System.out.println("March of "+year+" has 31 days");
			break;
				
		}
		case 4:{
			System.out.println("April of "+year+" has 31 days");
			break;
				
		}
		case 5:{
			System.out.println("May of "+year+" has 31 days");
			break;
				
		}
		case 6:{
			System.out.println("June of "+year+" has 31 days");
			break;
				
		}
		case 7:{
			System.out.println("July of "+year+" has 31 days");
			break;
				
		}
		case 8:{
			System.out.println("August of "+year+" has 31 days");
			break;
				
		}
		case 9:{
			System.out.println("Semptember of "+year+" has 31 days");
			break;
				
		}
		case 10:{
			System.out.println("October of "+year+" has 31 days");
			break;
				
		}
		case 11:{
			System.out.println("November of "+year+" has 31 days");
			break;
				
		}
		case 12:{
			System.out.println("December of "+year+" has 31 days");
			break;
				
		}
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
