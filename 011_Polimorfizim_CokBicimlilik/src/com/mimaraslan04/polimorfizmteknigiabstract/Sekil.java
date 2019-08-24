package com.mimaraslan04.polimorfizmteknigiabstract;

public abstract class Sekil {
	float kenar1, kenar2;

	public Sekil() {
		super();
	}
	
	
	
	public Sekil(float kenar1, float kenar2) {
		this.kenar1 = kenar1;
		this.kenar2 = kenar2;
	}

	protected abstract float alaniHesapla();
	
	protected abstract float cevreHesapla();
	
	protected void yaz1() {
		System.out.println("SEKIL SINIFI");	
	}
	
	
	protected String yaz2() {
		return "SEKIL SINIFI";	
	}

}
