package com.lgy.spring_ex2_2;

public class Season {
	private int month;
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public String s_season() {
		if(month == 3 || month == 4 || month == 5)
		{
			return "��";
		}
		else if(month >= 6 && month <=8) {
			return "����";
		}
		else if(month >=9 && month <= 11) {
			return "����";
		}
		else {
			return "�ܿ�";
		}
	}
}
