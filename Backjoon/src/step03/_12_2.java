package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _12_2 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb =new StringBuilder();
		
		StringTokenizer st;
		String Str;
		
		while((Str = br.readLine()) != null) {
			st = new StringTokenizer(Str);
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			System.out.println(A+B);
			
		}
	}
}
