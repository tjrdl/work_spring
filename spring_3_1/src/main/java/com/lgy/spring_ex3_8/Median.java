package com.lgy.spring_ex3_8;

public class Median {
	public void process(int x, int y, int z) {
		int temp = 0;
		if(x>y) {
			if(y>z) {
				temp = y;
			}
			else {
				temp = z;
			} 
		}
		else {
			if(x>z) {
				temp = x;
			}
			else {
				temp = z;
			}
		}
		System.out.println("입력된 정수"+x+","+y+","+z+"의 중간값은 "+temp);
	}
}
