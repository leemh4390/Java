package step02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _05 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int Hour,Minute;
		Hour = Integer.parseInt(st.nextToken());
		Minute = Integer.parseInt(st.nextToken());
		
		if ( Minute < 45) {
			 Hour--;
			 Minute = 60-(45-Minute);
		if (Hour < 0) {
					Hour = 23;
		}
			System.out.println(Hour + " " + Minute);
		}
		else {
			System.out.println(Hour + " " + Minute);
		}
	}
}
