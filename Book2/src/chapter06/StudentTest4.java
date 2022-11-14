package chapter06;

public class StudentTest4 {
	public static void main(String[] args) {
		Student2 studentLee = new Student2();
		studentLee.setStudentName("이지원");
		System.out.println(Student2.getSerialNum()); //클래스 이름으로 참조
		System.out.println(studentLee.studentName + " 학번: " + studentLee.studentID + " 입니다.");
		
		Student2 studentSon = new Student2();
		studentSon.setStudentName("손수경");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentSon.studentName + " 학번: " + studentSon.studentID + " 입니다.");
	}
}
