//Write a program to print the area of a rectangle by creating a class named 'Area' having
//two methods. First method named as 'setDim' takes length and breadth of rectangle as parameters
//and the second method named as 'getArea' returns the area of the rectangle. Length and breadth 
//of rectangle are entered through keyboard.

package problem_1;
import java.util.Scanner;

public class Area {
	
	static Scanner scanObj = new Scanner(System.in);
	
	static double length;
	static double width;
	static double area;

	public static void main(String[] args) {
				
		setDim();
		System.out.println("The area of the rectangle is: "+getArea(length, width));
		
				
	}
	public static void setDim() {
		
		System.out.println("Enter the length of the rectangle:");
		length = scanObj.nextDouble();
		
		System.out.println("Enter the width of the rectangle:");
		width = scanObj.nextDouble();
	}
	
	public static double getArea(double lengthP, double widthP) {
		lengthP = length;
		widthP = width;
		area = length * width;
		return area;
	}
    
}
