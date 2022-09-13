package sub06;

import java.util.regex.Pattern;

/*
 * 날짜 : 2022/09/08
 * 이름 : 이민혁
 * 내용 : 정규표현식 실습하기
 * 
 * 정규표현식 (Regular Expression)
 * - 특정규칙을 가진 문자열 집합을 표현하기 위한 형식 언어
 * - 문자열 패턴을 검사하거나 또는 문자열 치환에 많이 사용
 * 
 */

public class RegularExpressTest {
		public static void main(String[] args) {
			
			// 정규표현식
			String patt = "b[a-z]*";
			boolean rs1 = Pattern.matches(patt, "bat");
			boolean rs2 = Pattern.matches(patt, "cat");
			
			System.out.println("rs1 : " + rs1);
			System.out.println("rs2 : " + rs2);
			
			// 정규표현식 패턴
			String [] patterns = {".",		// 문자 1개
											"[a-z]?",  //소문자 1개
											"[0-9]+",  // 숫자 1개 이상	
											"0[0-9]*", // 0으로 시작하는 숫자 0개 이상	
											"^[0-9]",  // 숫자로 시작하는 문자
											"[^0-9]",  // 숫자가 아닌 문자
											"[a-z]*",  // 소문자 0개이상 
											"[A-Z]+",  // 대문자 1개 이상
											"[ㄱ-힣]+", // 한글 1글자 이상
											"\\s",	   // 공백
											"\\S",     // 공백이 아닌 문자
											"\\d", 	   // 문자
											"\\w",     // 숫자와 문자
											"\\W"      // 특수문자
			};
			
			String[] words = {"bat", "0101234", "12345", "011", "bed", "hello", "안녕",
							 "02", "A", "a", "7", "#"};
			
			for(String word : words) {
				
				System.out.print(word + "문자와 일치하는 패턴 : ");
				
			for(String p : patterns) {
				boolean result = Pattern.matches(p, word);
				
			if (result) {
				System.out.print(p + ", ");
				}
			}
				System.out.print("\n");
				
			}
			
		}

}
