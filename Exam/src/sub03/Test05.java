package sub03;

class Vehicle {
		private String name;
		private int price;
		
		public Vehicle(String name, int price) {
			this.name = name;
			this.price = price;
		}
		
		
		public void info() {
			System.out.println("=========");
			System.out.println("차량명 : " + name);
			System.out.println("가격 : " + price);
			System.out.println("--------");
		}
}

class CarFactory {
		private static CarFactory instance = new CarFactory();
		private CarFactory() {}
		
		public static CarFactory getinstance() {
			return instance;
		}
		
		public Vehicle createCar(String Name, int price) {
			return new Vehicle(Name, price);
		}
}

public class Test05 {
		public static void main(String[] args) {
			
			CarFactory factory = CarFactory.getinstance();
			Vehicle avante = factory.createCar("아반떼",2500);
			Vehicle sonata = factory.createCar("소나타",3000);
			
			avante.info();
			sonata.info();
		}
	
	
	
	
	
}
