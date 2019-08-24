package com.mimaraslan06.objectsinifi_instanceof;

public class B extends A {


  double  sayi1, sayi2;
	
	public B() {
		super();
	}

	@Override
	protected String yaz() {
		String sonuc = "B sinifi";
		System.out.println(sonuc);
		return sonuc;
	}

}
