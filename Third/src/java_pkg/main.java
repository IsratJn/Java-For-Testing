package java_pkg;

import java.util.*;


public class main {

	public static void main(String[] args) {
		
		//For each loop returns value unlike for loop which returns index
		
		String animals[] = {"tiger","cat","elephant","donkey"};
		
		for(String i : animals) {
			System.out.println(i);
		}
		
		int numbers[] = {10,20,30};
		
		for(int i : numbers) {
			System.out.println(i);
		}
		
		ArrayList<String> arrlist = new ArrayList();
		
		arrlist.add("Apple");
		arrlist.add("Mango");
		arrlist.add("Banana");
		
		for(String x : arrlist ) {
			System.out.println(x);
		}
		

		
	}

}
