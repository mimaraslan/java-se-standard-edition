package com.mimaraslan08_overloading_metodlar;

public class Bsinifi {    
	public static void main(String[] args) {

		Asinifi aNesnesi = new Asinifi();
		double sonuc;
		int iSayisi = 3;
			
		aNesnesi.deneme();
		aNesnesi.deneme(2);
		aNesnesi.deneme(4, 5);
		aNesnesi.deneme(8, 9, iSayisi);
		
		sonuc = aNesnesi.deneme(26f);
		System.out.println(sonuc);	
		
		System.out.println(aNesnesi.deneme(26.0));		
	
		Asinifi aNesnesi2 = new Asinifi(10, 7, 1);
		aNesnesi2.deneme();
	}

}
