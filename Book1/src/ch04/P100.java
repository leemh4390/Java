package ch04;

public class P100 {
		public static void main(String[] args) {
			
			int Score = 50;
			char grade;
			
			if (Score >= 90) {
				grade = 'A';
			} else if (Score >= 80) {
				grade = 'B';
			} else if (Score >= 70) {
				grade = 'C';
			} else if (Score >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
			
			System.out.println("점수는 : " + Score + "입니다.");
			System.out.println("등급은 : " + grade + "입니다.");
		}
		
			
}
