package com.lgy.spring_ex3_7;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class MainRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String configLoc = "classpath:rectangleCTX_2.xml";
				AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
				MyRectangle myrect = ctx.getBean("myrect",MyRectangle.class);
				
				myrect.pc();
	}

}
