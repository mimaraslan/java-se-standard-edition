package com.mimaraslan06.objectsinifi_instanceof;

public class Test {


	
	public static void main(String[] args) {
		A aNesnesi = new A();
		B bNesnesi = new B();
		C cNesnesi = new C();
		D dNesnesi = new D();
		
	 
		
		
		Object objectSinifininTipindekiNesneReferansi = aNesnesi;		
		((A) objectSinifininTipindekiNesneReferansi).yaz();
		
		objectSinifininTipindekiNesneReferansi = bNesnesi;		
		((B) objectSinifininTipindekiNesneReferansi).yaz();
		
		objectSinifininTipindekiNesneReferansi = cNesnesi;		
		((C) objectSinifininTipindekiNesneReferansi).yaz();
		
		objectSinifininTipindekiNesneReferansi = dNesnesi;		
		 ((D) objectSinifininTipindekiNesneReferansi).yaz();

		
		if( cNesnesi instanceof D){
			System.out.println("cNesnesi D sinifina ait");
			
		}else{
			System.out.println("cNesnesi D sinifina ait degil");
		}
	
		
	}

}
