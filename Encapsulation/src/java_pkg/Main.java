package java_pkg;

public class Main {

	public static void main(String[] args) {
		
//		Book book1 = new Book("Khonika","RobindroNath Thakur",145);
//		
//		//System.out.println(book1.name); //i cant access a private property outside that class
//
//		System.out.println(book1.getName());
//		System.out.println(book1.getPrice());
//		System.out.println(book1.getAuthor());
		
		Book book2 = new Book();
		
		book2.setName("Rich Dad poor Dad");
		System.out.println(book2.getName());
		
		book2.setAuthor("Daniel Clark");
		System.out.println(book2.getAuthor());
	}

}
