package com.lgy.spring_7_1;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:applicationCTX.xml");
		
		Student student = ctx.getBean("stduent1",Student.class);
		
		System.out.println("이름: "+student.getName());
		System.out.println("나이: "+student.getAge());
		
		ctx.close();
	}
}
