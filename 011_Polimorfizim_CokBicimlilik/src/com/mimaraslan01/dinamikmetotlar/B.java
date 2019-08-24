package com.mimaraslan01.dinamikmetotlar;

public class B extends A {

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
