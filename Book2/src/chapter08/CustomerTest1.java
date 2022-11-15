package chapter08;

public class CustomerTest1 {
	public static void main(String[] args) {
		Customer customerLee = new Customer(0, null);
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		System.out.println("=============");
		
		VipCustomer customerKIm = new VipCustomer(0, null, 0);
		customerKIm.setCustomerID(10020);
		customerKIm.setCustomerName("김유신");
		customerKIm.bonusPoint = 10000;
		System.out.println(customerKIm.showCustomerInfo());
	}
}
