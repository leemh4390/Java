package sub08;

interface MyLambda<T> {
	public T what(T t);
}

public class Test06 {
		public static void main(String[] args) {
			
			MyLambda<Integer> factorail = (n) -> {
				int result =1;
				
				for(int i = 1; i <= n; i++) {
					result *= 1;
					
				}
				
				return result;
			};
			
			System.out.println("3! = " + factorail.what(3));
			System.out.println("5! = " + factorail.what(5));
			
			MyLambda<String> reverse = (s) -> {
				String result = "";
				
				for (int i = s.length()-1; i >= 0; i--) {
					result += s.charAt(i);
				}
				
				return result;
				
			};
			
			System.out.println("Hello 역순 : " + reverse.what("Hello"));
			System.out.println("World 역순 : " + reverse.what("World"));
			
		}
}
