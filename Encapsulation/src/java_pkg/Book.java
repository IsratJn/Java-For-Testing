package java_pkg;

public class Book {

	private String name;
	private String author;
	private double price;
	
//	Book(String name, String author, double price){
//		
//		this.name = name;
//		this.author = author;
//		this.price = price;
//		
//	}
	
	//setter method
	
	public void setName(String name) {
		this.name = name;
		
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(double price) {
		this.price = price;
		
	}
	
	
	
	
	
	
	
	
	//getter method
	public String getName() {
		return this.name;
	}
	public String getAuthor() {
		return this.author;
	}
	public double getPrice() {
		return this.price;
	}
}
