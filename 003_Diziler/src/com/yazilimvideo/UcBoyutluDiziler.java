package com.yazilimvideo;

public class UcBoyutluDiziler {


	public static void main(String[] args) {
int sayiIkiBoyutlu[][][] = new int [3][4][5]; //i j k

		
		for(int i = 0; i<3 ; i++){
			for (int j = 0; j <4 ; j++) {
				for (int k = 0; k <5; k++) {
					sayiIkiBoyutlu[i][j][k] = (i+j+k)*2;
				}
				
			}
		}
		
		for(int i = 0; i<3 ; i++){
			for (int j = 0; j <4 ; j++) {
				for (int k = 0; k <5; k++) {
				System.out.print( sayiIkiBoyutlu[i][j][k] + " ");   	 
				}
				System.out.println(); 
			}
			System.out.println(); 
		}
		

	}

}
