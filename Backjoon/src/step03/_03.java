package step03;

import java.util.Scanner;

public class _03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		sc.close();
		
		int tot = 0;
		
		for(int i = 0; i <= A; i++) {
			tot += i;
			
		}
		
		System.out.println(tot);
		
	}
}