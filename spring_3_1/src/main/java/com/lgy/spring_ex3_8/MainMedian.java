package com.lgy.spring_ex3_8;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.lgy.spring_ex3_8.MyMedian;

public class MainMedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configLoc = "classpath:medianCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		MyMedian mymedian = ctx.getBean("mymedian",MyMedian.class);
		
		mymedian.pc();
	}

}
