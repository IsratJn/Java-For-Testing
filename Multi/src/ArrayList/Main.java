package ArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
//      ArrayList<Integer> numbers = new ArrayList<Integer>();
//      
//      numbers.add(90);
//      numbers.add(80);
//      numbers.add(70);
//      numbers.add(60);
//      
//      ArrayList<Integer> digits = new ArrayList<Integer>();
//      
//      digits.add(10);
//      digits.add(20);
//      digits.add(30);
//      digits.add(40);
//      
//      ArrayList<ArrayList<Integer>> arraylist = new ArrayList<ArrayList<Integer>>();
//      
//      arraylist.add(numbers);
//      arraylist.add(digits);
//      
//      System.out.println("Printing the arraylist");
//      
//     
//      for(ArrayList<Integer> x : arraylist) {
//    	  for(Integer y : x) {
//    		  System.out.print(y + "\t");
//    		  
//    	  }
//    	  System.out.print("\n");
//      }
//      
//		int i,j;
//		
//		for(i=0;i<arraylist.size();i++) {
//			for(j=0;j<arraylist.get(i).size();j++) {
//				System.out.print(arraylist.get(i).get(j) + "\t");
//			}
//			System.out.print("\n");
//		}
//		
		
		
		
		
//		ArrayList<Integer>numbers = new ArrayList<Integer>();
//		
//		numbers.add(10);
//		numbers.add(30);
//		numbers.add(50);
//		numbers.add(70);
		int i,j;
//		for(i=0;i<numbers.size();i++) {
//			System.out.println(numbers.get(i));
//		}
		
		
		ArrayList<String>characters = new ArrayList<String>();
		characters.add("Feluda");
		characters.add("Shuvro");
		characters.add("Urmila Chattereji");
		characters.add("Mary Ann");
		characters.add("Aboni");
		
		ArrayList<String>reference = new ArrayList<String>();
		reference.add("Satyajit Ray");
		reference.add("Humayun Ahmed");
		reference.add("Rituporno Ghosh");
		reference.add("Anjan Dutt");
		reference.add("Shakti Chattapaddhay");
		
		
		ArrayList<ArrayList<String>>fiction = new ArrayList<ArrayList<String>>();
		fiction.add(characters);
		fiction.add(reference);
		
		
//		for(i=0;i<characters.size();i++) {
//			System.out.println(characters.get(i));
//		}
		
		
		
		
		//System.out.println(fiction);
		
//		for(i=0;i<fiction.get(i).size();i++) {
//			for(j=0;j<fiction.get(i).size();j++) {
//				System.out.println(fiction.get(i).get(j));
//			}
//			System.out.print("\n");
//			
//		}
		
//		for(ArrayList<String> x : fiction) {
//			for(String y: x) {
//				System.out.println(y);
//			}
//			
//		}
		
		
		int array [] [] = {
				{10,20,30,40},
				{5,6}
		};
		
		for(int[] x : array) {
			for(int y : x) {
				System.out.print(y+"\t");
			}
			System.out.println("");
		}
		
		
		
		
		
		
		

	}

}
