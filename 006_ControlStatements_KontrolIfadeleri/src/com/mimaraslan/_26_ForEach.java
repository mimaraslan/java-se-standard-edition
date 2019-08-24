package com.mimaraslan;

public class _26_ForEach {

	public static void main(String[] args) {
		int[] sayilar = { 1453, 1299, 571, 632, 1923 };
		for (int deger : sayilar) {
			System.out.println("Dizinin elemanı : " + deger);
		}

		
		
		int sayi[] = { 1, 4, 5, 3 };
		int toplam = 0;
	
		for (int m : sayi) {
			System.out.println("Eleman: " + m);
			toplam += m;
			
		  //  if(m == 4) break;
		    
		}
		System.out.println("TOPLAM: " + toplam);
		
		
		
		
		
		
		
		
		int sonuc = 0;
		int ciftBoyutluDizi[][] = new int[3][5];

		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 5; j++)
				ciftBoyutluDizi[i][j] = (i + 2) * (j + 3);

		for (int tekBoyutluDizi[] : ciftBoyutluDizi) {
			for (int tbd : tekBoyutluDizi) {
				System.out.println("Değer  = " + tbd);
				sonuc += tbd;
			}
		}
		System.out.println("Toplam = " + sonuc);
		
		
		
	}

}
