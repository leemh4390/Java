package ch11;

public class StringBuilderTest {
		public static void main(String[] args) {
			
			String javaStr = new String("Java");
			System.out.println("javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
			
			StringBuilder buff = new StringBuilder(javaStr);
			System.out.println("첫번째 buff : " +buff);
			System.out.println("연산 전 buff 메모리 주소 : " + System.identityHashCode(buff));

			
			buff.append(" and");
			buff.append(" android");
			buff.append(" programming is fun!!");
			System.out.println("두번째 buff : " +buff);
			System.out.println("연산 후  buff 메모리 주소 : " + System.identityHashCode(buff));

			
			javaStr = buff.toString();
			System.out.println(javaStr);
			System.out.println("연결된 javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
			
		}
}
