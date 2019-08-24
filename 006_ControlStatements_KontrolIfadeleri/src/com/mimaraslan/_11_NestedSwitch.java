package com.mimaraslan;

public class _11_NestedSwitch {

	public static void main(String[] args) {

		int i = 0;
		int j = 1;

		switch (i) {
		case 0:
			
			
			switch (j) {
			case 0:
				System.out.println("i = 0, j = 0");
				break;

			case 1:
				System.out.println("i = 0, j = 1");
				break;

			default:
				System.out.println("‹çteki case'in varsay›lan mesaj›");
			}

			
			
			
			break;

		default:
			System.out.println("D›ﬂtaki case'in varsay›lan mesaj›");

		}

	}
}
