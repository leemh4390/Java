package sub01;

import java.util.Scanner;

public class Solution02 {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = 0;
			
			for (int i = 1; i <= a; i++) {
				if (a % i == 0) {
					b += i;
				}
			
			}
			System.out.println(b);
		}
}


