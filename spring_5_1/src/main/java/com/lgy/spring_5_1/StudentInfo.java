package com.lgy.spring_5_1;

public class StudentInfo {
	private  Student student;
	
	public StudentInfo(Student student) {
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void getStudentInfo() {
		System.out.println("이름 : "+student.getName());
		System.out.println("나이 : "+student.getAge());
		System.out.println("학년 : "+student.getGradeNum());
		System.out.println("반 : "+student.getClassNum());
		System.out.println("===============================");
	}
}
