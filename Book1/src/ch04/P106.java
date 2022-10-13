package ch04;

import java.util.Scanner;

public class P106 {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int Build = sc.nextInt();
			
			switch (Build) {
			
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
			
			default :
				System.out.println("엘리베이터를 눌러주세요.");
				break;
				
				
			}
		}
}
