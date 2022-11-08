package ch13;

public class TestStringConcat {
		public static void main(String[] args) {
			
			String s1 = "Hello";
			String s2 = "World";
			StringConcatimpl concat1 = new StringConcatimpl();
			concat1.makeString(s1, s2);
			
			StringConcat concat2 = (s, v) -> System.out.println(s + "," + v);
			concat2.makeString(s1, s2);
		}
}
