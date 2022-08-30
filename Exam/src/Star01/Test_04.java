package Star01;

public class Test_04 {
		public static void main(String[] args) {
			
			for (int i = 5; i >= 1 ; i--) {
				
				for(int j = 1; j < i; j++) {
					
					System.out.print("☆");
					
					}
				
				for(int start = 1; start <= 6-i; start++) {
					
						System.out.print("★");
					}	
				
				System.out.println();
		}
	}
}
