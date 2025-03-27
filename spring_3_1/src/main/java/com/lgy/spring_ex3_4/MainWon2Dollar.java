package com.lgy.spring_ex3_4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class MainWon2Dollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "classpath:won2DollarCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		MyWon2Dollar w2d = ctx.getBean("mywond2dollar",MyWon2Dollar.class);
		w2d.exch();
		
		
	}

}
