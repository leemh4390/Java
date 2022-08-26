package sub02;

/*
 * 날짜 : 2022/08/26 
 * 이름 : 이민혁
 * 내용 : Java 최대공약수 재귀 메서드 연습문제
 * 
 * 유클리드 호제법
 * - 두 개의 자연수에 대해 최대공약수를 구하는 대표적인 기법
 * - 두 자연수 A, B 에 대해서 A>B 일 때 A 를 B 로 나눈 나머지를 R 이라고 하면
 *   A 와 B 의 최대 공약수는 B 와 R 의 최대 공약수와 같다
 *   
 *  예 ) 192 와 162 최대 공약수는 아래와 같다
 * 		 192  162
 * 		 162  30
 * 	     30   12
 * 		 12   6
 * 
 */

public class Test09 {
		public static void main(String[] args) {
			
			System.out.println("1 과 5의 최대공약수 : " +gcd(5,1));
			System.out.println("3 과 6의 최대공약수 : " +gcd(3,6));
			System.out.println("12 과 18의 최대공약수 : " +gcd(12,18));
			System.out.println("60 과 24의 최대공약수 : " +gcd(60,24));
			System.out.println("192 과 162의 최대공약수 : " +gcd(192,162));
		}
		
		public static int gcd(int a, int b) {
			if (a%b == 0){
				return b;
			} else {
				return gcd(b,a%b);
			}
		}
}
