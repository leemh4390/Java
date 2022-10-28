package ch11;

class Student{
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return studentId + ", " + studentName;
	}
	
	
}
public class EqualsTest {
	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "이상원");
		Student studentLee2 = studentLee; 
		Student studentSang = new Student(100, "이상원");
		
		if(studentLee == studentLee2) {
			System.out.println("");
		}
	}

}
