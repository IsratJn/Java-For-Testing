package java_pkg;

public class Main {
    
	int a;
	int b;
	
//	public void setdata(int aP, int bP) {
//		 a = aP;
//		 b = bP;
//		
//	}

	//During code execution when an object calls the method ‘setdata’.
	//The keyword ‘this’ is replaced by the object handler “obj.”
	//So now the compiler knows,The ‘a’ on the left-hand side is an Instance variable.
    //Whereas the ‘a’ on right-hand side is a local variable
	
	public void setdata(int a, int b) {
	/*	 a =a;  this kind of assignment confuses the
		 b = b;          compiler*/
		 this.a = a;
		 this.b = b;
		
	}
	
	public void display() {
		System.out.println("The numbers are "+a+" and " +b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main obj1 = new Main();
		Main obj2 = new Main();
		
		obj1.setdata(5, 10);
		obj1.display();
		
		obj2.setdata(1, 89);
		obj2.display();
		
		
	}

}
