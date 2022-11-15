package chapter08;

/*
 *  메서드 오버라이딩이란? 
 *  - 상위 클래스에서 정의한 내용이 하위 클래스에서 구현할 내용과 맞지 않을 경우 재정의 하는 것을  
 *  매서드 오버라이딩이라고 한다.
 */

public class VipCustomer extends Customer{
	private int agentID;
	double saleRatio;
	
	public VipCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "Vip";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		//System.out.println("VIPCustomer() 생성자 호출");
	}
	
	@Override //메서드 오버라이딩
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; //포인트 적립
		return price - (int)(price * saleRatio);
	}
	
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 상담원 번호는 " + agentID + " 입니다.";
	}
	
	public int getAgentID() {
		return agentID;
	}
}
