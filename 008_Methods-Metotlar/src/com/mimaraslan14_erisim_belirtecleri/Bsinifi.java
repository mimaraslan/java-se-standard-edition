package com.mimaraslan14_erisim_belirtecleri;

public class Bsinifi {
	public static void main(String[] args) {

		Asinifi obj = new Asinifi();

		obj.sayi1 = 1;
		obj.sayi2 = 2;
		obj.sayi3 = 3;
		// obj.sayi4 = 4; // Hata!
		   
	
				
		System.out.println("sayi1: " + obj.sayi1);
		System.out.println("sayi2: " + obj.sayi2);
		System.out.println("sayi3: " + obj.sayi3);

		System.out.println("-------------public"); 
		
		obj.setSayi1(10);
		System.out.println("sayi1: " + obj.sayi1);
		System.out.println("sayi1: " + obj.getSayi1());

		
		System.out.println("-------------default");

		obj.setSayi2(20);
		System.out.println("sayi2: " + obj.sayi2);
		System.out.println("sayi2: " + obj.getSayi2());

		
		System.out.println("-------------protected");

		obj.setSayi3(20);
		System.out.println("sayi3: " + obj.sayi3);
		System.out.println("sayi3: " + obj.getSayi3());
		
		System.out.println("-------------private");

		obj.setSayi4(30);
	  //System.out.println("sayi4: " + obj.sayi4);
		System.out.println("sayi4: " + obj.getSayi4());

	}
}
