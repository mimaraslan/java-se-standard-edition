package com.mimaraslan5_iki_sinif_iki_nesne_ve_birbirine_atanmalari;

public class Hesap {

	public static void main(String[] args) {

		Ev evNesnesi = new Ev();
		Ev evNesnesi2 = evNesnesi;
		
		System.out.println("evNesnesi ve de€erleri");
		evNesnesi.en = 1453;
		evNesnesi.boy = 1299;
		evNesnesi.yukseklik = 1517;

		System.out.println("EN        : " + evNesnesi.en);
		System.out.println("BOY       : " + evNesnesi.boy);
		System.out.println("YÜKSEKL‹K : " + evNesnesi.yukseklik);

		double hacim = evNesnesi.en * evNesnesi.boy * evNesnesi.yukseklik;
		System.out.println("EV‹N HAC‹M‹ : " + hacim);
		
		
		
		System.out.println("-------------");
		System.out.println("evNesnesi2 ve de€erleri");
		
		System.out.println("EN2        : " + evNesnesi2.en);
		System.out.println("BOY2       : " + evNesnesi2.boy);
		System.out.println("YÜKSEKL‹K2 : " + evNesnesi2.yukseklik);

		hacim = evNesnesi2.en * evNesnesi2.boy * evNesnesi2.yukseklik;
		System.out.println("EV‹N HAC‹M‹2 : " + hacim);

		

		System.out.println("-------------");
		System.out.println("evNesnesi2'sinin yeni de€erleri");
		
		evNesnesi2.en = 5;
		evNesnesi2.boy = 7;
		evNesnesi2.yukseklik = 1;

		System.out.println("EN2        : " + evNesnesi2.en);
		System.out.println("BOY2       : " + evNesnesi2.boy);
		System.out.println("YÜKSEKL‹K2 : " + evNesnesi2.yukseklik);

	    hacim = evNesnesi2.en * evNesnesi2.boy * evNesnesi2.yukseklik;
		System.out.println("EV‹N HAC‹M‹2 : " + hacim);
		
		
		
		System.out.println("-------------");
		System.out.println("evNesnesi'sinin de€erleri");
		
		System.out.println("EN        : " + evNesnesi.en);
		System.out.println("BOY       : " + evNesnesi.boy);
		System.out.println("YÜKSEKL‹K : " + evNesnesi.yukseklik);

	    hacim = evNesnesi.en * evNesnesi.boy * evNesnesi.yukseklik;
		System.out.println("EV‹N HAC‹M‹ : " + hacim);
		
		
	}

}
