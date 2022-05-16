package java_pkg;
import java.util.Scanner;

public class method {

	public static void main(String[] args) {
		
		Scanner scannerObj = new Scanner(System.in);
		
//		//Method for printing hello
//		String name = "Israt";
//		hello(name);
//				
//		
//		//addition(n1,n2);
//		System.out.println("Enter the first number:");
//		int n1 = scannerObj.nextInt();
//		System.out.println("Enter the second number:");
//		int n2 = scannerObj.nextInt();
//		System.out.println("The sum is:"+addition(n1,n2));
//		
//		
//		
//		//Largest of 3
//		System.out.println("Enter the first number:");
//		int n3 = scannerObj.nextInt();
//		System.out.println("Enter the second number:");
//		int n4 = scannerObj.nextInt();
//		System.out.println("Enter the third number:");
//		int n5 = scannerObj.nextInt();
//		System.out.println("The largest number is:"+comparison(n3,n4,n5));
//		
		
//		//Middle character of a string
//		 System.out.print("Input a string: ");
//	        String str = scannerObj.nextLine();
//	        System.out.print("The middle character in the string: " + middle(str)+"\n");
		
		//Vowels count
		System.out.print("Input the string: ");
        String str = scannerObj.nextLine();
        System.out.print("Number of  Vowels in the string: " + count_Vowels(str)+"\n");
        
        
       // Write a Java method to count all words in a string.
        System.out.println("Enter text:");
        
		

		
		
		
	}
	
	
	
	
	//Method for printing hello declaration
	public static void hello(String nameP) {
		System.out.println("Hello "+nameP);
	}
	
	//Method for printing sum of two numbers
	public static int addition(int n1P, int n2P) {
	       int sum = n1P+n2P;
	       return sum;
	      
	}
	//Method for printing largest of 3 numbers
	public static int comparison(int n3P, int n4P, int n5P) {
		int large=0;
		if(n3P>n4P && n3P>n5P) {
		     large = n3P;
		}
		if(n4P>n3P && n4P>n5P) {
			large = n4P;
			
		}
		if(n5P>n3P && n3P>n4P) {
			large = n5P;
			
		}
		return large;
	}
    
	
	//Displaying the middle character of a String
	public static String middle(String str)
    {
        int position;
        int length;
        if (str.length() % 2 == 0)
        {
            position = str.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position, position + length);
    }
	
	//Write a Java method to count all vowels in a string
	
	 public static int count_Vowels(String str)
	    {
	        int count = 0;
	        for (int i = 0; i < str.length(); i++)
	        {
	            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
	                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
	            {
	                count++;
	            }
	        }
	        return count;
	    }
	}
	
	
	
	
	
