package com.mimaraslan;

public class TipDonusumleri {


	public static void main(String[] args) {
		byte sayi1;
		int sayi2 = 128;
		float sayi3 = 15.17f;
		double sayi4 = 192.3 ;

		sayi1 = (byte) sayi2;
		System.out.println("int tipindeki veri byte tipinde " + sayi1);
		
		sayi1 = (byte) sayi3;
		System.out.println("float tipindeki veri byte tipinde " + sayi1);
		
		sayi1 = (byte) sayi4;
		System.out.println("double tipindeki veri byte tipinde " + sayi1);
		
		
		sayi4 = sayi2;
		System.out.println("double tipindeki veri int tipinde " + sayi4);
		
		sayi4 = sayi3;
		System.out.println("double tipindeki veri float tipinde " + sayi4);
		
		
	}

}
