package com.lgy.spring_ex3_1;



public class MyCircle {
	private Circle circle;
	private int radius;
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public Circle getCircle() {
		return circle;
	}
	public void ar() {
		double dob = circle.getArea(radius);
		System.out.println("원의 면적은: "+dob);
	}
}
