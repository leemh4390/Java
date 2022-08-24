package step03_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _09 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str, " ");
		
		int King = Integer.parseInt(st.nextToken());
		int Queen = Integer.parseInt(st.nextToken());
		int rook = Integer.parseInt(st.nextToken());
		int bishop = Integer.parseInt(st.nextToken());
		int knight = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		
		System.out.printf("%d %d %d %d %d %d\n", 1 - King, );
		
		
		
	}
}
