package chapter04;

public class WhileTest {
	public static void main(String[] args) {
		
		int i = 0;
		int total = 0;
		
		while(i <= 10) {
			
			total += i;
			i++;
		}
		
		System.out.println("1부터 10까지의 합은 " + total);
		
		// 추가 예제
		
		int num = 1;
		int sum = 0;
		
		while(num <= 50) {
			
			sum += num;
			num ++;
		}
		
		System.out.println("1부터 50까지의 합은 " + sum);
	}
}
