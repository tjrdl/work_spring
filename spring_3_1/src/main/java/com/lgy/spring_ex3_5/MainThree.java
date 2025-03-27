package com.lgy.spring_ex3_5;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.lgy.spring_ex3_4.MyWon2Dollar;

public class MainThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String path = "classpath:threeCTX.xml";
				AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
				MyThree thr = ctx.getBean("mythree",MyThree.class);
				thr.pc();
	}

}
