package ch08;

	public class VipCustomer extends Customer{
		private int agentID;
		double saleRatio;
			
	public VipCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.customerID = customerID;
		this.customerName = customerName;
		this.agentID = agentID;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 상담원 번호는 " + agentID + "입니다.";
	}
	
	public int getAgentID() {
		return agentID;
	}
}
