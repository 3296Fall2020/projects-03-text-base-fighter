/*    */ package com.hotmail.kalebmarc.textfighter.player;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Coins
/*    */ {
/*    */   private static int coins;
/*    */   private static int bank;
/*    */   
/*    */   public static int get() {
/* 12 */     return coins;
/*    */   }
/*    */   
/*    */   public static void set(int amount, boolean add) {
/* 16 */     if (!add) {
/* 17 */       coins = amount;
/*    */     } else {
/* 19 */       coins += amount;
/* 20 */       if (amount < 0) Stats.totalCoinsSpent += -amount; 
/* 21 */       if (coins < 0) coins = 0; 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\player\Coins.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */