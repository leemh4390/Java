package chapter08;

public class CustomerTest2 {
	public static void main(String[] args) {
		VipCustomer customerKIm = new VipCustomer(10020, "김유신", 10000);
		customerKIm.setCustomerID(10020);
		//customerKIm.setCustomerName("김유신");
		//customerKIm.bonusPoint = 10000;
		System.out.println(customerKIm.showCustomerInfo());
		
	}
}
