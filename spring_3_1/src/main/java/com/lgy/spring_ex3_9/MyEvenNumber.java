package com.lgy.spring_ex3_9;

public class MyEvenNumber {
	private EvenNumber en;
	private int number;
	public EvenNumber getEn() {
		return en;
	}
	public void setEn(EvenNumber en) {
		this.en = en;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void pc() {
		en.process(number);
	}
}	
