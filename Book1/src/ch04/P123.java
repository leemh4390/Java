package ch04;

public class P123 {
		public static void main(String[] args) {

			int num1 = 10; int num2 = 2;
			
			char operator = '/';
			
			switch(operator) {
			case '+' :
				System.out.println("결과 값 : " + (num1 + num2));
				break;
				
			case '-' :
				System.out.println("결과 값 : " + (num1 - num2));
				break;
				
			case '*' :
				System.out.println("결과 값 : " + (num1 * num2));
				break;
				
			case '/' :
				System.out.println("결과 값 : " + (num1 / num2));
				break;
			}
			
			
	}	
}
