package com.lgy.spring_4_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String path = "classpath:myinfoCTX.xml";
				AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
				Myinfo myinfo = ctx.getBean("myinfo",Myinfo.class);
				myinfo.getInfo();
				ctx.close();
	}

}
