package com.mimaraslan;

public class _25_For_Ve_Diziler_Ile_FibonacciSerisi {

	public static void main(String[] args) {
		
		//Bir Fibonacci serisi için s›n›r›m›z
        int sinirSayisi = 10;
       
        long[] seriler = new long[sinirSayisi];
       
        //Fibonacci serilerin ilk 2 eleman›
        seriler[0] = 0;
        seriler[1] = 1;
       
        //Fibonacci serilerini bulal›m
        for(int i=2; i < sinirSayisi; i++){
                seriler[i] = seriler[i-1] + seriler[i-2];
        }
       
        //Fibonacci seriler sayilarini yazdiralim
        System.out.println("Fibonacci seri s›n›r› : " + sinirSayisi);
        for(int i=0; i< sinirSayisi; i++){
                System.out.print(seriler[i] + " ");
        }
	}

}
