package com.lgy.spring_14_1;

//import org.springframework.web.util.Log4jConfigListener;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

//@Log4j // 로그처리 (보안이슈)
@Slf4j // 로그처리
public class Test {
	public static void main(String[] args) {
		System.out.println("dd");
		log.debug("dd02");
		log.info("dd03");
	}
}
