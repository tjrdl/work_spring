package com.lgy.spring_ex3_6;

public class DivAndRemains {
	public void process(int number) {
		int num = number % 10;
		int num2 = number / 10;
		if(num == num2) {
			System.out.println(number+"��(��) 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}
		else
		{
			System.out.println(number+"��(��) 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");

		}
	}
}
