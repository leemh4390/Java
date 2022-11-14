package chapter05;

public class StudentTest {
	public static void main(String[] args) {
		
		Student studentAhn = new Student();
		studentAhn.setStudentName("안승연");
		
		//System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
