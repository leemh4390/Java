package step01_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//String str = br.readLine();
		//StringTokenizer st = new StringTokenizer(str," ");
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		System.out.println(A * (B % 10));
		System.out.println(A * ((B / 10)%10));
		System.out.println(A * (B / 100));
		System.out.println(A * B);
	}
}
