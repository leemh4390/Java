package sub07; 
	
class _Person {
	private String name;
	private int age;
	
	public _Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void Hello() {
		System.out.println("-------");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}

class _Student extends _Person {
	private String school;
	private String major;
	
	public _Student (String name, int age, String school, String major) {
		super(name, age);
		this.school = school;
		this.major = major;
	}
	
	public void Hello() {
		super.Hello();
		System.out.println("학교 : " + school);
		System.out.println("전공 : " + major);
	}
}

class _SalaryStudent extends _Student {
		private String company;
		
		public _SalaryStudent (String name,int age, String school, String major) {
			super(name, age, school, major);
			this.company = company;
		}
		
		public void Hello() {
			super.Hello();
			System.out.println("회사 : " + company);
		}
}

public class Test06 {
	
}


