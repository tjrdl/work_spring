package com.lgy.sprint_ex2_5;

public class Triangle {
	private int x,y,z;
	
	public void setXYZ(int x,int y, int z) {
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
		if(x+y > z || y+z > x || x+z >y)
			System.out.println("�ﰢ���� �˴ϴ�");
		else
			System.out.println("�ȵ˴ϴ�.");
	}
}
