package com.mimaraslan07_this_anahtar_sozcugu;

public class Hesap {    
	public static void main(String[] args) {

		Oda kutuNesnesi = new Oda();
		Oda kutuNesnesi2 = new Oda(10, 7, 1);
		double hacim;
			

		hacim = kutuNesnesi.hacimHesapla(6, 3, 2);
		System.out.println("Parametreli1 : " + hacim);	
		
		System.out.println("Parametreli2 : " + kutuNesnesi2.hacimHesapla(14, 5, 3));		
	
	}

}
