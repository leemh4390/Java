package chapter07;

/*
 *  자료형 [] 배열 이름 = new 자료형[갯수];
 *  자료형 배열이름 [] = new 자료형[갯수];
 *  int [] studentID = new int[10]; int형 요소가 10개인 배열 선언
 *  int [] studentID = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} 갯수는 생략가능 
 *  int [] studentID = new int [10] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} [] 안에 숫자를 넣으면 오류 발생
 *  int [] studentID = {1, 2, 3, 4, 5, 6} new int 생략 가능함
 * 
 */
public class ArrayTest {
	public static void main(String[] args) {
		int [] num = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
		int total = 0;
		
		for (int i = 0; i < num.length; i++) {
			total += num[i];
		}
		
		System.out.println(total);
	}
}
