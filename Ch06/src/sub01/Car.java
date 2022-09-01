package sub01;

public abstract class Car {
		
	
		protected String name;
		protected String color;
		protected int speed;
		
		//생성자
		
		public Car(String name, String color, int speed) {
			this.name = name;
			this.color = color;
			this.speed = speed;
		}
		
		
		//기능 (추상메서드)
		public abstract void speedup(int speed);
		public abstract void speeddown (int speed);
		
		public void show() {
			System.out.println("차량명 : " + name);
			System.out.println("차량색 : " + color);
			System.out.println("차량속도 : " + speed);
			
		}
		
}
