package step02_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _06 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(br.readLine());
		
		int tot = (A*60)+B+C ;//합계
		
		int time = tot/60; //시간
		
		int minute = tot%60; //분
		
		if ( time >= 24) {
			time =	time - 24; }
		
		System.out.println(time + " " + minute);
		
	}
}
