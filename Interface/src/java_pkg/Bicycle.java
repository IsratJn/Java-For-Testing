package java_pkg;

public class Bicycle implements Vehicle {

	int speed;
	int gear;
	
	@Override
	public void changeGear(int a) {
		// TODO Auto-generated method stub
		this.gear  = a;
		
	}

	@Override
	public void speedUp(int a) {
		// TODO Auto-generated method stub
		 speed = speed + a;
		
	}

	@Override
	public void applyBreaks(int a) {
		// TODO Auto-generated method stub
		 speed = speed - a;
		
	}
	
	public void printStates() {
        System.out.println("speed: " + speed
            + " gear: " + gear);
    }

}
