package com.lgy.spring_ex3_6;

public class MyDivAndRemains {
	private DivAndRemains dar;
	private int number;
	public DivAndRemains getDar() {
		return dar;
	}
	public void setDar(DivAndRemains dar) {
		this.dar = dar;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void pc() {
		dar.process(number);
	}
}
