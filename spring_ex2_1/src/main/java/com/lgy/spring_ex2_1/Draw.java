package com.lgy.spring_ex2_1;

public class Draw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
		Rectangle rect = new Rectangle();
		
		circle.setRadius(10);
		rect.setWidth(20);
		rect.setHeight(30);
		
		System.out.println("원의 면적: "+circle.getArea());
		System.out.println("사각형의 면적: "+rect.getArea());
	}

}
