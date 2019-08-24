package com.mimaraslan04.polimorfizmteknigiabstract;

public class Dortgen extends Sekil {

	public Dortgen() {
		super();
	}

	public Dortgen(float kenar1, float kenar2) {
		super(kenar1, kenar2);
	}

	@Override
	protected float alaniHesapla() {
		System.out.println("DORTGEN SINIFI ALAN HESAPLAMA METODU");
		return this.kenar1 * this.kenar2;
	}

	@Override
	protected float cevreHesapla() {
		System.out.println("DORTGEN SINIFI CEVRE HESAPLAMA METODU");
		return 2*(this.kenar1 + this.kenar2);
	}
	
}
