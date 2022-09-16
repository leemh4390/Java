package sub04;

/*
 * 날짜 : 2022/09/16 
 * 이름 : 이민혁
 * 내용 : String, Wrapper 실습하기
 * 
 */

public class Test05 {
		public static void main(String[] args) {
			
			String strCsv = "60, 72, 82, 86, 92";
			String [] scores = strCsv.split(",");
					
			int total = 0;
			
			for(int i = 0 ; i < scores.length; i++) {
				
				total += Integer.parseInt(scores[i]); 
			}
			
			System.out.println("총점 : " + total);
			
			
		}
}
