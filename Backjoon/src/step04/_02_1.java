package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _02_1  {
	
		public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
			
		int arr[] = new int[9];
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int max = 0;
		
		for(int j = 0; j < arr.length; j++) {
			if (max < arr[j])
				max = arr[j];
			
		}
		
		System.out.println(max);
		
	}
}
