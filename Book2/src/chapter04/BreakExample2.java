package chapter04;

public class BreakExample2 {
	public static void main(String[] args) {
		
		int sum = 0;
		int num = 0;
		
		for(num = 0; ; num++) {
			sum += num;
			if(sum >= 100) {
				break;
			}
		}
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
		
		// 추가 예제
		
		int i = 0;
		int total = 0;
		
		for(i = 0; ; i++) {
			total += i;
			if(total >= 500) { //break 조건식
				break;  // i 의 값을 계속 더하다가 합계가 500 이상되면 멈추는 반복문
			}
		}
		System.out.println("i : " + i);
		System.out.println("total : " + total);
	}
}
