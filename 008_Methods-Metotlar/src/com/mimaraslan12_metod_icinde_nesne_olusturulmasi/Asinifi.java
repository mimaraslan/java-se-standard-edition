package com.mimaraslan12_metod_icinde_nesne_olusturulmasi;

public class Asinifi {

	int sayi;

	public Asinifi() {
	}

	Asinifi(int sayi) {
		this.sayi = sayi;
	}

	Asinifi metodIcindeNesneOlustur() {
		Asinifi aSinifiNesnesi = new Asinifi(this.sayi + 10);
		return aSinifiNesnesi;
	}

}