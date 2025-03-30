package com.lgy.spring_8_2;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	// loggerAop: advice(공통기능 자체-메소드)
		// joinPoint: 핵심기능(공통기능이 적용되는 대상-메소드)
		public Object loggerAop(ProceedingJoinPoint joinPoint) {
			// getSignature().toShortString() : 클래스의 메소드 정보를 가지고 옴
			String signatureStr = joinPoint.getSignature().toShortString();
			// 핵심기능이 start 되었다.(공통기능 실행(advice))
			System.out.println("@@@### start===>"+joinPoint.getSignature().toShortString());
			Object obj = null;
			
			try {
				// 핵심기능 실행
				// 예외처리가 필요해  try 선언
				joinPoint.proceed();	
			}
			catch(Throwable e) {
				e.printStackTrace();
			}
			finally {
				System.out.println("@@@### end===>"+joinPoint.getSignature().toShortString());

			}
			// 핵심기능 반환
			return obj;
		}
}
