package com.mimaraslan06_hazirlayici_metodlar_iki_sinif_iki_nesneli;

public class Kutu {

	double en;
	double boy;
	double yukseklik;


	public Kutu() {
	}

	public Kutu(double en, double boy, double yukseklik) {
		this.en = en;
		this.boy = boy;
		this.yukseklik = yukseklik;
	}


	void hacimHesaplaParametresiz1() {
		System.out.println(this.en * this.boy * this.yukseklik);
	}

	double hacimHesaplaParametresiz2() {
		return en * boy * yukseklik;
	}

	double hacimHesaplaParametreli(double e, double b, double y) {
		return e * b * y;
	}

}