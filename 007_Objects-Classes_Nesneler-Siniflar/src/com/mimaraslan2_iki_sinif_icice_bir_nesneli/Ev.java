package com.mimaraslan2_iki_sinif_icice_bir_nesneli;

public class Ev {

	  double en;
	  double boy;
	  double yukseklik; 

}


class Hesap {

	public static void main(String[] args) {
		
		Ev anahtar = new Ev(); 
		
		anahtar.en = 6;
		anahtar.boy = 3;
		anahtar.yukseklik = 2;
		
		 System.out.println("EN        : " + anahtar.en);
		 System.out.println("BOY       : " + anahtar.boy);
		 System.out.println("Y†KSEKLÜK : " + anahtar.yukseklik);
		 
		
		   double hacim = anahtar.en * anahtar.boy * anahtar.yukseklik;
		    System.out.println("EVÜN HACÜMÜ : " + hacim);
		    
	}

}