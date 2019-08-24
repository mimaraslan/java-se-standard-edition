package com.mimaraslan03_parametresiz_double_metod_return_iki_sinif_icice_iki_nesneli;
 
public class Arsa {
 
	  double en;
	  double boy;
   
	  double alanHesapla() {
	        return en * boy;
	      }    

}


 
class Hesap {    
	public static void main(String[] args) {
		
		double alan;
		Arsa arsaNesnesi1 = new Arsa();
		Arsa arsaNesnesi2 = new Arsa();
		
		
		System.out.println("arsaNesnesi ve değerleri");
		arsaNesnesi1.en = 57.1;
		arsaNesnesi1.boy = 6.32;

		System.out.println("EN        : " + arsaNesnesi1.en);
		System.out.println("BOY       : " + arsaNesnesi1.boy);

	    alan = arsaNesnesi1.en * arsaNesnesi1.boy;
		System.out.println("ARSANIN ALANI : " + alan);
			
		alan = arsaNesnesi1.alanHesapla();
		System.out.println("METODDAN GELEN ARSANIN ALANI : " + alan);
		
		
		
		
		System.out.println("-------------");
		System.out.println("arsaNesnesi2 ve değerleri");
		
		arsaNesnesi2.en = 145.3;
		arsaNesnesi2.boy = 12.99;

		System.out.println("EN2        : " + arsaNesnesi2.en);
		System.out.println("BOY2       : " + arsaNesnesi2.boy);


		alan = arsaNesnesi2.en * arsaNesnesi2.boy;
		System.out.println("ARSANIN ALANI2 : " + alan);
		
		System.out.println("METODDAN GELEN ARSANIN ALANI2 : " + arsaNesnesi2.alanHesapla());

	}

}
