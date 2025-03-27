package com.lgy.spring_3_2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		/*
		 * MyCalculator myCalculator = new MyCalculator();
		 * myCalculator.setCalculator(new Calculator());
		 * 
		 * myCalculator.setFirstNum(10); myCalculator.setSecondNum(2);
		 */
		
		// classpath�� xml ��ü ������ �о� confligLoc ������ ����
		String configLoc = "classpath:applicationCTX.xml";
		// GenericXmlApplicationContext Ŭ������ ��ü���� �Ľ�(�ؼ�)
		// ��ĳ�������� ctx ���������� ����
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		// getBean �޼ҵ�� ��ü������ ������
		MyCalculator myCalculator = ctx.getBean("mycalc",MyCalculator.class);
		
		myCalculator.add();
		myCalculator.sub();
		myCalculator.mul();
		myCalculator.div();
	}
}
