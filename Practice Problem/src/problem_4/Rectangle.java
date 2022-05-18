//Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively
//by creating a class named 'Rectangle' with a method named 'Area' which returns the area and length
//and breadth passed as parameters to its constructor.
package problem_4;

public class Rectangle {
   int length;
   int width;
   int area;
   
   Rectangle(int length, int width){
	   this.length = length;
	   this.width = width;
   }
   public int area() {
	   area = length * width;
	   return area;
   }
}
