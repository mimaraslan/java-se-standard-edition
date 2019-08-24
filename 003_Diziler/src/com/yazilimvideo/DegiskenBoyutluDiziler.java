package com.yazilimvideo;

public class DegiskenBoyutluDiziler {

	public static void main(String[] args) {

		int sayiIkiBoyutlu[][] = new int[3][]; // i j

		sayiIkiBoyutlu[0] = new int [1];
		sayiIkiBoyutlu[1] = new int [2];
		sayiIkiBoyutlu[2] = new int [3];
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i+1; j++) {
				sayiIkiBoyutlu[i][j] = i + j * 2;
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print(sayiIkiBoyutlu[i][j] + " ");
			}
			System.out.println();
		}

	}

}
