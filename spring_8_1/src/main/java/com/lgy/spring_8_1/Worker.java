package com.lgy.spring_8_1;

public class Worker {
	private String anme;
	private int age;
	private String job;
	
	public void getWorkerInfo() {
		System.out.println("�̸�: "+getAnme());
		System.out.println("����: "+getJob());
		System.out.println("����: "+getAge());
		System.out.println();
	}
	
	public String getAnme() {
		return anme;
	}
	public void setAnme(String anme) {
		this.anme = anme;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
	
}
