package com.mimaraslan;

public class _20_NestedForArttirim {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print("*");
				System.out.print(j + 1);
			}

			// yeni satÝr
			System.out.println("");
		}
		
		
		
		
		
		
		int i, j;
		for (i = 0; i < 20; i++) {
			for (j = i; j < 20; j++)
				System.out.print(".");
			System.out.println();
		}
		
		
		
		
	}

}
