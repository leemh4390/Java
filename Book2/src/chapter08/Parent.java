package chapter08;

public class Parent {
	private int a = 10;
	public int b = 20;
	
	class Child extends Parent {
		public int c = 30;
		
		void display() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
	}
}
