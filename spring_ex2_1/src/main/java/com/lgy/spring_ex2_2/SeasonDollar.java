package com.lgy.spring_ex2_2;

public class SeasonDollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Season season = new Season();
		Won2dollar w2d = new Won2dollar();
		
		season.setMonth(9);
		w2d.setWon(3300);
		
		System.out.println(season.s_season());
		System.out.println("$"+w2d.currency_exchange());
	}

}
