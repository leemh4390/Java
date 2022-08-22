package step03;

import java.util.Scanner;
/*
 * 날짜 : 2022/08/22
 * 이름 : 이민혁 
 * 내용 : for문으로 구구단 출력하기
 * 
 */

public class _01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		
		for(int B = 1; B<10; B++) {
			System.out.println(A + " * " + B + " = " + A*B );
		}
		
		sc.close();
	}
}
