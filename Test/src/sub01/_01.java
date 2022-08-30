package sub01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _01 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력을 받아들인다.
		
		StringTokenizer st = new StringTokenizer(br.readLine()); // 입력받은 문장을 단위로 쪼갬
		
		int N = Integer.parseInt(st.nextToken()); // 매개변수 입력
		
		int X = Integer.parseInt(st.nextToken()); // 매개변수 입력
		
		st = new StringTokenizer(br.readLine()," "); 
		
		for(int i =0; i < N ; i++) {
			
		int num = Integer.parseInt(st.nextToken());
			
			if(num < X) 
				System.out.print(num + " ");
			
		}
	}
}
