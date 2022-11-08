package ch14;

public class AutoCloseObjTest {
		public static void main(String[] args) {
			try(AutoCloseObj obj = new AutoCloseObj()){
				throw new Exception();
			}catch(Exception e) {
				System.out.println("예외 부분입니다.");
			}
		}
}
