package com.mimaraslan04.polimorfizmteknigiabstract;

public class Test {

	public static void main(String[] args) {
		
		Sekil sekilNesneReferansi;

		Dortgen dortgenNesnesi = new Dortgen((float)12, 99f);
		Ucgen ucgenNesnesi = new Ucgen(10, 20, 30);
		

		sekilNesneReferansi = dortgenNesnesi;
		System.out.println(sekilNesneReferansi.alaniHesapla());
		System.out.println(sekilNesneReferansi.cevreHesapla());
		sekilNesneReferansi.yaz1();
		
		sekilNesneReferansi = ucgenNesnesi;
		System.out.println(sekilNesneReferansi.alaniHesapla());
		System.out.println(sekilNesneReferansi.cevreHesapla());
		System.out.println(sekilNesneReferansi.yaz2());

		
	}

}
