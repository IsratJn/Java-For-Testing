package ArrayOfObjects;

public class Main {

	public static void main(String[] args) {
		
		Books book1 = new Books("Kobi",250.80,"Humayun Ahmed",1980);
		Books book2 = new Books("Ikigai",850.00,"Hector Garsia",2010);
		Books book3 = new Books("Adom surot",1000.00,"Tarek Masud",2008);
		Books book4 = new Books("First person",1690.80,"Rituporno Ghosh",1999);
		
		Books library[] = new Books[4];
		library[0]=book1;
		library[1]=book2;
		library[2]=book3;
		library[3]=book4;
		
		int i;
		
		for(i=0;i<library.length;i++) {
			System.out.print("The book at index "+ i+" is: ");
			System.out.println(library[i].name);
			System.out.println(library[i].Authour);
			System.out.println(library[i].price);
			System.out.println(library[i].publication_year);
			System.out.println();
		}
		


	}

}
