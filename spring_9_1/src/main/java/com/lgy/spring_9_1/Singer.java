package com.lgy.spring_9_1;

public class Singer {
	private String name, song;
	private int member;
	
	public void getSingerInfo( ) {
		System.out.println("�̸�: "+getName());
		System.out.println("���: "+getMember());
		System.out.println("�뷡: "+getSong());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
	}
	public int getMember() {
		return member;
	}
	public void setMember(int member) {
		this.member = member;
	}
	
	
}
