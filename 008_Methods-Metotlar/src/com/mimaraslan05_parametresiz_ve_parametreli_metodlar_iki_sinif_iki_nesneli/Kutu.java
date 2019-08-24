package com.mimaraslan05_parametresiz_ve_parametreli_metodlar_iki_sinif_iki_nesneli;

public class Kutu {

	  double en;
	  double boy;
	  double yukseklik; 
	   
	  void hacimHesaplaParametresiz1() {
	        System.out.print("Parametresiz geri dönüş değeri olmayan metodun içinden yapılan hacim hesabı : ");
	        System.out.println(en * boy * yukseklik);
	      }    
	  
	  
	  double hacimHesaplaParametresiz2() {
	        System.out.print("Parametresiz geri dönüş değeri olan metodun içinden yapılan hacim hesabı : ");
	        System.out.println(en * boy * yukseklik);
	        return en * boy * yukseklik;
	      }    
	  
	  
	  double hacimHesaplaParametreli(double parametreEn, double parametreBoy, double parametreYukseklik) {
	        System.out.print("Parametreli metodun içinden yapılan hacim hesabı : ");
	        System.out.println(parametreEn * parametreBoy * parametreYukseklik);
	        return parametreEn * parametreBoy * parametreYukseklik;
	      }    

}
