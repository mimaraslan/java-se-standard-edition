package com.mimaraslan08_overloading_metodlar;

public class Asinifi {

	double sayi1;
	double sayi2;
	double sayi3;

	public Asinifi() {
	}
	
	public Asinifi(double sayi1, double sayi2, double sayi3) {
		this.sayi1 = sayi1;
		this.sayi2 = sayi2;
		this.sayi3 = sayi3;
	}




	void deneme() {
		System.out.print("Parametresiz metod : ");
		System.out.println("SAYI1: " + sayi1 + "   SAYI2: " + sayi2 + "   SAYI3: "  + sayi3);
	}

	void deneme(int sayi1) {
		System.out.println("SAYI1: " + sayi1);
	}

	void deneme(int sayi1, int sayi2) {
		System.out.println("SAYI1: " + sayi1 + "   SAYI2: " + sayi2);
	}
	
	void deneme(int sayi1, int sayi2, int sayi3) {
		System.out.println("SAYI1: " + sayi1 + "   SAYI2: " + sayi2 + "   SAYI3: "  + sayi3);
	}
	
	double deneme(float sayi1) {
		System.out.println("float sayi1: " + sayi1);
		return sayi1 * sayi1;
	}

	double deneme(double sayi1) {
		System.out.println("double sayi1: " + sayi1);
		return sayi1 * sayi1;
	}
	
	

}