package com.lgy.spring_ex3_5;

public class MyThree {
	private Three three;
	private int number;
	public Three getThree() {
		return three;
	}
	public void setThree(Three three) {
		this.three = three;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void pc() {
		System.out.println("입력된 수 :"+number+"은 ");
		three.process(number);
	}
}
