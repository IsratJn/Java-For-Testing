//Write a program to print the area and perimeter of a triangle having sides of
//3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.

package problem_3;

public class Triangle {

	static double area;
	static double perimeter;
	
	
	public double area(int a, int b, int c) {
		
		area = 0.5*b*c;
		return area;
	}
	public double perimeter (int a, int b, int c) {
		double s;
		s=(a+b+c)/2;
		perimeter = s*(s-a)*(s-b)*(s-c);
		return perimeter;
		
	}

}
