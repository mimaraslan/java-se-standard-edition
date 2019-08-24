package com.mimaraslan;

public class _22_NestedForArttirimAzaltim {

	public static void main(String[] args) {
		// 1. Döngü
		for (int i = 1; i <= 5; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}

			System.out.println("");
		}
		

		System.out.println("");
		
		
		// 2. Döngü
		for (int i = 5; i > 0; i--) {

			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}

			System.out.println("");
		}
	
		
	}

}
