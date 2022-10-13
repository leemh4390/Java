package ch04;

public class P119 {
		public static void main(String[] args) {
			
			int total = 0;
			
			for(int num = 0; num <= 100; num++) {
				if(num % 2 == 0) {
					continue;
				} total += num;
				
				
			}
			
			System.out.println("홀수합" + total );
		}
}
