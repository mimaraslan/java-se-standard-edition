package com.mimaraslan10_parametre_olarak_nesnelerin_kullanilmasi;

public class Bsinifi {    
	public static void main(String[] args) {

		Asinifi nesne1 = new Asinifi();
		Asinifi nesne2 = new Asinifi(1, 4);
		Asinifi nesne3 = new Asinifi(1299, 1071);
		Asinifi nesne4 = new Asinifi();
		Asinifi nesne5 = new Asinifi(1299, 1071);
		
		 System.out.println("nesne1 == nesne2: " + nesne1.nesneleriKarsilastir(nesne2));
		 System.out.println("nesne1 == nesne3: " + nesne1.nesneleriKarsilastir(nesne3));
		 System.out.println("nesne1 == nesne4: " + nesne1.nesneleriKarsilastir(nesne4));
		 System.out.println("nesne5 == nesne3: " + nesne5.nesneleriKarsilastir(nesne3));
	}

}
