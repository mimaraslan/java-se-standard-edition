package com.mimaraslan05_parametresiz_ve_parametreli_metodlar_iki_sinif_iki_nesneli;

public class Hesap {    
	public static void main(String[] args) {
		
		double hacim;
		Kutu kutuNesnesi = new Kutu();
		Kutu kutuNesnesi2 = new Kutu();
		
		
		System.out.println("kutuNesnesi ve değerleri");
		kutuNesnesi.en = 6;
		kutuNesnesi.boy = 3;
		kutuNesnesi.yukseklik = 2;

		System.out.println("EN        : " + kutuNesnesi.en);
		System.out.println("BOY       : " + kutuNesnesi.boy);
		System.out.println("YÜKSEKLİK : " + kutuNesnesi.yukseklik);

	    hacim = kutuNesnesi.en * kutuNesnesi.boy * kutuNesnesi.yukseklik;
		System.out.println("KUTUNUN HACMİ : " + hacim);
			
		
		kutuNesnesi.hacimHesaplaParametresiz1();
		
		hacim = kutuNesnesi.hacimHesaplaParametresiz2();
		System.out.println("Parametresiz  : " + hacim);
		
		hacim = kutuNesnesi.hacimHesaplaParametreli(10.71, 12.99, 145.3);
		System.out.println("Parametreli : " + hacim);
		
		System.out.println("Parametreli : " + kutuNesnesi.hacimHesaplaParametreli(10.71, 12.99, 145.3));
		
		
		System.out.println("-------------");
		System.out.println("kutuNesnesi2 ve değerleri");
		
		kutuNesnesi2.en = 5;
		kutuNesnesi2.boy = 7;
		kutuNesnesi2.yukseklik = 1;
		
		System.out.println("EN2        : " + kutuNesnesi2.en);
		System.out.println("BOY2       : " + kutuNesnesi2.boy);
		System.out.println("YÜKSEKLİK2 : " + kutuNesnesi2.yukseklik);

		hacim = kutuNesnesi2.en * kutuNesnesi2.boy * kutuNesnesi2.yukseklik;
		System.out.println("KUTUNUN HACMİ2 : " + hacim);
		
		kutuNesnesi2.hacimHesaplaParametresiz1();
		
		hacim = kutuNesnesi2.hacimHesaplaParametresiz2();
		System.out.println("Parametresiz2  : " + hacim);
		
		hacim = kutuNesnesi2.hacimHesaplaParametreli(5.71, 6.32, 1);
		System.out.println("Parametreli2 : " + hacim);
		
		System.out.println("Parametreli2 : " + kutuNesnesi2.hacimHesaplaParametreli(5.71, 6.32, 1));

	}

}
