package com.mimaraslan07_this_anahtar_sozcugu;

public class Oda {

	double en;
	double boy;
	double yukseklik;

	public Oda() {
	}

	public Oda(double en, double boy, double yukseklik) {
		this.en = en;
		this.boy = boy;
		this.yukseklik = yukseklik;
	}

	double hacimHesapla(double en, double boy, double yukseklik) {
		return en * boy * yukseklik;
	}

}