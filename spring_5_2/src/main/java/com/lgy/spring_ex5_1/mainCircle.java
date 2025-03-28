package com.lgy.spring_ex5_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;



public class mainCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "classpath:circleCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		CircleInfo circleinfo = ctx.getBean("circleinfo",CircleInfo.class);
		circleinfo.getCircleInfo();
		
		Circle circle2 = ctx.getBean("circle2", Circle.class);
		circleinfo.setCircle(circle2);
		circleinfo.getCircleInfo();
		
		
		
		ctx.close();
	}

}
