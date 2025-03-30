package com.lgy.spring_7_1;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:applicationCTX.xml");
		
		Student student = ctx.getBean("stduent1",Student.class);
		
		System.out.println("�̸�: "+student.getName());
		System.out.println("����: "+student.getAge());
		
		ctx.close();
	}
}
