package Star01;

public class Test_05 {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 4; i++) {
			
			for(int e = 0; e < 4 - i; e++) {
					System.out.print("☆"); }
			
			
			for(int j = 1; j < i+i ; j++) {
				System.out.print("★");
			}
			
			
			for(int end = 1; end < 5-i ; end++) {
				System.out.print("☆");
			}
			
			System.out.println();
			
			}	
		
	}
}

