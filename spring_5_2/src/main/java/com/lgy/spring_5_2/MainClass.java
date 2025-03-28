package com.lgy.spring_5_2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;



public class MainClass {
	public static void main(String[] args) {
		String path = "classpath:application.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		/*
		 * Pencil6WithEraser pencil1 = ctx.getBean("Pencil1",Pencil6WithEraser.class);
		 * Pencil6B pencil2 = ctx.getBean("Pencil2",Pencil6B.class); Pencil4B pencil3 =
		 * ctx.getBean("Pencil3",Pencil4B.class); pencil1.use(); pencil2.use();
		 * pencil3.use();
		 */
		
		// Pencil.class : 인터페이스도 사용가능(참조변수는 인터페이스로 받으면 됨)
		Pencil pencil1 = ctx.getBean("Pencil1", Pencil.class);
		pencil1.use();

		Pencil pencil2 = ctx.getBean("Pencil2", Pencil.class);
		pencil2.use();
		
		Pencil pencil3 = ctx.getBean("Pencil3", Pencil.class);
		pencil3.use();
		ctx.close();
	}
}
