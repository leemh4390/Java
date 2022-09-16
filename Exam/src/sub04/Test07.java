package sub04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * 날짜 : 2022/09/16 
 * 이름 : 이민혁
 * 내용 : 리스트 연습문제
 * 
 */

public class Test07 {
		public static void main(String[] args) {
			
			// 60 ~ 100 사이 임의의 수 10개를 더하므로 결과값이 항상 다름
			printList(creatList());
		}
		
		public static void printList( List<Integer> ScoreList) {
			
			int total = 0;
			int size = ScoreList.size();
					
			for(int i = 0; i<size; i++) {
				
				int score = ScoreList.get(i);
						
				total += score;
				
				System.out.println(score);
				
				if(i == size - 1) {
					System.out.println(" = ");
				} else {
					System.out.println(" + ");
				}
			}
			System.out.println(total);
		}
		
		public static List<Integer> creatList() {
			
			List<Integer> scoreList = new ArrayList<>();
			Random rand = new Random();
			
			for (int i = 1; i <= 10; i++) {
				// 60 ~ 100 사이 임의의 수
				int num = rand.nextInt(41) + 60;
				scoreList.add(num);
			}
			
			return scoreList;
		}
}
