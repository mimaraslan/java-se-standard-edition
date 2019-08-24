package com.mimaraslan03.interface_ve_degiskenler;
 
public class A {
		public static int sayi1 = 571;
		protected static	int sayi2 = 1453;
		static int  sayi3 = 1299;
	   private	static int sayi4 = 632;

	   
	   
	
	
	interface IA {
		public int s1 = 571;
		//protected	int s2 = 1453;
	          int s3 = 1299;
	  /// private	int s4 = 632;

	}

	interface IB {

		public static int ss1 = 571;
		static int  ss3 = 1299;

	}

	interface IC {
		public final int sf1 = 571;
		final int  sf3 = 1299;
	}

	interface ID {
		//public abstract int sa1 = 571;
		//abstract int  sa3 = 1299;

	}

	interface IE {
	int sonuc = sayi1 + sayi2 ;

	}
}
