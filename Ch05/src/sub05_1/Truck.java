package sub05_1;

public class Truck extends Car {
	
		private int capacity;
		
		public Truck(String name, String color, int speed, int capacity) {
			super(name, color, speed);
			
		}
		
		public void load(int capacity) {
			this.capacity += capacity;
		}
		
		
		public void show() {
			System.out.println("차량명" + name);
			System.out.println("차량색" + color);
			System.out.println("트럭속도" + speed);
			System.out.println("적재량" + capacity);
			
			
			
		}
		
		
		}
		

