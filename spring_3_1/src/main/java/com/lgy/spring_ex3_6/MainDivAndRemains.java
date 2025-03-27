package com.lgy.spring_ex3_6;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.lgy.spring_ex3_4.MyWon2Dollar;

public class MainDivAndRemains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String path = "classpath:divAndRemainsCTX.xml";
				AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
				MyDivAndRemains mydar = ctx.getBean("mydar",MyDivAndRemains.class);
				mydar.pc();
	}

}
