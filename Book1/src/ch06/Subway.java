package ch06;

public class Subway {
	String lineNumber;
	int passengerCount;
	int money;

public Subway (String lineNumber) {
	this.lineNumber = lineNumber;
}

public void take(int money) {
	this.money += money;
	passengerCount++;
}

public void showinfo() {
	System.out.println("지하철 " + lineNumber + " 번의 승객은 " + passengerCount + "명이고, " + 
						" 수입은 " + money + "입니다."); 
}
}
