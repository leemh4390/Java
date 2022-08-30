package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _05_4 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		
		
		
		for(int i = 0; i < T; i++) {
			
			st = new StringTokenizer(br.readLine()," ");
	
			int A = Integer.parseInt(st.nextToken());
				
			int B = Integer.parseInt(st.nextToken());
			
			sb.append(A+B).append('\n');
		
		}
		
		System.out.println(sb);
	}
}
