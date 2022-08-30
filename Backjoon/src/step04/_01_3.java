package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _01_3 {
	public static void main(String[] args) throws IOException{
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int N = Integer.parseInt(br.readLine());
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int max = 0;
			int min = 1000000;
			
			for(int i = 0; i < N; i++) {
				
			int value = Integer.parseInt(st.nextToken());
			
			if (value > max) 
				max = value;
			
			if(value < min)
				min = value;
			
			}
			
			System.out.println(min + " " + max);
			
	}
}
