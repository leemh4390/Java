package ch03;

public class P75 {
		public static void main(String[] args) {
			int gameScore = 150;
			
			int lastScore1 = ++gameScore;
			System.out.println(lastScore1);
			
			int lastScore2 = --gameScore;
			System.out.println(lastScore2);
			
			int value = 10;
			int num = value++;
			System.out.println(num);
			
			
			int num1 = 10;
			int num2 = 20;
			
			boolean flag = (num1 > 0) && (num2 > 0);
			System.out.println(flag);
			
			flag = (num1 < 0) && (num2 >0);
			System.out.println(flag);
			
			flag = (num1 < 0) || (num2 >0);
			System.out.println(flag);
			
		}
}
