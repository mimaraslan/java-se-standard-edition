package com.mimaraslan;

import java.util.ArrayList;

public class _07_SwitchCase {

	public static void main(String[] args) {
		

		ArrayList<String> aylarListesi = new ArrayList<String>();

	        int ay = 111;

	        switch (ay) {
	            case 1:  aylarListesi.add("Ocak");
	            case 2:  aylarListesi.add("ﬁubat");
	            case 3:  aylarListesi.add("Mart");
	            case 4:  aylarListesi.add("Nisan");
	            case 5:  aylarListesi.add("May›s");
	            case 6:  aylarListesi.add("Haziran");
	            case 7:  aylarListesi.add("Temmuz");
	            case 8:  aylarListesi.add("A€ustos");
	            case 9:  aylarListesi.add("Eylül");
	            case 10: aylarListesi.add("Ekim");
	            case 11: aylarListesi.add("Kas›m");
	            case 12: aylarListesi.add("Aral›k");
	                     break;
	            default:   
	            	System.out.println("------Geçersiz bir ay girdiniz!-----"); 
	            	break;
	        }

	        if (aylarListesi.isEmpty()) {
	            System.out.println("Geçersiz bir ay girdiniz!");
	        } else {
	            for (String ayAdi : aylarListesi) {
	               System.out.println(ayAdi);
	            }
	        }
		

	}

}
