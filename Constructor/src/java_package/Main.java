package java_package;

public class Main {

	public static void main(String[] args) {
		
       Human human1 = new Human("Konka",24);
       Human human2 = new Human("Toha",23);
       
      // System.out.println(human1.name+ " and "+human1.age);
       
       human1.display();
       human2.display();
       
       human1.eat();
       
	}

}
