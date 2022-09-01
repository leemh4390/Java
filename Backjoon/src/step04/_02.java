package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _02 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
				int max = 0;
			
				int k = 0;
			
			for ( int i =0; i < 9; i++) {
				
			int va1 = Integer.parseInt(br.readLine());
				
			if ( va1 > max) {
				max = va1;
				
				k = i+1;
					}
				
			}
			
			System.out.println(max);
			System.out.println(k);
			
				

	}
}