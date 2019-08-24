package com.mimaraslan;

public class _08_SwitchBreak {

	public static void main(String args[]) {
        int ay = 7;
        String mevsim;
        switch (ay) {
          case 12:
          case 1:
          case 2:
            mevsim = "KIﬁ";
            break;
          case 3:
          case 4:
          case 5:
            mevsim = "‹LKBAHAR";
            break;
          case 6:
          case 7:
          case 8:
            mevsim = "YAZ";
            break;
          case 9:
          case 10:
          case 11:
            mevsim = "SONBAHAR";
            break;
          default:
            mevsim = "Geçersiz bir ay";
        }
        System.out.println("SONUÇ : " + mevsim + ".");
    }
}



