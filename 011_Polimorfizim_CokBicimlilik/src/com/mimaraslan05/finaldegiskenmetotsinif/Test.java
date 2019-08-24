package com.mimaraslan05.finaldegiskenmetotsinif;

public class Test {
	
	public static void main(String[] args) {
		A aNesneReferansi = null;
		B bNesne = new B();
	
		System.out.println(bNesne.hesapla3(14, 5.3));
		
		
		aNesneReferansi = bNesne;
		System.out.println(aNesneReferansi.hesapla2(12, 9.9));
		
		C cNesne = new C();
		aNesneReferansi = cNesne;
		System.out.println(aNesneReferansi.hesapla2(10, 7.1));
	}

}
