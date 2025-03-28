package com.lgy.spring_5_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class MainClass {
	public static void main(String[] args) {
		String path = "classpath:application.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		StudentInfo studentinfo = ctx.getBean("studentInfo",StudentInfo.class);
		studentinfo.getStudentInfo();
		
		Student student2 = ctx.getBean("student2", Student.class);
		studentinfo.setStudent(student2);
		studentinfo.getStudentInfo();
		ctx.close();
	}
}	
