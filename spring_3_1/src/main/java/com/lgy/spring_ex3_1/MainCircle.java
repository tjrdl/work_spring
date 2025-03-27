package com.lgy.spring_ex3_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.lgy.spring_ex3_1.MyCircle;

public class MainCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// classpath로 xml 객체 정보를 읽어 confligLoc 변수에 저장
				String configLoc = "classpath:circleCTX.xml";
				// GenericXmlApplicationContext 클래스로 객체정보 파싱(해석)
				// 업캐스팅으로 ctx 참조변수로 받음
				AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
				// getBean 메소드로 객체정보를 가져옴
				MyCircle myCicle = ctx.getBean("mycircle",MyCircle.class);
				
				myCicle.ar();
	}

}
