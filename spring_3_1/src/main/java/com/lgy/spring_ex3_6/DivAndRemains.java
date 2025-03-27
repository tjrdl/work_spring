package com.lgy.spring_ex3_6;

public class DivAndRemains {
	public void process(int number) {
		int num = number % 10;
		int num2 = number / 10;
		if(num == num2) {
			System.out.println(number+"은(는) 10의 자리와 1의 자리가 같습니다.");
		}
		else
		{
			System.out.println(number+"은(는) 10의 자리와 1의 자리가 다릅니다.");

		}
	}
}
