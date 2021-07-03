/*    */ package com.hotmail.kalebmarc.textfighter.item;
/*    */ 
/*    */ import com.hotmail.kalebmarc.textfighter.main.Action;
/*    */ import com.hotmail.kalebmarc.textfighter.main.Enemy;
/*    */ import com.hotmail.kalebmarc.textfighter.main.Ui;
/*    */ import com.hotmail.kalebmarc.textfighter.player.Coins;
/*    */ import com.hotmail.kalebmarc.textfighter.player.Stats;
/*    */ import com.hotmail.kalebmarc.textfighter.player.Xp;
/*    */ 
/*    */ public class Power
/*    */ {
/*    */   private static int powers;
/* 13 */   public static int used = 0;
/*    */   public static int price;
/*    */   public static int level;
/*    */   
/*    */   public static int get() {
/* 18 */     return powers;
/*    */   }
/*    */   public static void set(int amount, boolean add) {
/* 21 */     if (!add) {
/* 22 */       powers = amount;
/*    */     } else {
/* 24 */       powers += amount;
/* 25 */       if (powers < 0) powers = 0; 
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void use() {
/* 30 */     Action.cls();
/*    */     
/* 32 */     if (powers <= 0) {
/* 33 */       Ui.println("----------------------------------------------------");
/* 34 */       Ui.println("You have no POWER's left!");
/* 35 */       Ui.println("Go to the shop to buy some more.");
/* 36 */       Ui.println("----------------------------------------------------");
/* 37 */       Action.pause();
/*    */     } else {
/* 39 */       powers--;
/* 40 */       used++;
/* 41 */       Xp.set(20, true);
/* 42 */       Enemy.get().takeDamage(Enemy.get().getHealth());
/* 43 */       Ui.println("----------------------------------------------------");
/* 44 */       Ui.println("You have used a POWER.");
/* 45 */       Ui.println("The enemy has instantly died.");
/* 46 */       Ui.println("----------------------------------------------------");
/* 47 */       Ui.println("Enemy Health: " + Enemy.get().getHeathStr());
/* 48 */       Ui.println("POWER's: " + powers);
/* 49 */       Ui.println("----------------------------------------------------");
/* 50 */       Action.pause();
/*    */     } 
/*    */   }
/*    */   public static void buy() {
/* 54 */     if (Xp.getLevel() < level) {
/* 55 */       Ui.println("You have to be at least level " + level + " to buy this!");
/* 56 */       Action.pause();
/* 57 */     } else if (price <= Coins.get()) {
/* 58 */       Coins.set(-price, true);
/* 59 */       Stats.coinsSpentOnWeapons += price;
/* 60 */       set(1, true);
/* 61 */       Ui.println("Thank you for your purchase. Come again soon! ");
/* 62 */       Action.pause();
/*    */     } else {
/* 64 */       Ui.println("You do not have enough coins.");
/* 65 */       Action.pause();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\item\Power.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */