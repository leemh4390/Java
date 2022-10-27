package ch08;

public class CustomerTest {
		public static void main(String[] args) {
			Customer customerLee = new Customer();
			customerLee.setCustomerID(10010);
			customerLee.setCustomerName("이순신");
			customerLee.bonusPoint = 1000;
			
			System.out.println(customerLee.showCustomerInfo());
			
			Customer customerKim = new VipCustomer(0, null, 0);
			customerKim.bonusPoint = 1000;
		}
}
