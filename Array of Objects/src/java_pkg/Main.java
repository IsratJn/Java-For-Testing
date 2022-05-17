package java_pkg;

public class Main {
	
	public static void main(String[] args) {
		
		Food food1 = new Food("Fish tots");
		Food food2 = new Food("Pizza");
		Food food3 = new Food("Brownie");
		Food food4 = new Food("Mozarella Stics");
		
		Food refrigerator[] = new Food[4];//Array of objects. 
		//The array elements store the location of the reference variables of the object.
		
		refrigerator[0] = food1;
		refrigerator[1] = food2;
		refrigerator[2] = food3;
		refrigerator[3] = food4;
		
		System.out.println("This shows where objects are stored in an array in computers memory");
		for(int i=0 ;i<refrigerator.length;i++) {
			System.out.println(refrigerator[i]);
		}
		System.out.println("");
		
		
		System.out.println("These are the actual value:");
		for(int i=0 ;i<refrigerator.length;i++) {
			System.out.println(refrigerator[i].f_name);
		}
		System.out.println("");
		
		
		
		for(int i=0 ;i<refrigerator.length;i++) {
			refrigerator[i].display();
		}
		
		
		
		
//		food1.display();
//		food2.display();
//		food3.display();
//		food4.display();
		
	}

}
