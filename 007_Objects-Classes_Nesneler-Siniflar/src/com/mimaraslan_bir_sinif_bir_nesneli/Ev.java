package com.mimaraslan_bir_sinif_bir_nesneli;

public class Ev {
	
	//PROPERTY : NESNE OZELLIKLERI 
	  double en;
	  double boy;
	  double yukseklik; 
	  
	  
	public static void main(String[] args) {
		
		//INSTANCE : SINIFIN ORNEGI
		Ev evNesnesi = new Ev(); 
	
		evNesnesi.en = 4;
		evNesnesi.boy = 3;
		evNesnesi.yukseklik = 5;
		
		 System.out.println("EN        : " + evNesnesi.en);
		 System.out.println("BOY       : " + evNesnesi.boy);
		 System.out.println("Y†KSEKLÜK : " + evNesnesi.yukseklik);
	}

}
