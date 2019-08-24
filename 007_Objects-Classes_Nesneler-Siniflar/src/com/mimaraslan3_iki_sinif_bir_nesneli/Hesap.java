package com.mimaraslan3_iki_sinif_bir_nesneli;

public class Hesap {

	public static void main(String[] args) {
		
		Ev anahtar = new Ev(); 
		
		anahtar.en = 5;
		anahtar.boy = 7;
		anahtar.yukseklik = 1;
		
		 System.out.println("EN        : " + anahtar.en);
		 System.out.println("BOY       : " + anahtar.boy);
		 System.out.println("Y†KSEKLÜK : " + anahtar.yukseklik);
		 
		
		   double hacim = anahtar.en * anahtar.boy * anahtar.yukseklik;
		    System.out.println("EV HACÜMÜ : " + hacim);
		    
	}

}
