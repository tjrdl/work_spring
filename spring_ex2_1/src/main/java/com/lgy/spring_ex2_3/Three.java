package com.lgy.spring_ex2_3;

public class Three {
	private int number;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void process() {
		if(number %3 == 0) {
			System.out.println(number+"��(��) 3�� ���");
		}
		else {
			System.out.println(number+"��(��) 3�� ����� �ƴ�");
		}
	}
}
