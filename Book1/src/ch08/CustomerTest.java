package ch08;

<<<<<<< HEAD
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
=======
import java.util.ArrayList;

public class CustomerTest {
		public static void main(String[] args) {
			ArrayList<Customer> customerList = new ArrayList<Customer>();
			
			Customer customerLee = new Customer(10010, "이순신");
			Customer customerShin = new Customer(10020, "신사임당");
			Customer customerHong = new GoldCustomer(10030, "홍길동");
			Customer customerYoul = new GoldCustomer(10040, "이율곡");
			Customer customerKim = new VipCustomer(10050, "김유신", 12345);
			
			customerList.add(customerLee);
			customerList.add(customerShin);
			customerList.add(customerHong);
			customerList.add(customerYoul);
			customerList.add(customerKim);
			
			System.out.println("===== 고객 정보 출력 =====");
			for(Customer customer : customerList) {
				System.out.println(customer.showCustomerInfo());
			}
			
			System.out.println("==== 할인율과 보너스 포인트 계산 ====");
			int price = 10000;
			for(Customer customer : customerList) {
				int cost = customer.calcPrice(price);
				System.out.println(customer.getCustomerName() + " 님이"
						+ cost + " 원 지불하셨습니다.");
				System.out.println(customer.getCustomerName() + " 님의 현재 보너스 포인트는 "
						+ customer.bonusPoint + " 점 입니다.");
		}
	}
}
>>>>>>> 12d9b1c572af1ef1786781c6f50e1f9ad7370b62
