package Super;

public class SuperHero extends Person {
	
	String power; //instance variable
	
	SuperHero(String name, int age,String power //parameter
			){
		
		super(name,age);
		this.power = power;
		
	}

}
