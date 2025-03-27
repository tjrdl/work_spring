package com.lgy.spring_ex3_7;

public class MyRectangle {
	private Rectangle rect;
	private int x, y;
	public Rectangle getRect() {
		return rect;
	}
	public void setRect(Rectangle rect) {
		this.rect = rect;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void pc() {
		rect.process(x, y);
	}
}
