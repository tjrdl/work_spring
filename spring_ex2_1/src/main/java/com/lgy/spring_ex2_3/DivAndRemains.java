package com.lgy.spring_ex2_3;

public class DivAndRemains {
	private int number;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void process() {
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
