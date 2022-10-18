package ch05;

public class PersonTest1 {
	public static void main(String[] args) {
		PersonTest personKim = new PersonTest();
		
		personKim.name = "김유신";
		personKim.weight = 85.5F;
		personKim.height = 180.0F;
		
		PersonTest personLee = new PersonTest("이순신",175,75);
		
	}
}
