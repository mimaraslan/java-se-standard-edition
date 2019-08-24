package com.mimaraslan;

public class _17_For_Ile_TekVeyaCiftSayilarinYazdirilmasi {

	public static void main(String[] args) {
		
        int limit = 50;
       
        for(int i=1; i <= limit; i++){
               
                //Tek sayilar
                if( i % 2 != 0){
                        System.out.print(i + " ");
                }
      
        }

        System.out.println("");
        
        int limit2 = 50;
        for(int i2=1; i2 <= limit2; i2++){
            
            // Cift sayilar
            if( i2 % 2 == 0){
                    System.out.print(i2 + " ");
            }
    }
        
        
	}

}
