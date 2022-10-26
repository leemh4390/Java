package ch08;

public class GoldCustomer extends Customer{
	double saleRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "Gold";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	public int calcPrice(int Price) {
		bonusPoint += Price * bonusRatio;
		return Price - (int)(Price * saleRatio);
	}
}
