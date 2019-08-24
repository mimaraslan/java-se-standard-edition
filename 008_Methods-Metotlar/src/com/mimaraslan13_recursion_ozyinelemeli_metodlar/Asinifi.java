package com.mimaraslan13_recursion_ozyinelemeli_metodlar;

public class Asinifi {

	int faktoriyelAl(int n) {
		
		if ((n == 1) || (n <= 0)) {
			return 1;
			}else{	  
		    return faktoriyelAl(n - 1) * n;
			}
		}

}