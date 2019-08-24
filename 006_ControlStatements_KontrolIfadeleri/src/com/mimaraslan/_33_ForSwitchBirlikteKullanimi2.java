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
				System.out.println("5'ten kŸŸk : " + i);
				break;
			case 5:
			case 6:
				System.out.println("7'den kŸŸk : " + i);
				break;
			case 7:
				System.out.println("7 sayÝsÝ : " + i);
				break;	
			default:
				System.out.println("7'den B†Y†K : " + i);
			}
	}
}