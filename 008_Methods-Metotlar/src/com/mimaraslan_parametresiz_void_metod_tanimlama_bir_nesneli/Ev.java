package com.mimaraslan_parametresiz_void_metod_tanimlama_bir_nesneli;


/*

type name(parameter-list) { 
	// body of method
}

*/

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
	
	}

}
