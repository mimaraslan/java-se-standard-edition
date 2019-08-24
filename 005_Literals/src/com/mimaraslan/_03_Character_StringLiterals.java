package com.mimaraslan;

public class _03_Character_StringLiterals {

	public static void main(String[] args) {
		
		long krediKartiNo = 1234_5678_9012_3456L;
		long sskNo = 999_99_9999L;
		float piSayisi =  3.14_15F;
		long hexBytes = 0xFF_EC_DE_5E;
		long hexWords = 0xCAFE_BABE;
		long maxLong = 0x7fff_ffff_ffff_ffffL;
		byte nybbles = 0b0010_0101;
		long bytes = 0b11010010_01101001_10010100_10010010;
		
		System.out.println("Kredi Kart No     : " + krediKartiNo);
		System.out.println("SSK No : " + sskNo);
		System.out.println("pi : " + piSayisi);
		System.out.println("hexBytes : " + hexBytes);
		System.out.println("hexWords : " + hexWords);
		System.out.println("maxLong : " + maxLong);
		System.out.println("nybbles : " + nybbles);
		System.out.println("bytes : " + bytes);
			
	}

}
