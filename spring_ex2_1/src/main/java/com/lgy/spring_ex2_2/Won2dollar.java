package com.lgy.spring_ex2_2;

public class Won2dollar {
	private double won;
	public double getWon() {
		return won;
	}
	public void setWon(double won) {
		this.won = won;
	}
	public double currency_exchange() {
		return won / 1200;
	}
}
