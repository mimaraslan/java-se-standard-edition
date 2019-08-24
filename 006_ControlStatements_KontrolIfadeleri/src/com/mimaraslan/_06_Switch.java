package com.mimaraslan;

public class _06_Switch {

	/*
		switch (expression) { 
		case value1:
			// statement sequence
			break; 
		
		case value2:
			// statement sequence
			break; .
			. .
			case valueN:
			}
		}
		
	 */
	public static void main(String[] args) {
		
			
		
		
	/*	 int i=0;
         
         switch(i)
         {
                case 0:
                        System.out.println("i  0"); 
                       
                case 1:
                        System.out.println("i  1");  
                       
                case 2:
                        System.out.println("i  2");
                       
                default:
                        System.out.println("Varsay›lan mesaj!");
         }
         
		*/
		
		
		
		int ay = 5;
		String ayString;
		
		switch (ay) {
		case 1:
			ayString = "Ocak";
			break;
		case 2:
			ayString = "ﬁubat";
			break;
		case 3:
			ayString = "Mart";
			break;
		case 4:
			ayString = "Nisan";
			break;
		case 5:
			ayString = "May›s";
			break;
		case 6:
			ayString = "Haziran";
			break;
		case 7:
			ayString = "Temmuz";
			break;
		case 8:
			ayString = "A€ustos";
			break;
		case 9:
			ayString = "Eylül";
			break;
		case 10:
			ayString = "Ekim";
			break;
		case 11:
			ayString = "Kas›m";
			break;
		case 12:
			ayString = "Aral›k";
			break;
		default:
			ayString = "Geçersiz bir ay girdiniz!";
			break;
		}
		System.out.println(ayString);
	}

}
