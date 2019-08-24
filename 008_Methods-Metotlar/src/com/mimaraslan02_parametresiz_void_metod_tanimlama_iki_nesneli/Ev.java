package com.mimaraslan02_parametresiz_void_metod_tanimlama_iki_nesneli;

public class Ev {

	  double en;
	  double boy;
	  double yukseklik; 

	   
	    void hacimHesapla() {
	        System.out.print("Metodun içinden yap›lan hacim hesab› : ");
	        System.out.println(en * boy * yukseklik);
	      }    
	    
	public static void main(String[] args) {
		
		Ev evNesnesi = new Ev();

		System.out.println("evNesnesi ve de€erleri");
		evNesnesi.en = 6;
		evNesnesi.boy = 3;
		evNesnesi.yukseklik = 2;

		System.out.println("EN        : " + evNesnesi.en);
		System.out.println("BOY       : " + evNesnesi.boy);
		System.out.println("YÜKSEKL‹K : " + evNesnesi.yukseklik);

		double hacim = evNesnesi.en * evNesnesi.boy * evNesnesi.yukseklik;
		System.out.println("EV‹N HAC‹M‹ : " + hacim);
		
		evNesnesi.hacimHesapla();
		
		
		
		System.out.println("-------------");
		System.out.println("evNesnesi2 ve de€erleri");
		
		Ev evNesnesi2 = new Ev();
		
		evNesnesi2.en = 5;
		evNesnesi2.boy = 7;
		evNesnesi2.yukseklik = 1;
		
		System.out.println("EN2        : " + evNesnesi2.en);
		System.out.println("BOY2       : " + evNesnesi2.boy);
		System.out.println("YÜKSEKL‹K2 : " + evNesnesi2.yukseklik);

		hacim = evNesnesi2.en * evNesnesi2.boy * evNesnesi2.yukseklik;
		System.out.println("EV‹N HAC‹M‹2 : " + hacim);
		
		evNesnesi2.hacimHesapla();

	}

}
