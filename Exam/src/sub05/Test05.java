package sub05;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/23 
 * 이름 : 이민혁
 * 내용 : 자바 총정리 연습문제
 * 
 */

public class Test05 {

		public static void main(String[] args) {
			
			int price = 187000;
			
			int won50000 = price / 50000 ;
			int won10000 = (price % 50000)/10000;
			int won5000 = (price%50000)%10000/5000;
			int won1000 = (price%50000)%10000%5000/1000 ;
			
			System.out.println("5만원권 : " + won50000 + "장");
			System.out.println("1만원권 : " + won10000 + "장");
			System.out.println("5천원권 : " + won5000 + "장");
			System.out.println("5천원권 : " + won1000 + "장");
			
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			
			System.out.println(a % 4);
			
			
		}
}
