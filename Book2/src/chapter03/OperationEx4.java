package chapter03;

public class OperationEx4 {
	public static void main(String[] args) {
		
		
		int fatherAge = 45;
		int motherAge = 47;
		
		String str;
		 str = (fatherAge < motherAge) ? "True" : "False";
		
		System.out.println(str);
		
		//추가 예제
		
		int num = 10;
		boolean isEven;
		isEven = (num % 2 == 0) ? true : false;
		System.out.println(isEven);
		
	}
}
