package com.lgy.spring_ex3_10;

public class MyCapital {
	private Capital cap;
	private char c;
	public Capital getCap() {
		return cap;
	}
	public void setCap(Capital cap) {
		this.cap = cap;
	}
	public char getC() {
		return c;
	}
	public void setC(char c) {
		this.c = c;
	}
	public void pc() {
		cap.alphabet(c);
	}
}
