package chapter06;

public class Bus {
	String country;
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(String country, int busNumber) {
		this.country = country;
		this.busNumber = busNumber;
	}
	
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println( country +"버스" + busNumber + "번의 승객은 " + passengerCount + "명이고, "
				+ "수입은" + money + "입니다.");
	}
}
