package chapter07;

public class EnhanceForLoop {
	public static void main(String[] args) {
		String [] strArray = new String[] {"Java", "Android", "C", "JavaScript", "Python"};
		
		for(String lang : strArray) {
			System.out.println(lang);
		}
	}
}
