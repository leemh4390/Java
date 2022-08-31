package sub07;

/*
 * 날짜 : 2022/08/31
 * 이름 : 이민혁
 * 내용 : 
 * 
 * 
 * 다형성(Polyporhism)
 *  - 상속관계에서 부모 클래스의 기능이 자식 클래스에서 여러 기능으로 변하는 특성
 *  - 객체의 타입선언을 부모 클래스 타입으로 선언
 *  - 다양성을 이용해서 프로그래밍 중복을 줄이고 유연성을 높인다.
 *  
 */

public class PolyTest {
	
		public static void main(String[] args) {
		
		// 다양성을 적용한 객체 생성 (UpCasting)
		Animal a1 = new Tiger(); 
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		a1.move();
		a2.move();
		a3.move();
		
		
		a1.hunt();
		a2.hunt();
		a3.hunt();
		
		// 객체 타입 캐스팅
		Tiger tiger = (Tiger) a1; //DownCasting
		Eagle eagle = (Eagle) a2;
		Shark shark = (Shark) a3;
		
		tiger.move();
		eagle.move();
		shark.move();
		
		
		
		// 객체 타입 연산
		if(a1 instanceof Tiger) {
			System.out.println("a1 은 Tiger입니다.");
		}
		
		
		if (a2 instanceof Eagle) {
			System.out.println("a2 은 Eagle입니다.");
		}
		
		if (a3 instanceof Shark) {
			System.out.println("a3 은 Shark입니다.");
		}
		
		
		
		
	}
}
