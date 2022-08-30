package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _01 {
	
	public static void main(String[] args) throws IOException{
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int N = Integer.parseInt(br.readLine());
			
			int max = -1000000; // 최대, 최소값 초기화
			int min = 1000000;
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < N; i++) {
				
				int num = Integer.parseInt(st.nextToken());
				
				if ( num > max) max = num;
				// 입력받은 num 값이 max (-1000000) 보다 크면 num 은 최대값 값으로 저장
				
				if ( num < min ) min = num;
				// 입력받은 num 값이 min (1000000) 보다 작으면 num 은 최소값으로 저장
				
			} // for문 마무리
			
				System.out.println(min + " " + max);
		}
	}

