package chapter08;

public class OverridingTest2 {
	public static void main(String[] args) {
		Customer vc = new VipCustomer(10030,"나몰라", 2000);
		vc.bonusPoint = 1000;
		

		
		int price = 10000;
		System.out.println(vc.getCustomerName() +  " 님이 지불해야하는 금액은 "
				+ vc.calcPrice(price) + "원 입니다.");
	}
}
