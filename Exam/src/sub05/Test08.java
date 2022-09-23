package sub05;

import java.util.Iterator;

/*
 * 날짜 : 2022/09/23 
 * 이름 : 이민혁
 * 내용 : 자바 총정리 연습문제
 */

public class Test08 {

		public static void main(String[] args) {
			
			for (int y = 1; y <= 9; y++) {
				for (int x = 2 ; x <= 9 ; x++) {
					
					System.out.printf("%d x %d = %2d\t",x,y,x*y  );
				} // 2번째 for
				System.out.println("\n");
			} // 1번째 for
		}
}
