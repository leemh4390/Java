package sub03;

/*
 * 날짜 : 2022/08/25 
 * 이름 : 이민혁
 * 내용 : Java 클래스 변수, 클래스 메서드 실습하기
 * 
 * 클래스 변수, 클래스 매서드(정적 변수, 정적 매서드)
 * -  static 을 선언한 변수, 매서드로 Java Class Area(Method Area) 에 생성
 * -  객체 생성하지 않고 해당 클래스 타입으로 직접 참조 
 *  - 프로그램 실행시 가장 먼저 메모리에 로드
 *  
 *  
 *  싱글톤 객체(Singleton)
 *  - 싱글톤 패턴이 적용된 객체는 하나의 인스턴스
 *  - 싱글톤 객체를 사용해서 메모리 절약과 성능 향상
 *  
 */

public class StackTest {
	public static void main(String[] args) {
		
		// 싱글톤 실습
		Calc cal = Calc.getInstance();
		
		int r1 = cal.plus(1,2);
		int r2 = cal.minus(2,3);
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		
	}
}
