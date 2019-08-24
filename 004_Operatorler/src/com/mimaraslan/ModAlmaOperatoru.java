package com.mimaraslan;

public class ModAlmaOperatoru {


	public static void main(String[] args) {
		int sayi = 27;
		System.out.println(sayi + " SAYISININ MOD 3  = " + sayi % 3);
		
		sayi = sayi + 1;
		System.out.println(sayi + " SAYISININ MOD 3  = " + sayi % 3);
		
		sayi = ++sayi;
		System.out.println(sayi + " SAYISININ MOD 3  = " + sayi % 3);
		
		
		double sayi2 = 5.71;
		System.out.println(sayi2 + " SAYISININ MOD 3  = " + sayi2 % 3);
	}

}
