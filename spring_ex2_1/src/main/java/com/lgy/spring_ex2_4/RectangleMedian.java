package com.lgy.spring_ex2_4;

public class RectangleMedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Median med = new Median();
		Rectangle rect = new Rectangle();
		
		med.setXYZ(20, 100, 33);
		rect.setXY(150, 150);
		
		rect.process();
		med.process();
	}

}
