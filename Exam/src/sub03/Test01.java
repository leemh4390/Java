package sub03;

/*
 * 
 * 
 * 
 */
	
public class Test01 {
	
		private String name;
		private int age;
	
		public Test01 (String name, int age) {
			this.name = name;
			this.age = age;
	}
	
		public void show() {
			System.out.println("==========");
			System.out.println("이름 : " + this.name);
			System.out.println("나이 : " + this.age);
			System.out.println("------------");
	}
	
		public static void main(String[] args) {
			
			Test01 kim = new Test01("김유신", 23);
			Test01 lee = new Test01("이순신", 31);
			
			kim.show();
			lee.show();
			
	}
	
}
