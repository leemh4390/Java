package sub01;

// 클래스 정의
public class Car {
	//자동차의 속성 (메서드)
	String name;
	String color;
	int speed;
	
	//자동차의 기능 (변수)
	public void speedup(int speed) {
		this.speed += speed;
		
	}
	
	public void speeddown(int speed) {
		this.speed -= speed;
		
	}
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("속도 : " + this.speed);
		
	}
	
}
