package com.mimaraslan06_hazirlayici_metodlar_iki_sinif_iki_nesneli;

public class Hesap {    
	public static void main(String[] args) {

		Kutu kutuNesnesi = new Kutu();
		Kutu kutuNesnesi2 = new Kutu(5.71   ,   6.3  ,    2);
		double hacim;
		
		        kutuNesnesi.hacimHesaplaParametresiz1();
	
		hacim = kutuNesnesi.hacimHesaplaParametresiz2();
		System.out.println("Parametresiz  : " + hacim);
		
		hacim = kutuNesnesi.hacimHesaplaParametreli(10.71    ,   12.99   ,    145.3);
		System.out.println("Parametreli : " + hacim);
		
		
		
		System.out.println("-------------");
		        kutuNesnesi2.hacimHesaplaParametresiz1();
	
		hacim = kutuNesnesi2.hacimHesaplaParametresiz2();
		System.out.println("Parametresiz2  : " + hacim);
		
		hacim = kutuNesnesi2.hacimHesaplaParametreli(1.4   ,   5  ,   3);
		System.out.println("Parametreli2 : " + hacim);		
	
		
		
		System.out.println("-------------");
		Kutu kutuNesnesi3 = new Kutu(6, 3, 2);
		
		kutuNesnesi3.hacimHesaplaParametresiz1();
	
		hacim = kutuNesnesi3.hacimHesaplaParametresiz2();
		System.out.println("Parametresiz3  : " + hacim);
		
		hacim = kutuNesnesi3.hacimHesaplaParametreli(57, 1, 63.2);
		System.out.println("Parametreli3 : " + hacim);	
		
	}

}
