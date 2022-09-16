package sub04;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/16 
 * 이름 : 이민혁
 * 내용 : Java 예외처리 실습하기
 * 
 */

class NotfoundException extends Exception {
	public NotfoundException() {
		super ("해당하는 숫자를 찾을 수 없습니다.");
	}
}

public class Test02 {
		public static void main(String[] args) {
			
			int [] arr = {2, 4, 6, 8, 10};
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("찾을 숫자 입력 : ");
			int find = sc.nextInt();
			
			try {
				searchArray(find, arr);
				System.out.println("해당하는 숫자 찾음!!");
				
				
			} catch (NotfoundException e) {
				System.out.println(e.getMessage());
				
			} finally {
				sc.close();
			}
			
			System.out.println("프로그램 정상 종료...");
		} 
		
		public static void searchArray(int find, int[] arr) throws NotfoundException {
			
			for (int i : arr) {
				if (i == find) {
					return;
				}
			}
			throw new NotfoundException();
		}
}
