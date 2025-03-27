package com.lgy.spring_ex3_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.lgy.spring_ex3_1.MyCircle;

public class MainCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// classpath�� xml ��ü ������ �о� confligLoc ������ ����
				String configLoc = "classpath:circleCTX.xml";
				// GenericXmlApplicationContext Ŭ������ ��ü���� �Ľ�(�ؼ�)
				// ��ĳ�������� ctx ���������� ����
				AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
				// getBean �޼ҵ�� ��ü������ ������
				MyCircle myCicle = ctx.getBean("mycircle",MyCircle.class);
				
				myCicle.ar();
	}

}
