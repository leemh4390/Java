package chapter04;

public class ContinueExample {
	public static void main(String[] args) {
		
		int total = 0;
		int num;
		
		for(num = 1; num <= 100; num++) {
			if(num % 2 == 0) 
				continue;
					total += num;
				
		}
		System.out.println("1부터 10까지의 홀수의 합은 " + total);
		
		int num1 ;
		
		for(num1 = 0; num1 <= 100; num1++) {
			if(num1 % 3 != 0) 
				continue;
			
			System.out.println(num1);
		}
	}
}
