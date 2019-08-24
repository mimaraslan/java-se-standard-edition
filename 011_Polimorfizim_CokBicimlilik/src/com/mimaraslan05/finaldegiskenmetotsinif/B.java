package com.mimaraslan05.finaldegiskenmetotsinif;

public class B extends A {

	@Override
	protected double hesapla1(int p1, double p2) {
		return p1*p2*p2*p2*p2*p2;
	}
	
	
	@Override
	protected double hesapla2(int p1, double p2) {
		return p1+p2;
	}

	/*
	@Override
	protected final double hesapla3(int p1, double p2) {
		return p1*p2*1000;
	}
	*/
	
	
}
