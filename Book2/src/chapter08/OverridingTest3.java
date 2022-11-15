package chapter08;

public class OverridingTest3 {
	public static void main(String[] args) {
		
		int price = 10000;
		
		Customer customerLee = new Customer(10010,"이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.getCustomerName() +  " 님이 지불해야하는 금액은 "
				+ customerLee.calcPrice(price) + "원 입니다.");
		
		VipCustomer customerKim = new VipCustomer(10020, "김유신", 12345);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.getCustomerName() +  " 님이 지불해야하는 금액은 "
				+ customerKim.calcPrice(price) + "원 입니다.");
		
		Customer vc = new Customer(10030,"나몰라");
		vc.bonusPoint = 1000;
		System.out.println(vc.getCustomerName() +  " 님이 지불해야하는 금액은 "
				+ vc.calcPrice(price) + "원 입니다.");
	}
}
