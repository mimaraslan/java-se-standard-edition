package com.mimaraslan;

public class _18_For_Ile_AsalSayilariBulma {

	public static void main(String[] args) {
		
		
        int limit = 20;
       
        System.out.println("1 ile " + limit + " arasındaki asal sayılar");
       
        //1. for dongusu
        for(int i=1; i < limit; i++){
               
                boolean durum = true;
               
              //2. for dongusu
                for(int j=2; j < i ; j++){
                       
                        if(i % j == 0){
                                durum = false;
                                break;
                        }
                }
                // denetle ve yazdır
                if(durum)
                        System.out.print(i + " ");
        }

	}

}
