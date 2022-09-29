package ch03;

public class P78 {
		public static void main(String[] args) {
			
			int num1 = 10;
			int i = 2;
			
			boolean value = ((num1 = num1 + 10) < 10) &&  ((i = i + 2) < 10);
			System.out.println(value);
			System.out.println(num1);
			System.out.println(i);
			
			value = ((num1 = num1 + 10) > 10) || ((i = i+2) < 10);
			System.out.println(value);
			System.out.println(num1);
			System.out.println(i);
			
			int num = 5;
			int j = 10;
			
			boolean value1 = ((num = num * 10) > 45) || ((i = i - 5) < 10);
			System.out.println(value1); // ---- 50
			System.out.println(num); // --- 50
			System.out.println(j); // --- j
		}
}
