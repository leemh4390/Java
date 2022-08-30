package Star01;

public class Test_02 {
	public static void main(String[] args) {
		
		for(int start = 5; start >= 1; start--) {
			for(int end = 0; end < start; end++) {
				
				System.out.print("★");
			}
			
			System.out.println();
		}
	}
}