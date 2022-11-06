package ch13;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	
	static class InStaticClass{
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println("InstaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
			System.out.println("InstaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
		}
	
	
	static void sTest() {
		System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
		System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
		
		}
	}

}

public class InnerTest {
		public static void main(String[] args) {
			OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
			System.out.println("정적 내부 클래스 일반 메서드 호출");
			sInClass.inTest();
			System.out.println();
			System.out.println("정적 내부 클래스의 정적 메서드 호출");
			OutClass.InStaticClass.sTest();
		}
	}

