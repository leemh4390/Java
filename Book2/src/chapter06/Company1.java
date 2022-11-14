package chapter06;

public class Company1 {
	private static Company1 instance = new Company1();
	private Company1() {}
	
	public static Company1 getInstance() {
		return instance;
	}
}
