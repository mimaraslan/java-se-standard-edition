package com.mimaraslan4_iki_sinif_iki_nesneli;

public class Hesap {

	public static void main(String[] args) {

		Ev anahtar1 = new Ev(); // Bellekten yer tahsisi var. Gerek nesne!

		anahtar1.en = 6;
		anahtar1.boy = 3;
		anahtar1.yukseklik = 2;

		System.out.println("EN        : " + anahtar1.en);
		System.out.println("BOY       : " + anahtar1.boy);
		System.out.println("Y†KSEKLÜK : " + anahtar1.yukseklik);

		double hacim = anahtar1.en * anahtar1.boy * anahtar1.yukseklik;
		System.out.println("EV HACÜMÜ : " + hacim);
		
		
		System.out.println("-------------");
		
		
		Ev anahtar2 ;// Üi boß referans henŸz yer tahsisi yok!
		anahtar2 = new Ev();// Bellekten yer tahsisi var. Gerek nesne!


		anahtar2.en = 5;
		anahtar2.boy = 7;
		anahtar2.yukseklik = 1;

		System.out.println("EN2        : " + anahtar2.en);
		System.out.println("BOY2       : " + anahtar2.boy);
		System.out.println("Y†KSEKLÜK2 : " + anahtar2.yukseklik);

		double hacim2 = anahtar2.en * anahtar2.boy * anahtar2.yukseklik;
		System.out.println("EV HACÜMÜ2 : " + hacim2);
		
		
	}

}
