package com.lgy.spring_ex9_1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

// ������ Ŭ���� (Aspect)
public class LogAop {
	// �������� ����� ����
	@Pointcut("within(com.lgy.spring_ex9_1.*")
	private void pointCutMethod() {
		
	}
	// �޼ҵ� ���� ��/��, ����ó�� �����ؼ� ������ ����
	@Around("pointCutMethod()")//����Ǵ� �޼ҵ��
	public Object loggerAop(ProceedingJoinPoint joinPoint) {
		// getSignature().toShortString() : Ŭ������ �޼ҵ� ������ ������ ��
		String signatureStr = joinPoint.getSignature().toShortString();
		// �ٽɱ���� start �Ǿ���.(������ ����(advice))
		System.out.println("@@@### start===>"+signatureStr);
		
		Object obj = null;
		
		try {
			// �ٽɱ�� ����
			// ����ó���� �ʿ���  try ����
			joinPoint.proceed();	
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
		finally {
			long et = System.currentTimeMillis();
			System.out.println("@@@### end ===>"+signatureStr);
			
		}
		// �ٽɱ�� ��ȯ
		return obj;
	}
}