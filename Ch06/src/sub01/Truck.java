package sub01;

public class Truck extends Car {

	
	private int capacity;
	
	
	public Truck(String name, String color, int speed, int capacity) {
		super(name, color, speed);
		this.capacity = capacity;
	}

	@Override
	public void speedup(int speed) {
		this.speed += speed + 10;
		
	}

	@Override
	public void speeddown(int speed) {
		this.speed -= speed -10;
		
	}
		 
}
