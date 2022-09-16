package sub04;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 날짜 : 2022/09/16 
 * 이름 : 이민혁
 * 내용 : Java 예외처리 실습하기
 * 
 */

public class Test01 {
		public static void main(String[] args) {
			
			int answer = (int) (Math.random()*10)+1;
			int input = 0;
			int count = 0;
			
			do {
				count++;
				System.out.println("-------------");
				System.out.println("answer 의 값을 맞춰보세요");
				System.out.println("1~10 사이의 값을 입력 : ");
				
				try {
					Scanner sc = new Scanner(System.in);	
					input = sc.nextInt();
					
					if (input < 0) {
						throw new Exception("음수는 입력할 수 없습니다.");
				}
					
				} catch (InputMismatchException e) {
					System.out.println("숫자가 아닙니다. 숫자를 입력하세요.");
					continue;
				} catch (Exception e) {
					System.out.println(e.getLocalizedMessage());
					continue;
				}
				
				if ( answer > input ) {
					System.out.println("더 큰 수를 입력하세요.");
				} else if (answer < input ) {
					System.out.println("더 작은 수를 입력하세요.");
				} else {
					System.out.println("answer : " + answer);
					System.out.println("정답입니다.");
					System.out.println("시도 횟수 : " + count + "회");
					break;
				}
			} while(true);
			
			System.out.println("프로그램이 정상 종료 되었습니다.");
			
		} // main end
}
