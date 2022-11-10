package chapter02;

public class CharacterEx1 {
	public static void main(String[] args) {
		
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		//문자를 int형으로 변환하여 출력하면 문자에 해당하는 정수 값을 알 수 있다.
		
		char ch2 = 66;
		System.out.println(ch2);
		//문자형 변수에 정수 값을 대입하면 그 정수 값에 해당하는 
		//문자가 출력된다.
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);		
		//숫자를 char형으로 변환하여 출력하면 그 정수값에 해당하는 문자를 알 수 있다.
		
		//1분 복습
		char ch4 = 'Z';
		int ch5 = 38;
		int ch6 = 97;
		
		System.out.println("Z 의 정수값은 : " + (int)ch4);
		System.out.println("38 의 문자형은 : " + (char)ch5);
		System.out.println("97 의 문자형은 : " + (char)ch6);
		
		
		
	}
}
