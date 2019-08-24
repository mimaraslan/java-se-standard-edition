package com.yazilimvideo;

public class IkiBoyutluDizilerdeDegerlerinAtanmasi {

	public static void main(String[] args) {
		 double sayi[][]= {
				 {1299.0, 1071.0, 1923.0, 1453.0},
				 {5.71, 6.22 , 6.32, 10.71 },
				 {1, 2, 3.0, 4.7},
				 {2+4.0, 6*2, 5-2.0, 1453-2016}
				 };
		 /*
		 System.out.println(sayi[0][0]);
		 System.out.println(sayi[1][0]);
		 System.out.println(sayi[2][0]);
		 System.out.println(sayi[3][0]);
		 */
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				 System.out.print("    " + sayi[i][j] );
			}
			 System.out.println();
		}

	}

}
