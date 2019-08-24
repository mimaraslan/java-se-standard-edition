package com.mimaraslan;

public class IliskiselOperatorler {

	
	public static void main(String[] args) {
		int sayi1 = 571, sayi2 = 632, sayi3 = 571;
		boolean sonuc;
		
		sonuc = sayi1 < sayi2;	
		System.out.println(sonuc);
		
		sonuc = sayi1 + 1 <= sayi3;	// 572 < 571
		System.out.println(sonuc);
		
		
		sonuc = sayi1 > sayi2;	
		System.out.println(sonuc);
		
		sonuc = ++sayi1 >= sayi3;	// 572 > 571
		System.out.println(sonuc);

	}

}
