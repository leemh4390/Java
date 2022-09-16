package sub04;

class Apple {
	
		private String Country;
		private int price;
		
		public Apple(String Country, int price) {
			this.Country = Country;
			this.price = price;
		} // apple public
		
		public void show () {
			System.out.println("원산지 : " + Country);
			System.out.println("가격 : " + price);
		}
}


class Banana {
	
		private String Country;
		private int price;
		
		public Banana(String Country, int price) {
			this.Country = Country;
			this.price = price;
		} // Banana public
		
		public void show () {
			System.out.println("원산지 : " + Country);
			System.out.println("가격 : " + price);
		}
	} 

class Grape extends Object{
	
		private String Country;
		private int price;
		
		public Grape(String Country, int price) {
			this.Country = Country;
			this.price = price;
		} // Grape public
		
		public void show () {
			System.out.println("원산지 : " + Country);
			System.out.println("가격 : " + price);
		}
	}

public class Test06 {
		public static void main(String[] args) {
			
			Test06 test = new Test06();
			
			Apple apple = new Apple("한국", 3000);
			Banana banana = new Banana("필리핀", 2000);
			Grape grape = new Grape("미국", 3000);
			
			test.showInfo(apple);
			test.showInfo(banana);
			test.showInfo(grape);
			
		}
	
		public void showInfo(Object fruit) {
			
			if(fruit instanceof Apple) {
				Apple apple = (Apple) fruit;
				apple.show();
				
			}else if(fruit instanceof Banana) {
				Banana banana = (Banana) fruit;
				banana.show();
				
			}else if(fruit instanceof Grape) {
				Grape grape = (Grape) fruit;
				grape.show();
				
			}
		}
}


