package com.mimaraslan;

public class _24_For_Ve_Diziler {

	public static void main(String[] args) {

		// define an array
		int[] sayilar = new int[] { 1453, 1299, 571, 632, 1923 };

		int toplam = 0;

		for (int i = 0; i < sayilar.length; i++)
			toplam = toplam + sayilar[i];
		  //toplam +=  sayilar[i];

		// ortalama hesabÝ
		double ortalama = toplam / sayilar.length;

		System.out.println("SONUC : " + ortalama);

	}

}
