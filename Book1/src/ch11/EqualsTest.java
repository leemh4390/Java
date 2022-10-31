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
	
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentId == std.studentId)
				return true;
			else return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentId;
	}
}
public class EqualsTest {
	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "이상원");
		Student studentLee2 = studentLee; 
		Student studentSang = new Student(100, "이상원");
		
		if(studentLee == studentLee2) {
			System.out.println("studentLee 와 studentLee2 의 주소는 같습니다.");
		}else {
			System.out.println("studentLee 와 studentLee 2 는 주소는 다릅니다.");
		}if(studentLee.equals(studentLee2)) {//equals 매서드로 비교
			System.out.println("studentLee 와 studentLee2 와 동일합니다.");
		}else {
			System.out.println("studentLee 와 studentLee2 와 동일하지 않습니다.");
		}if(studentLee == studentSang) {
			System.out.println("studentLee 와 studentSang 과 주소는 같습니다.");
		}else {
			System.out.println("studentLee 와 studentSang 과 주소는 다릅니다.");
		}if(studentLee.equals(studentSang)) { //equals 매서드로 비교
			System.out.println("studentLee 와 studentSang 과 동일합니다.");
		}else {
			System.out.println("studentLee 와 studentSang 과 동일하지 않습니다.");
		}
		System.out.println("studentLee 의 hashCode : " + studentLee.hashCode());
		System.out.println("studentSang 의 hashCode : " + studentSang.hashCode());
		
		System.out.println("studentLee 의 실제 주소값 : " + System.identityHashCode(studentLee));
		System.out.println("studentSang 의 실제 주소값 : " + System.identityHashCode(studentSang));
	}

}
