package com.mimaraslan;

public class _30_Continue_Label {

	public static void main(String[] args) {
		
		
		
		
		
		etiket: for (int var1 = 0; var1 < 5; var1++) {

			for (int var2 = 0; var2 < 3; var2++) {
				
				if (var2 == 2)
					continue etiket;

				System.out.println("var1:" + var1 + ", var2:" + var2);

			}

		}
		
		
	
	
	
		int intArray[][] = new int[][] { { 1, 2 }, { 3, 4 } };

		Outer: for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				if (intArray[i][j] == 3)
					continue Outer;
				System.out.println("Eleman : " + intArray[i][j]);
			}
		}
	
	
		
		
		
		
		String cumle = "GŸzel gšren, gŸzel dŸßŸnŸr," 
				+ "gŸzel dŸßŸnen, hayatÝndan lezzet alÝr.";
		
		String aranan = "gšren";
		
		boolean durum = false;

		int uzunluk = cumle.length() - aranan.length();

		test: for (int i = 0; i <= uzunluk; i++) {
			int n = aranan.length();
			int j = i;
			int k = 0;
			while (n-- != 0) {
				if (cumle.charAt(j++) != aranan.charAt(k++)) {
					continue test;
				}
			}
			durum = true;
			break test;
		}
		System.out.println(durum ? "Bulundu" : "BulunamadÝ");

	}

}
