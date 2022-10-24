package ch07;

public class EnhanceForLoop {
		public static void main(String[] args) {
			
			String[] strArray = new String[5];
			
			strArray[0] = "Java";
			strArray[1] = "Android";
			strArray[2] = "C";
			strArray[3] = "JavaScript";
			strArray[4] = "Python";
			
			for(String lang : strArray) {
				System.out.println(lang);
			}
			
			int[] numArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			for (int num : numArray) {
				System.out.print(num + " ");
			}
			
		}
		

		
		
}
