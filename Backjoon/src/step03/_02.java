package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/22 
 * 이름 : 이민혁
 * 내용 : 백준 10950번 A 와 B 더하기 
 */

public class _02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A+B);
		
		}
		
		sc.close();
		
	}
}
