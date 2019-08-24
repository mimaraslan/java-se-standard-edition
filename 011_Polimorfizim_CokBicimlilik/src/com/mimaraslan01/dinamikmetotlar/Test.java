package com.mimaraslan01.dinamikmetotlar;

public class Test {


	
	public static void main(String[] args) {
		A aNesnesi = new A();
		B bNesnesi = new B();
		C cNesnesi = new C();
		D dNesnesi = new D();
		
		
		A aSinifininTipindekiNesneReferansi = dNesnesi;		
		aSinifininTipindekiNesneReferansi.yaz();
		
		aSinifininTipindekiNesneReferansi = cNesnesi;		
		aSinifininTipindekiNesneReferansi.yaz();
		
		aSinifininTipindekiNesneReferansi = bNesnesi;		
		aSinifininTipindekiNesneReferansi.yaz();
		
		aSinifininTipindekiNesneReferansi = aNesnesi;		
		aSinifininTipindekiNesneReferansi.yaz();
		
		aSinifininTipindekiNesneReferansi = bNesnesi;		
		aSinifininTipindekiNesneReferansi.yaz();
		
		aSinifininTipindekiNesneReferansi = cNesnesi;		
		aSinifininTipindekiNesneReferansi.yaz();
		
		aSinifininTipindekiNesneReferansi = dNesnesi;		
		aSinifininTipindekiNesneReferansi.yaz();
	
		
	}

}
