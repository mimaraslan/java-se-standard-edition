package com.mimaraslan09_overloading_ve_constructors;
 
public class Hesap {    
	public static void main(String[] args) {

		Oda odaNesnesi1 = new Oda();
		Oda odaNesnesi2 = new Oda(6);
		Oda odaNesnesi3 = new Oda(3, 2);
		Oda odaNesnesi4 = new Oda(5, 7, 1); 
		
		
		System.out.println("Parametresiz hazırlayıcı nesnesi    : " + odaNesnesi1.hacimHesapla());		
		System.out.println("Bir parametreli hazırlayıcı nesnesi : " + odaNesnesi2.hacimHesapla());		
		System.out.println("İki parametreli hazırlayıcı nesnesi : " + odaNesnesi3.hacimHesapla());	
		System.out.println("Üç  parametreli hazırlayıcı nesnesi : " + odaNesnesi4.hacimHesapla());	
		
		
		double hacim = odaNesnesi1.hacimHesapla(6, 3, 2);
		System.out.println("Parametreli1 : " + hacim);	
		
		System.out.println("Parametreli2 : " + odaNesnesi2.hacimHesapla(14, 5, 3));		
	
	}

}
