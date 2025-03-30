package com.lgy.spring_8_2;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	// loggerAop: advice(������ ��ü-�޼ҵ�)
		// joinPoint: �ٽɱ��(�������� ����Ǵ� ���-�޼ҵ�)
		public Object loggerAop(ProceedingJoinPoint joinPoint) {
			// getSignature().toShortString() : Ŭ������ �޼ҵ� ������ ������ ��
			String signatureStr = joinPoint.getSignature().toShortString();
			// �ٽɱ���� start �Ǿ���.(������ ����(advice))
			System.out.println("@@@### start===>"+joinPoint.getSignature().toShortString());
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
				System.out.println("@@@### end===>"+joinPoint.getSignature().toShortString());

			}
			// �ٽɱ�� ��ȯ
			return obj;
		}
}
