package sub03_2;

/*
 * 날짜 : 2022/09/02 
 * 이름 : 이민혁
 * 내용 : 싱글톤 객체 연습
 * 
 */

class Vehicle {
		private String name;
		private int price;
	
		public Vehicle(String name, int price) {
				this.name = name;
				this.price = price;
		}
		
		public void info() {
			System.out.println("========");
			System.out.println("차량명 : " + name);
			System.out.println("가 격 : " + price);
			System.out.println("--------");
		}
}


class CarFactory {
		private static CarFactory instance = new CarFactory();
		private CarFactory() {}
		
		
	
	
}






public class Test05 {

}
