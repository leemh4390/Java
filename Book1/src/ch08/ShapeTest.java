package ch08;

import java.util.ArrayList;

class Shape {
	public void draw() {
		System.out.println("Shape");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}

class Triangle extends Shape {
	public void draw() {
		System.out.println("Triangle");
	}
}

public class ShapeTest {
		public static void main(String[] args) {
			ArrayList<Shape> list = new ArrayList<Shape>();
				list.add(new Circle());
				list.add(new Triangle());
				list.add(new Shape());
				
				for(Shape s : list) {
					s.draw();
				}
			
		}

}
