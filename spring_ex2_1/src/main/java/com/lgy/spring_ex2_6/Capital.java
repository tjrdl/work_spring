package com.lgy.spring_ex2_6;

public class Capital {
	private char str;
	public void setStr(char str) {
		this.str = str;
	}
	public char getStr() {
		return str;
	}
	
	public void print() {
		for(char i = 'A'; i<=str; i++) {
			for(char j = i; j<=str; j++) {
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}
}
