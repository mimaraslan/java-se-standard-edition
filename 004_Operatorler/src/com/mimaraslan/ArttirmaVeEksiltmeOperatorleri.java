package com.mimaraslan;

public class ArttirmaVeEksiltmeOperatorleri {


	public static void main(String[] args) {
		int sayi1 = 9, sayi2 = 100, sayi3 = 0, sayi4;
		
		sayi3 = sayi1 + 1;
		System.out.println("sayi1 + 1 = " + sayi3 );
		
		sayi3 = 0;  sayi1 = 9;
		sayi3 = sayi1++;
		System.out.println("sayi1++ = " + sayi3 );
		
		sayi3 = 0; sayi1 = 9;
		sayi3 = ++sayi1;
		System.out.println("++sayi1 = " + sayi3 );
		
		
		
		sayi4 = sayi2 - 1;
		System.out.println("sayi2 - 1 = " + sayi4 );
		
		sayi4 = 0; sayi2 = 100;
		sayi4 = sayi2--;
		System.out.println("sayi2-- = " + sayi4 );
		
		sayi4 = 0; sayi2 = 100;
		sayi4 = --sayi2;
		System.out.println("--sayi2 = " + sayi4 );

	}

}
