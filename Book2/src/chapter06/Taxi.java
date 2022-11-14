package chapter06;

public class Taxi {
	int TaxiNumber;
	int money;
	
	public Taxi (int TaxiNumber) {
		this.TaxiNumber = TaxiNumber;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showinfo() {
		System.out.println("택시 차번호는 "+ TaxiNumber +  "이고, 택시 요금은 " + money + " 입니다.");
	}

}
