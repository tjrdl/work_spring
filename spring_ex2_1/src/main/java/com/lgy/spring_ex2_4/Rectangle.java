package com.lgy.spring_ex2_4;

public class Rectangle {
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void process() {
		if((x >=100 && x <=200) && (y>=100 && y<=200)) {
			System.out.println("�� ("+x+","+y+")�� �簢�� �ȿ� �ֽ��ϴ�.");
		}
		else
		{
			System.out.println("�� ("+x+","+y+")�� �簢�� �ȿ� �����ϴ�.");
		}
	}
}
