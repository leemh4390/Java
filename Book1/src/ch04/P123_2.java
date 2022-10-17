package ch04;

public class P123_2 {
		public static void main(String[] args) {
			
			for(int x = 2; x <= 9; x++) {
				for (int y =1; y <=9; y++) {
					
				if (y >= x+1) {
					break;
				}
					System.out.println(x + "X" + y + "=" + x*y);
				}
				System.out.println();
			}
		}
}
