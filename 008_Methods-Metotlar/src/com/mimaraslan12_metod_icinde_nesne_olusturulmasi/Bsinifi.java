package com.mimaraslan12_metod_icinde_nesne_olusturulmasi;

public class Bsinifi {    
	public static void main(String[] args) {
		
		Asinifi obj1 = new Asinifi(5);
		Asinifi obj2;
		    
		    
		obj2 = obj1.metodIcindeNesneOlustur();
	    System.out.println("ob1 nesnesine göre sayı değeri: " + obj1.sayi);
	    System.out.println("ob2 nesnesine göre sayı değeri: " + obj2.sayi);
	    
	    obj2 = obj2.metodIcindeNesneOlustur();
	    System.out.println("ob2 nesnesi üzerinden metod çağırılmasından sonra " +
	    		"ob2 nesnesine göre sayı değeri: " + obj2.sayi);
	    System.out.println("ob2 nesnesi üzerinden metod çağırılmasından sonra " +
	    		"ob1 nesnesine göre sayı değeri: " + obj1.sayi);


	}
}
