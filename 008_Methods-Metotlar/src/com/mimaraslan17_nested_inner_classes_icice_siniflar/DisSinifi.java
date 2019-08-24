package com.mimaraslan17_nested_inner_classes_icice_siniflar;

public class DisSinifi {

	int sayi = 571;

	void disSinifinMetodu() {
		
		IcSinif icSinifNesnesi = new IcSinif();
		icSinifNesnesi.icSinifinMetodu();
		
		System.out.println("DisSiniftaki disSinifinMetodunun ici  = " + sayi);
		
	}

	
	
	
	 class IcSinif {

	    int sayi = 632;

		void icSinifinMetodu() {
			System.out.println("IcSiniftaki icSinifinMetodunun ici    = " + sayi);
		}
	}
	
	
	
	

	public static void main(String[] args) {

		System.out.println("DisSinif");
		DisSinifi disSinifNesnesi = new DisSinifi();
		disSinifNesnesi.disSinifinMetodu();

	}

}
