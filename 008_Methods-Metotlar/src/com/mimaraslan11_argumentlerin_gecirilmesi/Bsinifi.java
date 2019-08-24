package com.mimaraslan11_argumentlerin_gecirilmesi;

public class Bsinifi {    
	public static void main(String[] args) {
		
		int sayi1 = 14 , sayi2 = 53;
		
		Asinifi nesne1 = new Asinifi();
		System.out.println("B SINIFI Değerler geçirilmeden önce: " + sayi1 + " " + sayi2);
		nesne1.degerGonder(sayi1, sayi2);
		System.out.println("B SINIFI Değerler geçirildikten sonra: " + sayi1 + " " + sayi2);

		System.out.println("-------------");
		
		Asinifi nesne2 = new Asinifi(sayi1, sayi2);
        System.out.println("B SINIFI Nesne geçirilmeden önce: " + nesne2.degisken1 + " " + nesne2.degisken2);
        nesne2.nesneGonder(nesne2);
        System.out.println("B SINIFI Nesne geçirildikten sonra: " + nesne2.degisken1 + " " + nesne2.degisken2);
	}
}
