package ch08;

public class CustomerTest2 {
		public static void main(String[] args) {
			
			VipCustomer customerKim = new VipCustomer(0, null, 0); 
			customerKim.setCustomerID(10020);
			customerKim.setCustomerName("김유신");
			customerKim.bonusPoint = 10000;
			System.out.println(customerKim.showCustomerInfo());
		}
}
