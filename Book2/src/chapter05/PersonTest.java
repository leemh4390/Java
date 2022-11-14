package chapter05;

public class PersonTest {
	public static void main(String[] args) {
		Person personKim = new Person();
		personKim.name = "김유신";
		personKim.height = 180.8f;
		personKim.weight = 85.5f;
		
		Person personLee = new Person("이순신",175,75);
		
	}
}
