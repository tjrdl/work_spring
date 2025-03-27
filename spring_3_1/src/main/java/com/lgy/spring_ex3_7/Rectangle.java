package com.lgy.spring_ex3_7;

public class Rectangle {
	public void process(int x, int y) {
		if((x >=100 && x <=200) && (y>=100 && y<=200)) {
			System.out.println("점 ("+x+","+y+")가 사각형 안에 있습니다.");
		}
		else
		{
			System.out.println("점 ("+x+","+y+")가 사각형 안에 없습니다.");
		}
	}
}
