package com.lgy.spring_9_1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

// 공통기능 클래스 (Aspect)
public class LogAop {
	// 공통기능이 적용된 범위
	@Pointcut("within(com.lgy.spring_9_1.*")
	private void pointCutMethodd() {
		
	}
	// 메소드 실행 전/후, 예외처리 포함해서 공통기능 실행
	@Around("pointCutMethod()")//적용되는 메소드명
	public Object loggerAop(ProceedingJoinPoint joinPoint) {
		// getSignature().toShortString() : 클래스의 메소드 정보를 가지고 옴
		String signatureStr = joinPoint.getSignature().toShortString();
		// 핵심기능이 start 되었다.(공통기능 실행(advice))
		System.out.println(signatureStr+"ist start.");
		long st = System.currentTimeMillis();
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
			long et = System.currentTimeMillis();
			System.out.println(signatureStr+"is finished.");
			System.out.println(signatureStr+"의 경과시간 : "+(et-st));
		}
		// 핵심기능 반환
		return obj;
	}
}