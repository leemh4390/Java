package sub05_1;

// 클래스 정의
public class Car {
	
	//자동차의 속성 (메서드)
	protected String name;
	protected String color;
	protected int speed;
	
	//생성자 
	public Car (String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;

	}
	
	//Getter. Setter
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
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
