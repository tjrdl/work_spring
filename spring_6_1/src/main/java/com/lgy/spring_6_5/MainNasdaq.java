package com.lgy.spring_6_5;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.lgy.spring_6_1.Family;
import com.lgy.spring_6_1.Student;
import com.lgy.spring_6_1.StudentInfo;

public class MainNasdaq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configLoc1 = "classpath:nasdaqCTX.xml";
		String configLoc2 = "classpath:nasdaqCTX2.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc1, configLoc2);

		Nasddaq nasdaq1 = ctx.getBean("nasdaq1", Nasddaq.class);

		System.out.println(nasdaq1.getInvest());
		System.out.println(nasdaq1.getRank());
		System.out.println(nasdaq1.getProduct());
		
		System.out.println("=================================");
		NasdaqInfo nasdaqinfo = ctx.getBean("nasdaqInfo1",NasdaqInfo.class);
		
		Nasddaq nasdaq2 = nasdaqinfo.getNasdaq();

		System.out.println(nasdaq2.getInvest());
		System.out.println(nasdaq2.getRank());
		System.out.println(nasdaq2.getProduct());

		System.out.println("=================================");
		
		Nasddaq nasdaq3 = ctx.getBean("nasdaq3", Nasddaq.class);
		System.out.println(nasdaq3.getInvest());
		System.out.println(nasdaq3.getRank());
		System.out.println(nasdaq3.getProduct());

		

		

		
		
		ctx.close();
	
	}

}
