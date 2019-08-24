package com.mimaraslan04.polimorfizmteknigiabstract;

public class Ucgen extends Dortgen {

	float kenar3;

	public Ucgen(float kenar1, float kenar2, float kenar3) {
		super(kenar1, kenar2);
		this.kenar3 = kenar3;
	}

	@Override
	protected float alaniHesapla() {
		System.out.println("UCGEN SINIFI ALAN HESAPLAMA METODU");
		return (this.kenar1 * this.kenar2)/2;
	}


	@Override
	protected float cevreHesapla() {
		System.out.println("UCGEN SINIFI CEVRE HESAPLAMA METODU");
		return this.kenar1 + this.kenar2 + kenar3;
	}
	
}
