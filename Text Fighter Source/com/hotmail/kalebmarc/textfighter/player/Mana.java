package com.hotmail.kalebmarc.textfighter.player;

import com.hotmail.kalebmarc.textfighter.main.Handle;

public class Mana {
    private static int mana;
    private static int outOf;
    private static int UPGRADE_PRICE;
    
    public static String getStr() {
     return mana + "/" + outOf;
   }
  
   public static int get() {
     return mana;
   }   
   
   public static int getOutOf() {
     return outOf;
   }

   public static void set(int m) {
     mana = m;
     if (mana > outOf) {
       Handle.error("Error Code - 002");
       mana = outOf;
     } 
   }

   public static void set(int m, int mOutOf) {
         mana = m;
         outOf = mOutOf;
         if (mana > outOf) {
           Handle.error("Error Code - 002");
           mana = outOf;
         } 
    }

    public static void setUpgradePrice(int price) {
         UPGRADE_PRICE = price;
    }

    public static void gain(int m) {
        mana += m;
        if (mana > outOf)
            mana = outOf; 
    }
           
    public static void lose(int m) {
        mana -= m;
        if (mana <= 0)
            mana = 0; 
    }
}
