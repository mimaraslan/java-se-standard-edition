package com.mimaraslan15_static_anahtar_sozcugu;

public class Asinifi {

	 static int sayi1 = 8;
	 static int sayi2; //40

	 public static void yaz(int i) {

		System.out.println("i = " + i);
		System.out.println("sayi1 = " + sayi1  +"    sayi2 = " + sayi2);
	}

	static {
		System.out.println("Static block-kapsam içerisi.");
		sayi2 = sayi1 * 5;
	}
	
	public static void main(String[] args) {
	//	Asinifi  nesne = new Asinifi();
	//	nesne.yaz(1453);
		
		yaz(1453);
	}
}