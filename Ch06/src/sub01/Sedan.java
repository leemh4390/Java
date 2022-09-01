package sub01;

public class Sedan extends Car{

		private int cc;
		
		public Sedan(String name, String color, int speed, int cc) {
			super(name, color, speed);
			this.cc = cc;
		
	}

		@Override
		public void speedup(int speed) {
			this.speed += speed + 20;
		}

		@Override
		public void speeddown(int speed) {
			this.speed += speed - 20;
		}
	
}
