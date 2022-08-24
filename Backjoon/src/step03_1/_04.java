package step03_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _04 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		double a = Integer.parseInt(st.nextToken());
		double b = Integer.parseInt(st.nextToken());
		
		System.out.println(a/b);
		
//---------------------------------------------------------------
		
		
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextInt();
		double B = sc.nextInt();
		
		System.out.println(A/B);
		
		sc.close();
		
	}
}
