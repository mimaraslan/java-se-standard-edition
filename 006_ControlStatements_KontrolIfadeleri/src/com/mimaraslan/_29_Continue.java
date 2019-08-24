package com.mimaraslan;

public class _29_Continue {

	public static void main(String[] args) {
		
		
		for (int i = 0; i < 8; i++) {
			System.out.print(i + " ");
			if (i % 3 == 0)
				continue;
			System.out.println("");
		}
		 
		
		
		for (int var1 = 0; var1 < 5; var1++) {

			for (int var2 = 0; var2 < 3; var2++) {
				
				if (var2 == 2)
					continue;

				System.out.println("var1:" + var1 + ", var2:" + var2);

			}

		}
		
		
		
		
		

		 
		
		
		int intArray[] = new int[] { 1, 2, 3, 4, 5 };

		System.out.println("3 hari tŸm numaralar :");
		
		for (int j = 0; j < intArray.length; j++) {
			
			if (intArray[j] == 3)
				continue;
			else
				System.out.println(intArray[j]);
		}
		
		
		
		
		
		String cumle = "GŸzel gšren, gŸzel dŸßŸnŸr," 
		+ "gŸzel dŸßŸnen, hayatÝndan lezzet alÝr.";
		
		int adet = 0;

		for (int m = 0; m < cumle.length(); m++) {
		
			if (cumle.charAt(m) != 'z')
				continue;
			adet++;
		}
		System.out.println(adet + " tane bulundu.");

	}

}
