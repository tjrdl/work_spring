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
					System.out.println(num + "은 3,5,8 의 배수이다.");
				} else {
					System.out.println(num + "은 3,5 의 배수이다.");

				}
			} else if (num % 8 == 0) {
				System.out.println(num + "은 3,8 의 배수이다.");

			} else {
				System.out.println(num + "은 3 의 배수이다.");

			}
		}
		else if(num % 5 == 0) {
			if(num % 8 == 0) {
				System.out.println(num+"은 5,8 의 배수이다.");

			}
			else {
				System.out.println(num+"은 5 의 배수이다.");

			}
		}
		else if(num%8==0) {
			System.out.println(num+"은 8 의 배수이다.");

		}
		else {
			System.out.println(num+"은 3,5,8 의 배수가 아님.");

		}
	}
}
