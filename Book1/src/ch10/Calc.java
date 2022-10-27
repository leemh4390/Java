package ch10;

public interface Calc {
	double PI = 3.14;
	int ERROR = -99999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void descripion() { //디폴트 메소드에선 private 메서드 호출
		System.out.println("정수 계산기를 구현합니다.");
		myMethod(); //디폴트 
		
	}
	
	static int total(int[] arr) { //정적 메소드에선 private static 메서드 호출
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		myStaticMethod(); 
		return total;
	}
	
	private void myMethod() {
		System.out.println("private 메소드 입니다.");
	}
	
	private static void myStaticMethod() {
		System.out.println("private static 메서드 입니다.");
	}
}
