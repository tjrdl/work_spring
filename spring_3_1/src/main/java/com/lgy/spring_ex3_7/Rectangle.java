package com.lgy.spring_ex3_7;

public class Rectangle {
	public void process(int x, int y) {
		if((x >=100 && x <=200) && (y>=100 && y<=200)) {
			System.out.println("�� ("+x+","+y+")�� �簢�� �ȿ� �ֽ��ϴ�.");
		}
		else
		{
			System.out.println("�� ("+x+","+y+")�� �簢�� �ȿ� �����ϴ�.");
		}
	}
}
