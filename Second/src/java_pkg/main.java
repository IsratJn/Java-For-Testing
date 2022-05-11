package java_pkg;
import java.util.*;

public class main {

	public static void main(String[] args) {
		//Array
//		String fruits[] = {"Mango","Berry","Litchi"};
//		for(int i=0; i<fruits.length; i++) {
//			System.out.println(fruits[i]);
//		}
		
		
//		String[] veggies = new String[3];
//		veggies[0]="Potol";
//		veggies[1]="Lau";
//		veggies[2]="Kumra";
//		
//		for(int i=0; i<veggies.length; i++) {
//			System.out.println(veggies[i]);
//		}
		
//		/*array list amra use kori karon array list dynamic, 
//		 * mane amr age bola lagbe na koyta element
//		 * ami rakhte chai
//		 * It is called dynamic array or variable length array
//		 */
//
//		System.out.println("Array list of strings");
//		
//		ArrayList<String> list1 = new ArrayList();
//		list1.add("Abul");
//		list1.add("kabul");
//		list1.add("Habul");
//		
//		for(int i=0; i<list1.size(); i++) {
//			System.out.println(list1.get(i));
//			}
//		
//		ArrayList<String> list3 = new ArrayList();
//		list3.add("Israt");
//		list3.add("Konka");
//		list3.add("Toha");
//		
//		
//		System.out.println("Array list of arrays");	
//		
//		ArrayList<ArrayList<String>> aarlist2D = new ArrayList();		
//		aarlist2D.add(list1);
//		aarlist2D.add(list3);
//		
//		System.out.println("Printing the index:");
//		for(int i=0; i<aarlist2D.size(); i++) {
//			//System.out.println("List no: "+i);
//		   //for(int j=0; j<3;j++) {
//			   System.out.println("At index no:"+i+" we have stored"+aarlist2D.get(i));
//		   //}
//		}
//		
//		System.out.println("Printing individual element:");
//		for(int i=0; i<aarlist2D.size(); i++) {
//			//System.out.println("List no: "+i);
//		   for(int j=0; j<3;j++) {
//			   System.out.println("When i= "+i+" and j= "+j+
//					   " name stored is: "+aarlist2D.get(i).get(j));
//		   }
//		}
		
		//ArrayList of Arrays
		
		ArrayList <Integer[]> arrlist = new ArrayList<>();
		Integer odds[] = {1,3,7};
		Integer evens[] = {2,4,6};
		
		arrlist.add(odds);
		arrlist.add(evens);
		
		for (int i=0;i<arrlist.size();i++) {
            for(int j=0; j<3;j++) {
                System.out.println(arrlist.get(i)[j]);
            }
            System.out.println();


        }		
		
	}

}
