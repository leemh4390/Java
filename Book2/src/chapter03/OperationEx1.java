package chapter03;

public class OperationEx1 {
	public static void main(String[] args) {
		
		int mathScore = 90;
		int engScore = 70;
		
		int totalScore = mathScore + engScore;
		System.out.println(totalScore);
		
		double avgScore = totalScore/2.0;
		System.out.println(avgScore);
		
		// 추가 예제
		// 국어 점수 추가
		
		int koreaScore = 80;
		int totalScore1 = koreaScore + totalScore;
		double avgScore1 = totalScore1/3.0;
		
		System.out.println("3과목 총점은 : " + totalScore1);
		System.out.println("3과목 평균은 : " + avgScore1);
	}
}
