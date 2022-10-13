package ch04;

public class P120 {
		public static void main(String[] args) {
			
			
			for(int num = 0; num <= 100; num++) {
				if (num % 3 != 0) {
					continue;
					
				}
				System.out.println(num);
			}
		}
}
