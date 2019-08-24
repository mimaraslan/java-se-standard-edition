package com.mimaraslan;

public class _10_SwitchDongusundeStringKullanimi {

	public static void main(String[] args) {

		String ay = "niSAN";
		

		int geriDonenAy = aySayisiniAl(ay.toUpperCase());

		if (geriDonenAy == 0) {
			System.out.println("Geçersiz ay");
		} else {
			System.out.println(geriDonenAy);
		}

	}

	public static int aySayisiniAl(String ay) {

		int aySirasi = 0;

		if (ay == null) {
			return aySirasi;
		}

		switch (ay) {
		case "OCAK":
			aySirasi = 1;
			break;
		case "ﬁUBAT":
			aySirasi = 2;
			break;
		case "MART":
			aySirasi = 3;
			break;
		case "N‹SAN":
			aySirasi = 4;
			break;
		case "MAYIS":
			aySirasi = 5;
			break;
		case "HAZ‹RAN":
			aySirasi = 6;
			break;
		case "TEMMUZ":
			aySirasi = 7;
			break;
		case "A⁄USTOS":
			aySirasi = 8;
			break;
		case "EYLÜL":
			aySirasi = 9;
			break;
		case "EK‹M":
			aySirasi = 10;
			break;
		case "KASIM":
			aySirasi = 11;
			break;
		case "ARALIK":
			aySirasi = 12;
			break;
		default:
			aySirasi = 0;
			break;
		}

		return aySirasi;
	}

}
