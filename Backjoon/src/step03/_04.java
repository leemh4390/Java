package step03;

import java.util.Scanner;

public class _04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt(); //구매한 물건 가격의 총 합
		int count = sc.nextInt(); //구매한 물건 종류의 합
		
		for (int i = 0; i < count; i++) {

			int price = sc.nextInt(); //물건 가격
			int num = sc.nextInt(); //구매한 물건의 갯수
		
		total = total -(num * price);
	}
			if(total == 0) {
				System.out.println("YES");
			}
			else { 
				System.out.println("No");
			}
		
		sc.close();
	}
}
