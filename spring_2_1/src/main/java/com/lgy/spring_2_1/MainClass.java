package com.lgy.spring_2_1;

public class MainClass {

	public static void main(String[] args) {
		// MainClass Ŭ������ Calculation Ŭ������ ����
		Calculation calculation = new Calculation();
		
		//Calculation Ŭ������ ��ü �����ؼ� ���� ����
		//����+����(Dependency Injection): DI
		calculation.setFirstNum(10);
		calculation.setSecondNum(2);
		
		calculation.add();
		calculation.sub();
		calculation.mul();
		calculation.div();
	}

}
