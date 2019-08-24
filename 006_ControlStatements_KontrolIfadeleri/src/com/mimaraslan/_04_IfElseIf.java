package com.mimaraslan;

public class _04_IfElseIf {

/*
	 
	if(condition) 
		statement;
	else if(condition) 
		statement;
	else if(condition) 
		statement;
	.
	.
	else
		statement;

*/
	public static void main(String[] args) {
		
		int sayi = 89;
        char harf = '-';

        if (sayi >= 90) {
            harf = 'A';
        } else if (sayi >= 80) {
            harf = 'B';
        } else if (sayi >= 70) {
            harf = 'C';
        } else if (sayi >= 60) {
            harf = 'D';
        } else {
            harf = 'F';
        }
        System.out.println("SONUÇ = " + harf);

        
        
        
      
        int sayi1 = 14;
        int sayi2 = 7;
       
        if(sayi1 > sayi2){
                System.out.println(sayi1 + " büyüktür " + sayi2 + " küçüktür ");
        }
        else if(sayi1 < sayi2){
                System.out.println(sayi1 + " küçüktür " + sayi2 + " büyüktür ");
        }
        else{
                System.out.println(sayi1 + " eﬂittir " + sayi2);
        }  
        
	}

}
