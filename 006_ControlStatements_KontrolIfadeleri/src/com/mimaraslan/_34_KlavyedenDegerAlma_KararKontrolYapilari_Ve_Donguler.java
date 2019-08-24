package com.mimaraslan;

import java.io.IOException;

public class _34_KlavyedenDegerAlma_KararKontrolYapilari_Ve_Donguler {

	public static void main(String[] args) throws IOException {

		char secilen;
		do {
			System.out.println("Ana menüye hoﬂ geldiniz:");
			System.out.println("  1. Güncel");
			System.out.println("  2. Havale Yap");
			System.out.println("  3. Kontür Gönder");
			System.out.println("  4. Hesap Aç");
			System.out.println("  5. Limitleri Gör\n");
			System.out.println("Lütfen bir menü seçiniz : ");
			secilen = (char) System.in.read();
		} while (secilen < '1' || secilen > '5');

		System.out.println("\n");

		switch (secilen) {
		case '1':
			System.out.println("Güncel menüsü seçildi.\n");
			break;
		case '2':
			System.out.println("Havale Yap menüsü seçildi.\n");
			break;
		case '3':
			System.out.println("Kontür Gönder\n");
			System.out.println("menüsü seçildi.");
			break;
		case '4':
			System.out.println("Hesap Aç\n");
			System.out.print(" menüsü ");
			System.out.println("seçildi.");
			break;
		case '5':
			System.out.println("Limitleri Gör\n");
			System.out.print("menüsü seçildi.");
			break;
		}

	}
}
