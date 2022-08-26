package sub02;

/*
 * 날짜 : 2022/08/26 
 * 이름 : 이민혁
 * 내용 : Java 피보나치 수열 재귀 메서드 연습문제
 */

public class Test10 {
		public static void main(String[] args) {
			
			for(int i =0; i < 10; i++) {
				System.out.print(fibo(i) + " ");
			}
		}
		
		public static int fibo(int n) {
			
			if (n <= 1) {
				return n;
			}
			return fibo(n-1) + fibo(n-2);
		}
}