package ch10;

public class MyClassTest {
		public static void main(String[] args) {
			
			MyClass mClass = new MyClass();
			
			X xClass = mClass;
			xClass.X();
			
			Y yClass = mClass;
			yClass.Y();
			
			MyInterface iClass = mClass;
			iClass.myMethod();
			iClass.X();
			iClass.Y();
		}
}
