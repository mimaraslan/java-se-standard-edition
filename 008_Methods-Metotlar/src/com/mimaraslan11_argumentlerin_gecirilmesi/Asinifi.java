package com.mimaraslan11_argumentlerin_gecirilmesi;

public class Asinifi {

	int degisken1, degisken2;

	public Asinifi() {
	}

	
	public Asinifi(int p1, int p2) {
		this.degisken1 = p1;
		this.degisken2 = p2;
	}


//degerle aktar
	void degerGonder(int sayi1, int sayi2) {
		sayi1 = sayi1 - 2;
		sayi2 = sayi2 + 2;
		System.out.println("degerGonder Metod içindeki değerler " +
				"    sayi1: " + sayi1 + "    sayi2: " + sayi2);
		
	}

//referansla aktar
	void nesneGonder(Asinifi gelenNesne) {
		gelenNesne.degisken1 -= 5;
		gelenNesne.degisken2 += 5;
		System.out.println("nesneGonder Metod içindeki değerler " +
				"    degisken1: " + gelenNesne.degisken1 +
				"    degisken2: " + gelenNesne.degisken2);
	}

}