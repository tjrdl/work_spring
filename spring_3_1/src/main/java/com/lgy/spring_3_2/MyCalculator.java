package com.lgy.spring_3_2;

public class MyCalculator {
	private Calculator calculator;
	private int firstNum;
	private int secondNum;
	
	public void add() {
		calculator.addition(firstNum, secondNum);
	}
	public void sub() {
		calculator.subtraction(firstNum, secondNum);
	}
	public void mul() {
		calculator.multiplication(firstNum, secondNum);
	}
	public void div() {
		calculator.division(firstNum, secondNum);
	}
	
	public Calculator getCalculator() {
		return calculator;
	}
	public int getFirstNum() {
		return firstNum;
	}
	public int getSecondNum() {
		return secondNum;
	}
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
}
