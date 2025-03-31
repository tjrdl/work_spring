package com.lgy.spring_ex9_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX3.xml");
		Car car = ctx.getBean("car",Car.class);
		
		car.getCarInfo();
		
		System.out.println("======================");
		
		Graphic graphic = ctx.getBean("graphic",Graphic.class);
		
		graphic.getGraphicInfo();
		
		
		
		ctx.close();
	}
}
