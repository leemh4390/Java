package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _05_3 {
	
		public static void main(String[] args) throws IOException{
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			int T = Integer.parseInt(br.readLine());
		
			StringBuilder sb = new StringBuilder();
		
			for(int i = 0; i < T; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			int A = Integer.parseInt(st.nextToken());
			
			int B = Integer.parseInt(st.nextToken());
			
			sb.append(A+B).append('\n');
		}
		
			System.out.println(sb);
		
	}	
}
