package chapter05;

public class Customer {
	String orderNum;
	String cusId;
	String orderDate;
	String orderName;
	String proNum;
	String address;
	
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.orderNum = "201803120001";
		customer.cusId = "abc123";
		customer.orderDate = "2018년3월 12일";
		customer.orderName = "홍길순";
		customer.cusId = "PD0345-12";
		customer.address = "서울시 영등포구 여의도동 20번지";
	
		System.out.println("주문번호 : " + customer.orderNum);
		System.out.println("주문자 아이디 : " + customer.cusId);
		System.out.println("주문 날짜 : " + customer.orderDate);
		System.out.println("주문자 이름 : " + customer.orderName);
		System.out.println("주문상품번호 : " + customer.cusId);
		System.out.println("배송 주소 : " + customer.address);
	}
	
	
	
}
