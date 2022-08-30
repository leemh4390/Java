package Star01;

import java.util.Scanner;

public class Test_03 {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			
			for(int start = 1; start <= N; start++) {
				for(int end = 0; end < start; end++) {
					System.out.print("★");
				}
				System.out.println();
			}
	}
}
