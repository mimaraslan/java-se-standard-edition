package com.mimaraslan;

public class _33_ForSwitchBirlikteKullanimi2 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			switch (i) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("5'ten k���k : " + i);
				break;
			case 5:
			case 6:
				System.out.println("7'den k���k : " + i);
				break;
			case 7:
				System.out.println("7 say�s� : " + i);
				break;	
			default:
				System.out.println("7'den B�Y�K : " + i);
			}
	}
}