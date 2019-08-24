package com.mimaraslan02.polimorfizmteknigi;

public class Sekil {
	float kenar1, kenar2;

	public Sekil() {
		super();
	}
	
	
	
	public Sekil(float kenar1, float kenar2) {
		this.kenar1 = kenar1;
		this.kenar2 = kenar2;
	}

	protected float alaniHesapla() {
		System.out.println("SEKIL SINIFI ALAN HESAPLAMA METODU");
		return (float) 0.0;
	}
	
	protected float cevreHesapla() {
		System.out.println("SEKIL SINIFI CEVRE HESAPLAMA METODU");
		return (float) 0.0;
	}
	

}
