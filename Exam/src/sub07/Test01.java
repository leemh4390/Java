package sub07;


class Box {
		private double width;
		private double height;
		private double depth;
		
		
public Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
}

public double volume() {
		
		return width * height * depth;
}
		
	}

public class Test01 {

		public static void main(String[] args) {
			Box box1 = new Box(1, 2, 3);
			Box box2 = new Box(3, 6, 9);
			
			System.out.println("Box1의 부피 : " + box1.volume());
			System.out.println("Box2의 부피 : " + box2.volume());
		}
}
