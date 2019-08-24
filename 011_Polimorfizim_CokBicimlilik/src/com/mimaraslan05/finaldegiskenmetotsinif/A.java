package com.mimaraslan05.finaldegiskenmetotsinif;

public abstract class A {
	final double PISAYISI = 3.14;
	
	protected double hesapla1(int p1, double p2) {
		return p1*p2;
	}
	
	
	protected abstract double hesapla2(int p1, double p2);
	
	
	protected final double hesapla3(int p1, double p2) {
		return p1*p2*1000;
	}
	
	
}
