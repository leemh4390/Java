package ch06;

public class Student1 {
	public static int serialNum = 1000;
	public int StudentID;
	public String studentName;
	public int grade;
	public int address;	
	
	public Student1() {
		serialNum++;
		StudentID = serialNum;
	}
			
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	

	

}

