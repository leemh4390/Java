package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _01_2 {
	
		public static void main(String[] args) throws IOException{
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int N = Integer.parseInt(br.readLine());
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int max = 0;
			
			int min = 100000;
			
			for(int i =0; i < N; i++) {
				int A = Integer.parseInt(st.nextToken());
				
				if(A > max)
					max = A;
				if ( A < min)
					min = A;
			}
			
			System.out.println(min + " " +max);
			
		}
}
