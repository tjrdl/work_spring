package com.lgy.spring_14_1.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor // �⺻ ������
@AllArgsConstructor // ��� ������Ƽ�� �Ķ���ͷ� ������ ������
@Data // �������� �޼ҵ� ����
public class SampleVO {
	private int mno;
	private String firstName;
	private String lastName;
	
//	public SampleVO(int mno, String firstName, String lastName) {
//		super();
//		this.mno = mno;
//		this.firstName = firstName;
//		this.lastName = lastName;
//	}
	
	/*
	 * public SampleVO() {
	 * 
	 * }
	 */
//	public int getMno() {
//		return mno;
//	}
//	public void setMno(int mno) {
//		this.mno = mno;
//	}
//	public String getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
	
}
