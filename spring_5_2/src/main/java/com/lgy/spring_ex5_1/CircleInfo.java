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
		System.out.println("������ : "+circle.getRadius());
		System.out.println("���� ���� : "+circle.process());
	}
}
