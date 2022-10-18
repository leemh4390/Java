package ch05;

public class Student {
	int StudentId;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
		
	}
	
	public static void main(String[] args) {
		Student studentAhn = new Student(); //Student 클래스 생성
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
	
	
}
