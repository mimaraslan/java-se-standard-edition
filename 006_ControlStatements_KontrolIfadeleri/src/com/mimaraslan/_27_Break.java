package com.mimaraslan;

public class _27_Break {

	public static void main(String[] args) {

		for (int var = 0; var < 25; var++) {
			System.out.println("De�er : " + var);

			if (var == 3)
				break;
		}

		
		
		
		int a = 0;
		while (a < 20) {
			if (a == 5)
				break; 
			System.out.println("a: " + a);
			a++;
		}
		    
		    
		
		
		for (int var1 = 0; var1 < 5; var1++) {
			for (int var2 = 1; var2 < 5; var2++) {
				System.out.println("De�er1 : " + var1 + ",     De�er2 : " + var2);

				if (var1 == 3)
					break;

			}
		}
		
		
		
	
		
		
		
		int intTipindeDizi[] = new int[] { 1, 2, 3, 4, 5 };

		for (int i = 0; i < intTipindeDizi.length; i++) {
			if (intTipindeDizi[i] == 4)
				break;
			else
				System.out.println(intTipindeDizi[i]);
		}
		
		
		
		
		
		
		int[] sayiDizisi = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int arananSayi = 6;

		int i;
		boolean bulunanDeger = false;

		for (i = 0; i < sayiDizisi.length; i++) {
			if (sayiDizisi[i] == arananSayi) {
				bulunanDeger = true;
				break;
			}
		}

		if (bulunanDeger) {
			System.out.println("Aranan " + arananSayi + " bulundu�u index " + i);
		} else {
			System.out.println(arananSayi + " say�s� dizide yok!");
		}

	}

}
