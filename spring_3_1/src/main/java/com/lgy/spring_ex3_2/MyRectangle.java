package com.lgy.spring_ex3_2;

public class MyRectangle {
	private Rectangle rect;
	private int width,height;
	public Rectangle getRect() {
		return rect;
	}
	public void setRect(Rectangle rect) {
		this.rect = rect;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void ar() {
		System.out.println("�簢���� ������ "+rect.area(width, height));
	}
}
