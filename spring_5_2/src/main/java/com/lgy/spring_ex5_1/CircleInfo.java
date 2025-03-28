package com.lgy.spring_ex5_1;

public class CircleInfo {
	private Circle circle;

	public CircleInfo(Circle circle) {
		this.circle = circle;
	}
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public void getCircleInfo() {
		System.out.println("반지름 : "+circle.getRadius());
		System.out.println("원의 면적 : "+circle.process());
	}
}
