package ch06;

class Person {
		private String name;
		private int age;
	
	Person() {
		this("이름 없음", 1);
	}
	
	Person(String name, int age) {
		this.setName(name);
		this.setAge(age);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class CallAnotherConst {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.getName());
		System.out.println(noName.getAge() + "살");
	}
}
