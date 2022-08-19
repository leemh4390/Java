package step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19  
 * 이름 : 이민혁
 * 내용 : Java 예습 문제
 * 
 */

public class _10 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int K = sc.nextInt();
	int Q = sc.nextInt();
	int R = sc.nextInt();
	int B = sc.nextInt();
	int Knight = sc.nextInt();
	int P = sc.nextInt();
	
	sc.close();
	
	System.out.printf("%d %d %d %d %d %d", 1- K , 1 - Q, 2 - R , 2 - B , 2 - Knight, 8 - P);
	sc.close();
	}
}
