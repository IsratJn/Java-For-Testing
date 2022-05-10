package java_pkg;

import java.util.Scanner;

public class Hello_World {
	
	
	public static void main(String[] args) {
	
//      One		
//		String x = "First String";
//		String y = "Second String";
//		System.out.println("Initially, x= "+x+" and y= "+y);
//		
//		String temp;
//		
//		temp = x;
//		x = y;
//		y = temp;
//		
//		System.out.println("After swapping, x= "+x+" and y= "+y);
		
		//2. User Input
		
//		Scanner scannerObj = new Scanner(System.in);
//		
//		System.out.println("What's your name?");
//		String name = scannerObj.nextLine();
//		System.out.println(name);
//		System.out.println("Where do you live?");
//		String address = scannerObj.nextLine();
//		System.out.println(address);
//		System.out.println("How old are you?");
//		int age = scannerObj.nextInt();
//		System.out.println(age);
//		scannerObj.nextLine();
//		System.out.println("Whats your favorite movie?");
//		String movie = scannerObj.nextLine();
//		System.out.println(movie);
//		
		//3.Hypotaneous of a triangle
//		double x;
//		double y;
//		double z;
//		
//		Scanner scannerObj = new Scanner(System.in);
//		
//		System.out.println("Enter the base:");
//		x = scannerObj.nextDouble();
//		System.out.println("Enter the parpendicle:");
//		y = scannerObj.nextDouble();
//		
//		z = Math.sqrt(x*x + y*y);
//		System.out.println(z);
//		
//		scannerObj.close();
		
		//4.if statement
//		Scanner scannerObj = new Scanner(System.in);
//		
//		System.out.println("Enter your age:");
//		
//		int age;
//		age = scannerObj.nextInt();
//		
//		if(age>=18) {
//			System.out.println("You are an adult!");
//		}
//		else {
//			System.out.println("Choti bacchi ho kya?");
//		}
		
		//5.Switch statement
		
//		System.out.println("Enter a number:");
//		int n;
//		
//		Scanner scannerObj = new Scanner(System.in);
//		n = scannerObj.nextInt();
//		
//		switch(n) {
//		
//		case 0 : System.out.println("The number is " +n);
//		break;
//		case -1: System.out.println("The number is negative");
//		break;
//		case 1: System.out.println("The number is positive" );
//		break;
//		default: System.out.println("Default option!");
//		}
//		
//		scannerObj.close();
//		
//		
        //Six		
//		System.out.println("You are playing a game. To quit press \"Q\" or \"q\" ");
//		String response;
//		
//		Scanner scannerObj = new Scanner(System.in);
//		response = scannerObj.nextLine();
//		
//		if(response.equals("Q") || response.equals("q") ) {
//			System.out.println("You quit!");
//		}
		
		//7.While loop
		
//		String name = "";
//		Scanner scannerObj = new Scanner(System.in);
//		
//		while(name.isBlank()) {
//			System.out.print("Type your name:");
//			name = scannerObj.nextLine();
//		}
//		
//		System.out.println("Hello "+ name);		
//		scannerObj.close();
		//Practice problems
//		int n = 1;
//		
//		do {
//			n=n-1;
//			System.out.println(n);
//		} while(n>=2);
		// Sum of positive integers
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter a positive number:");
//		int n = input.nextInt();
//		int sum = 0;
//		while(n>=0) {
//			sum = sum+n;
//			System.out.println("Enter a positive number:");
//			n = input.nextInt();
//			
//		}
//		System.out.println(sum);
		
		//For loop
//		
//Nested for loop
//		Scanner input = new Scanner(System.in);
//		int rows,cols;
//		String symbols;
//		System.out.println("Enter the number of rows:");
//		rows =input.nextInt();
//		System.out.println("Enter the number of cols:");
//		cols =input.nextInt();
//		System.out.println("Enter a symbol:");
//		symbols =input.next();
//		
//		for(int i=1; i<=rows;i++) {
//			System.out.println();
//			for(int j=1;j<=cols;j++) {
//				System.out.print(symbols);
//				
//			}
//		}
		//Array
//		int[] numbers = {1,2,3,4,5};
//		
//		for(int i=0;i<5;i++) {
//			System.out.println(numbers[i]);
//		}
//		
//		String[] books = {"Ikigai", "Kobi", "First Person","Adom Surot"};
//		
//		for(int i=0;i<books.length;i++) {
//			System.out.println(books[i]);
//		}
		
		//2D Array
		String[][] Array2D = {
				              {"Car1","Tesla"},
				              {"Car2","BMW"},
				              {"Car3","Rolce Royes"}
				             };

		for(int i=0; i<3;i++) {
			    System.out.println("The"+(i+1)+"th array is:");
		    for(int j =0;j<2;j++) {
		    	System.out.print(Array2D[i][j]);
		    	System.out.print("\t");
		    }
		    System.out.println("");
		}
	}

}
