package com.lgy.spring_ex3_2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.lgy.spring_ex3_2.MyRectangle;

public class MainRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configLoc = "classpath:rectangleCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		MyRectangle myrect = ctx.getBean("myrect",MyRectangle.class);
		
		myrect.ar();
	}

}
