package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10 {
	public static void main(String[] args) throws IOException{
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str = br.readLine();
	StringTokenizer st = new StringTokenizer(str," ");
	
	int N = Integer.parseInt(st.nextToken());
	int X = Integer.parseInt(st.nextToken());
	
		for(int i = 0; i <= N; i++) {
			int A = Integer.parseInt(st.nextToken());
			if ( A < X ) System.out.println(A + " ");
		}
	}
}