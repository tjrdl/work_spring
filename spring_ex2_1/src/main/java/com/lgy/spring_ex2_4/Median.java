package com.lgy.spring_ex2_4;

public class Median {
	private int x, y, z;

	public void setXYZ(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getZ() {
		return z;
	}
	
	public void process() {
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
