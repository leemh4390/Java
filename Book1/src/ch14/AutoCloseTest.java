package ch14;

public class AutoCloseTest {
		public static void main(String[] args) {
			try(AutoCloseObj obj = new AutoCloseObj()){
				
			}catch(Exception e) {
				System.out.println("예외 부분입니다.");
			}
		}
}
