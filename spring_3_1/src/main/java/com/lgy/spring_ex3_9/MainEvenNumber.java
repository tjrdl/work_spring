package com.lgy.spring_ex3_9;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.lgy.spring_ex3_8.MyMedian;

public class MainEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configLoc = "classpath:evenNumberCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		MyEvenNumber myen = ctx.getBean("myen",MyEvenNumber.class);
		
		myen.pc();
	}

}
