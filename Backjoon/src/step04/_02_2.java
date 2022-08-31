package step04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _02_2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[9]; 
		
		for(int i =0; i < arr.length; i++) {
			
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		
	}
}
