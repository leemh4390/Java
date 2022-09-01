package sub02;

public class Sedan implements Car {
	
		//초기화
		private String name;
		private String color;
		private int speed;
		
		//생성자
		public Sedan (String name, String color, int speed) {
			this.name = name;
			this.color = color;
			this.speed = speed;
		}
		
		@Override
		public void speedUp(int speed) {
			this.speed += speed + 20;
			
		}
		
		public void speedDown(int speed) {
			this.speed -= speed;
			
		}
		
		
		public void show() {
			System.out.println("차량명 : " + name);
			System.out.println("차량색 : " + color);
			System.out.println("차량속도 : " + speed);
				
		}
}
