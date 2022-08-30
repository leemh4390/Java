package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _04 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); //입력 갯수
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
		int max = 0;
		
		double sum = 0.0;
		
		for(int i = 0; i < N; i++) {
			int value = Integer.parseInt(st.nextToken());
			
			if(value > max)
				max = value;

				sum += value;
		}
		
			System.out.println(((sum/max)*100)/N);
		
		}
}
