package ch04;

public class P123_1 {
		public static void main(String[] args) {
			
			for(int x = 2; x <= 9; x++) { 
				for(int y  = 1; y <= 9; y++) {
					
					if (x % 2 == 1) { // 단이 홀수일 경우 수행을 생략
						continue;
						
					}
					System.out.println(x + "x" + y + "=" + x * y);
				}
				System.out.println();
			}
		}
}
