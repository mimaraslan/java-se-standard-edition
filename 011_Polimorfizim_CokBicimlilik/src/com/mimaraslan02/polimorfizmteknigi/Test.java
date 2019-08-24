package com.mimaraslan02.polimorfizmteknigi;

public class Test {

	public static void main(String[] args) {
		
		Sekil sekilNesneReferansi;

		Sekil sekilNesnesi = new Sekil(14f,53f);
		Dortgen dortgenNesnesi = new Dortgen((float)12, 99f);
		Ucgen ucgenNesnesi = new Ucgen(10, 20, 30);
		

		sekilNesneReferansi = dortgenNesnesi;
		System.out.println(sekilNesneReferansi.alaniHesapla());
		System.out.println(sekilNesneReferansi.cevreHesapla());
		
		sekilNesneReferansi = ucgenNesnesi;
		System.out.println(sekilNesneReferansi.alaniHesapla());
		System.out.println(sekilNesneReferansi.cevreHesapla());
		
		sekilNesneReferansi = sekilNesnesi;
		System.out.println(sekilNesneReferansi.alaniHesapla());
		System.out.println(sekilNesneReferansi.cevreHesapla());
		
		
	}

}
