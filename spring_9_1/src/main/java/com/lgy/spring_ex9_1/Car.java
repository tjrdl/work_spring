package com.lgy.spring_ex9_1;

public class Car {
	private String company, product;
	private int capRank;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getCapRank() {
		return capRank;
	}
	public void setCapRank(int capRank) {
		this.capRank = capRank;
	}
	
	public void getCarInfo() {
		System.out.println("ȸ��:"+getCompany());
		System.out.println("����"+getCapRank());
		System.out.println("��ǰ"+getProduct());
		
	}
	
	
}
