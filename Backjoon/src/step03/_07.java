package step03;

import java.util.Scanner;

public class _07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		for(int i = 1; i <= count; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
		
			System.out.println("Case #" + i + ": "+  A + " + " + B + " = " + (A + B));
		}
		
		sc.close();
	}
}
