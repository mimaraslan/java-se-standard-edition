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
        System.out.println("SONU� = " + harf);

        
        
        
      
        int sayi1 = 14;
        int sayi2 = 7;
       
        if(sayi1 > sayi2){
                System.out.println(sayi1 + " b�y�kt�r " + sayi2 + " k���kt�r ");
        }
        else if(sayi1 < sayi2){
                System.out.println(sayi1 + " k���kt�r " + sayi2 + " b�y�kt�r ");
        }
        else{
                System.out.println(sayi1 + " e�ittir " + sayi2);
        }  
        
	}

}
