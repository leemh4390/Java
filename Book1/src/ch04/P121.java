package ch04;

public class P121 {
		public static void main(String[] args) {
			
			int sum = 0;
			int num;
				
			for(num = 0; ; num++) {
			
				sum += num;
				if (sum >= 500) {
					break;
				}
			}
			
			System.out.println("sum : " + sum);
			System.out.println("num : " + num);
		}
}
