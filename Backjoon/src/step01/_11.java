package step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19 
 * 이름 : 이민혁
 * 내용 : Java 연습 문제
 * 
 */

public class _11 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);
		
		sc.close();
	}
}
