package Star01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_01 {
	
	public static void main(String[] args) throws IOException{
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int N = Integer.parseInt(br.readLine());
		
			for(int start = N; start >= 1; start--) {
			
				for(int end = 0; end < start ; end++) {
					
					System.out.print("★");
			}	
						
					System.out.println();
		}	
	}
}
