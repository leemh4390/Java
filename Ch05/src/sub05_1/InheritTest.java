package sub05_1;

import sub05.StockAccount;
import sub05.Truck;

public class InheritTest {
			public static void main(String[] args) {
				
			
		Sedan sonata = new Sedan ("소나타", "흰색", 0, 2000);
	//Truck bongo = new Truck("봉고", "파랑색", 0, 0);
		Truck bongo = new Truck("봉고", "파란색", 0,0);
		
		sonata.speedup(100);
		sonata.Turbospeed(80);
		sonata.show();
			
		bongo.load(100);
		bongo.speedup(80);
		bongo.show();
		
		
		
		StockAccount kb = new StockAccount("kb증권", "101-12-1001", "홍길동", 0,"삼성전자",0,0);
		kb.deposit(1000000);
		kb.buy(10, 70000);
		kb.sell(5, 75000);
		kb.withdraw(200000);
		kb.show();
		
		
		
		
			}
}