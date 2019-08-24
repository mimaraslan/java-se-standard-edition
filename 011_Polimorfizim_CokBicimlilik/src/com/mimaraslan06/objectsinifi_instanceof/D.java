package com.mimaraslan06.objectsinifi_instanceof;

public class D extends C {


private	double sayi1, sayi2;
	
	public D() {
		super();
	}

	@Override
	protected String yaz() {
		String sonuc = "D sinifi";
		System.out.println(sonuc);
		return sonuc;
	}

	public double getSayi1() {
		return sayi1;
	}

	public void setSayi1(double sayi1) {
		this.sayi1 = sayi1;
	}

	public double getSayi2() {
		return sayi2;
	}

	public void setSayi2(double sayi2) {
		this.sayi2 = sayi2;
	}


}
