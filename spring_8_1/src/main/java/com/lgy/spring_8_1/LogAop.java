package com.lgy.spring_8_1;

import org.aspectj.lang.ProceedingJoinPoint;

// ������ Ŭ���� (Aspect)
public class LogAop {
	// loggerAop: advice(������ ��ü-�޼ҵ�)
	// joinPoint: �ٽɱ��(�������� ����Ǵ� ���-�޼ҵ�)
	public Object loggerAop(ProceedingJoinPoint joinPoint) {
		// getSignature().toShortString() : Ŭ������ �޼ҵ� ������ ������ ��
		String signatureStr = joinPoint.getSignature().toShortString();
		// �ٽɱ���� start �Ǿ���.(������ ����(advice))
		System.out.println(signatureStr+"ist start.");
		long st = System.currentTimeMillis();
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
			System.out.println(signatureStr+"is finished.");
			System.out.println(signatureStr+"�� ����ð� : "+(et-st));
		}
		// �ٽɱ�� ��ȯ
		return obj;
	}
}