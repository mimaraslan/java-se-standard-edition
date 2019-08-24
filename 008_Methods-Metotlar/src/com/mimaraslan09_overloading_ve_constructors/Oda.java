package com.mimaraslan09_overloading_ve_constructors;

public class Oda {

	double en;
	double boy;
	double yukseklik;

	public Oda() {
		this.en = 1;
		this.boy = 1;
		this.yukseklik = 1;
	}

	public Oda(double en) {
		this.en = this.boy = this.yukseklik = en;
	}

	public Oda(double en, double boy) {
		this.en = en;
		this.boy = boy;
	}
	
	public Oda(double en, double boy, double yukseklik) {
		this.en = en;
		this.boy = boy;
		this.yukseklik = yukseklik;
	}

	double hacimHesapla() {
		return this.en * this.boy * this.yukseklik;
	}
	
	double hacimHesapla(double en, double boy, double yukseklik) {
		return en * boy * yukseklik;
	}

}