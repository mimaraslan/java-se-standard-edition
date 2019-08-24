package com.mimaraslan;

public class _28_Break_Label {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		
		
		boolean durumKontrol = true;
		etiket1: {
			etiket2: {
				etiket3: {
					System.out.println("break öncesi");
					if (durumKontrol)
						break etiket2;
					System.out.println("break sonras›");
				}
				System.out.println("etiket3 sonras›");
			}
			System.out.println("etiket2 sonras›");
		}
		
		
		
		
		
etiket: for (int var1 = 0; var1 < 4; var1++) {
			for (int var2 = 1; var2 < 4; var2++) {
				System.out.println("var1:" + var1 + ", var2:" + var2);

				if (var1 == 2)
					break etiket;

			}
		}
	
	
	
		
		
		
		
		

	
	
	
	
	
	

		int[][] tamSayiDizisi = { 
				{ 32, 87, 3, 589 }, 
				{ 12, 1076, 2000, 8 },
				{ 622, 127, 77, 955 } 
				};
		int arananSayi = 12;

		int i;
		int j = 0;
		boolean durum = false;

		etiketeGit: for (i = 0; i < tamSayiDizisi.length; i++) {
			for (j = 0; j < tamSayiDizisi[i].length; j++) {
				if (tamSayiDizisi[i][j] == arananSayi) {
					durum = true;
					break etiketeGit;
				}
			}
		}

		if (durum) {
			System.out.println("Aranan say› : " + arananSayi + "    " + i + ", " + j);
		} else {
			System.out.println(arananSayi + " dizide bulunmuyor!");
		}

	}

}
