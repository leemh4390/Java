package step01;

import java.util.Scanner;

public class _07 {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	
	System.out.println(num1 + num2);
	System.out.println(num1 - num2);
	System.out.println(num1 * num2);
	System.out.println(num1 / num2);
	System.out.println(num1 % num2);

	sc.close();
	
	}
}
