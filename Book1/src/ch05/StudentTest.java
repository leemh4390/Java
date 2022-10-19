package ch05;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		//studentAhn.studentName = "안승연";
		studentLee.setStudentName("이상원");
		
		System.out.println(studentLee.getStudentName());
	}

}
