package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10_3 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		
		
		st = new StringTokenizer(br.readLine()," ");
		
		for(int i=0; i < N; i++) {
			
		int A = Integer.parseInt(st.nextToken());
			if(A < X) {
				sb.append(A).append(' ');
			}
			
		}	
			System.out.println(sb);
					
		
		
		
	}
}
