package com.lgy.spring_ex2_3;

public class ThreeDivAndRemains {
	public static void main(String[] args) {
		Three thr = new Three();
		DivAndRemains dar = new DivAndRemains();
		
		thr.setNumber(129);
		dar.setNumber(77);
		
		thr.process();
		dar.process();
	} 
}
