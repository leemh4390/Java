package ch13;

interface PrintString{
	void showString(String str);
}

public class TestLambda {
		public static void main(String[] args) {
			
			PrintString lambdaStr = a -> System.out.println(a);
			lambdaStr.showString("hello lambda_1");
			showMyString(lambdaStr);
			
			PrintString reStr1 = returnString1();
			reStr1.showString("hello");
			
			PrintString reStr = returnString();
			reStr.showString("hello");
			

			
		}
			
		public static void showMyString(PrintString p) {
			p.showString("hello lambda_2");
		}
		
		public static PrintString returnString1() {
			PrintString str1 = s -> System.out.println(s + "~world");
			return str1;
		}
		
		public static PrintString returnString() {
			return s -> System.out.println(s +  "world");
		}
}
