package com.lgy.spring_ex3_3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.lgy.spring_ex3_3.MySeason;

public class MainSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configLoc = "classpath:seasonCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		MySeason myseason = ctx.getBean("myseason",MySeason.class);
		
		myseason.result();
	}	

}
