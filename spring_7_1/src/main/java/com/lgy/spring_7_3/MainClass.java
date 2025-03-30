package com.lgy.spring_7_3;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:applicationCTX3.xml");
		
		Student student = ctx.getBean("stduent1",Student.class);
		
		System.out.println("�̸�: "+student.getName());
		System.out.println("����: "+student.getAge());
		System.out.println("==========================");
		

		Student student2 = ctx.getBean("stduent1",Student.class);
		student2.setName("ȫ����");
		student2.setAge(100);
		System.out.println("�̸�: "+student2.getName());
		System.out.println("����: "+student2.getAge());
		System.out.println("==========================");
		
		if(student.equals(student2)) {
			System.out.println("student == student2");
		}
		else {
			System.out.println("student != student2");
		}
		
		ctx.close();
	}
}
