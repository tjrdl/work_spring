package com.lgy.spring_ex2_6;

public class Asterisk {
	private int num;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public void print() {
		for(int i = num; i>=0; i--) {
			for(int j = i; j>=0; j--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
