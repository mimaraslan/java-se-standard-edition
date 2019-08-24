package com.yazilimvideo;

public class IkiBoyutluDiziler {

	
	public static void main(String[] args) {
		int sayiIkiBoyutlu[][] = new int [3][4]; //i j

		
		for(int i = 0; i<3 ; i++){
			for (int j = 0; j <4 ; j++) {
				sayiIkiBoyutlu[i][j] = i+j*2;
			}
		}
		
		
		
		
		for(int i = 0; i<3 ; i++){
			for (int j = 0; j <4 ; j++) {
				System.out.print( sayiIkiBoyutlu[i][j] + " ");   	  
			}
			System.out.println(); 
		}
		
		
	}

}
