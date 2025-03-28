package com.lgy.spring_6_5;

import java.util.ArrayList;

public class Nasddaq {
	private String invest;
	private int rank;
	private ArrayList<String> product;
	
	
	
	
	public Nasddaq(String invest) {
		this.invest = invest;
	}
	
	public String getInvest() {
		return invest;
	}
	public void setInvest(String invest) {
		this.invest = invest;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public ArrayList<String> getProduct() {
		return product;
	}
	public void setProduct(ArrayList<String> product) {
		this.product = product;
	}

	
	
}
