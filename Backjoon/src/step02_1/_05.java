package step02_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _05 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		// 입력받은 분이 30분이라면 45분, 입력받은 분이 25분이면 45분이다.
		// 입력하는 분이 45분 보다 아래라면 시간은 -1 씩 해준다. 
		// 그리고 시간이 0보다 작아질 경우 23으로 수정한다.
		
		if ( M < 45 ) {
			H --;
			M = 60 - (45 -M);
			
		if (H < 0) {
			H = 23;
		}
	
		System.out.println(H + " " + M);
	}	
		else {
			System.out.println(H + " " + (M - 45));
		}
		
	}
}
