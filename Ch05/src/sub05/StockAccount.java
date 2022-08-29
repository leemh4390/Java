package sub05;

public class StockAccount extends Account{ // 1번째 extends 확장 / 클래스명
	
	private String stock; // 2번째 private 선언
	private int amount;
	private int price;
	
	public StockAccount(String bank, String id, String name, int balance, String stock, int amount, int price) {
		super(bank, id, name, balance); //  3번째 부모개체와 자식개체 메서드 입력하기
		this.stock = stock; // this. ~  public 
		this.amount = amount;
		this.price = price;
	
	}
	
	public void sell(int amount, int price) {
		this.amount -= amount;
		this.balance += amount * price;
	}
	
	public void buy(int amount, int price) {
		this.amount += amount;
		this.balance -= amount * price;
	}
	
	public void show() {
		System.out.println("증권사 : " + bank);
		System.out.println("계좌번호 : " + id);
		System.out.println("예금주 : " + name);
		System.out.println("예수금 : " + balance);
		System.out.println("주식종목 : " + stock);
		System.out.println("주식수량 : " + amount);
		System.out.println("현재거격 : " + price);
		
		
	}
	
}
