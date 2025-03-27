package com.lgy.spring_ex3_3;

public class Season {
	public String resltSeason(int month) {
		if(month == 3 || month == 4 || month == 5)
		{
			return "봄";
		}
		else if(month >= 6 && month <=8) {
			return "여름";
		}
		else if(month >=9 && month <= 11) {
			return "가을";
		}
		else {
			return "겨울";
		}
	}
	
}
