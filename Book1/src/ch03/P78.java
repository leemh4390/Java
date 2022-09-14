package ch03;

public class P78 {
		public static void main(String[] args) {
			
			int num1 = 10;
			int i = 2;
			
			boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2 ) < 10);
			System.out.println(value);
			System.out.println(num1);
			System.out.println(i);
			
			
			value = ((num1 = num1 + 10) > 10) || ((i = i + 2 ) < 10);
			System.out.println(value);
			System.out.println(num1);
			System.out.println(i);
			
			int num = 5;
			int j = 10;
			
			value = ((num = num * 10)) > 45 || ((j = j - 5) < 10);
			System.out.println(value);
			System.out.println(num);
			System.out.println(j);
			
		}
}
