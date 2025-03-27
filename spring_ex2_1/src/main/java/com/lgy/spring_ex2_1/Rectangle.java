package com.lgy.spring_ex2_1;

public class Rectangle {
	private int width;
	private int height;
	
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public double getArea() {
		return width*height;
	}
}
