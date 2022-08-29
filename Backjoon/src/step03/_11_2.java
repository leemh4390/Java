package step03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class _11_2 {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			st = new StringTokenizer(br.readLine()," ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if(A==0 && B==0) {
				break;
			}
			sb.append((A+B)).append('\n');
		}
		System.out.println(sb);
	}
}