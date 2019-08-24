package com.mimaraslan;

public class _05_IfElseIf_BirdenFazlaSartli {


	public static void main(String[] args) {
		
	       int ay = 7; 
		    String mevsim;
		    if(ay == 12 || ay == 1 || ay == 2)
		      mevsim = "K›ﬂ";
		    else if(ay == 3 || ay == 4 || ay == 5)
		      mevsim = "‹lkbahar";
		    else if(ay == 6 || ay == 7 || ay == 8)
		      mevsim = "Yaz";
		    else if(ay == 9 || ay == 10 || ay == 11)
		      mevsim = "Sonbahar";
		    else
		      mevsim = "Geçersiz bir ay seçtiniz!";
		    System.out.println("SONUÇ : " + mevsim);
		    
		    
		    

            int yil = 1453;
            if(   (yil % 400 == 0)    ||        (   (yil % 4 == 0) && (yil % 100 != 0)  )        )
                    System.out.println( yil + " senesi art›k bir y›ld›r.");
            else
                    System.out.println( yil + " senesi art›k bir y›l de€ildir.");
            

	}

}
