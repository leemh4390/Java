package chapter04;

public class IfExample1 {
	public static void main(String[] args) {
		
		int age = 7;
		
		if(age >= 8) {
			System.out.println("학교에 다닙니다.");
		}else {
			System.out.println("학교에 다니지 않습니다.");
		}
		
		// 추가 예제
		char gender = 'F';
		if (gender == 'F' || gender =='f') {
			System.out.println("여성입니다.");
		}else {
			System.out.println("남성입니다.");
		}
	}
}
