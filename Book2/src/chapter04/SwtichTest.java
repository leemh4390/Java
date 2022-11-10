package chapter04;

import java.util.Scanner;

public class SwtichTest {
	public static void main(String[] args) {
		
		System.out.println("층수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		int floor = sc.nextInt();
		
		switch(floor) {
		
			case 1 : 
				System.out.println("약국입니다.");
				break;
				
			case 2 : 
				System.out.println("정형외과입니다.");
				break;
				
			case 3 : 
				System.out.println("피부과입니다.");
				break;
				
			case 4 : 
				System.out.println("치과입니다.");
				break;
				
			case 5 : 
				System.out.println("헬스클럽입니다.");
				break;
		
		}
	}
}
