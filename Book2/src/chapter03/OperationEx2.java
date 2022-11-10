package chapter03;

public class OperationEx2 {
	public static void main(String[] args) {
		
		int gameScore = 150;
		
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1);
		
		int lastScore2 = --gameScore;
		System.out.println(lastScore2);
		
		// 추가 예제
		int gameScore1 = 150;
		
		int lastScore3 = gameScore1++;
		System.out.println(lastScore3);
		
		int lastScore4 = gameScore1--;
		System.out.println(lastScore4);
		
	}
}
