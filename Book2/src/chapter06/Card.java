package chapter06;

public class Card {
	private int CardNumber;
	private static int serialNum = 10000;
	
	Card(){
		serialNum++;
		CardNumber = serialNum;
	}
	
	public int getCardNumber() {
		return CardNumber;
	}
	
	public void setCardNumber(int CardNumber) {
		this.CardNumber = CardNumber;
	}
}
