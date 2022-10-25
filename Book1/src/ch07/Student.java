package ch07;

import java.util.ArrayList;

public class Student {
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList; //ArrayList 선언하기
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject s : subjectList) {
		total += s.getScorePoint(); // 총점 더하기
		System.out.println("학생 " + studentName + "의" + s.getName() + " 과목 성적은"
				+  s.getScorePont() + "입니다.");
		}
		System.out.println("학생" + studentName + "의 총점은" + total + "입니다.");
	}
}