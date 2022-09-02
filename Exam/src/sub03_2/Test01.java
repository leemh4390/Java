package sub03_2;

/*
 * 날짜 : 2022/09/02
 * 이름 : 이민혁
 * 내용 : 자바 클래스 연습문제
 * 
 */

public class Test01 {
		private String name;
		private int age;
		
		public Test01(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		public void show() {
			System.out.println("==========");
			System.out.println("이름 : " + name);
			System.out.println("나이 : " + age);
			System.out.println("-----------");
			
		}
		
		public static void main(String[] args) {
			
			Test01 kim = new Test01 ("김유신", 23);
			Test01 lee = new Test01 ("이순신", 31);
			
			kim.show();
			lee.show();
			
		}
		
		
		
}
