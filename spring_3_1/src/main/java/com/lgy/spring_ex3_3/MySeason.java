package com.lgy.spring_ex3_3;

public class MySeason {
	public Season season;
	public int month;
	public Season getSeason() {
		return season;
	}
	public void setSeason(Season season) {
		this.season = season;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void result() {
		System.out.println("입력된 정수"+month+"은(는)"+season.resltSeason(month));
		
	}
	
}
