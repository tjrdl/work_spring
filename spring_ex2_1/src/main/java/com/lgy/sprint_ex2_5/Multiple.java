package com.lgy.sprint_ex2_5;

public class Multiple {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void process() {
		if (num % 3 == 0) {
			if (num % 5 == 0) {
				if (num % 8 == 0) {
					System.out.println(num + "�� 3,5,8 �� ����̴�.");
				} else {
					System.out.println(num + "�� 3,5 �� ����̴�.");

				}
			} else if (num % 8 == 0) {
				System.out.println(num + "�� 3,8 �� ����̴�.");

			} else {
				System.out.println(num + "�� 3 �� ����̴�.");

			}
		}
		else if(num % 5 == 0) {
			if(num % 8 == 0) {
				System.out.println(num+"�� 5,8 �� ����̴�.");

			}
			else {
				System.out.println(num+"�� 5 �� ����̴�.");

			}
		}
		else if(num%8==0) {
			System.out.println(num+"�� 8 �� ����̴�.");

		}
		else {
			System.out.println(num+"�� 3,5,8 �� ����� �ƴ�.");

		}
	}
}
