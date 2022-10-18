package ch05;

public class Shop {
		String orderNo;
		String uid;
		String orderDate;
		String orderName;
		String proName;
		String addr;
		
		public static void main(String[] args) {
			Shop shop = new Shop();
			shop.orderNo = "201803120001";
			shop.uid = "abc123";
			shop.orderDate = "2018년3월12일";
			shop.orderName = "홍길순";
			shop.proName = "PD0345-12";
			shop.addr = "서울시 영등포구 여의도동 20번지";
			
			
			System.out.println("주문번호 : "+ shop.orderNo);
			System.out.println("주문자 아이디 : " + shop.uid);
			System.out.println("주문 날짜 : " + shop.orderDate);
			System.out.println("주문자 이름 : " + shop.orderName);
			System.out.println("주문 상품 번호 : " + shop.proName);
			System.out.println("배송 주소 : " + shop.addr);
		}
}

		

