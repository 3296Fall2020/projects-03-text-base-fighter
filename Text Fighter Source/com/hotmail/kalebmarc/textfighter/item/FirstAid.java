/*    */ package com.hotmail.kalebmarc.textfighter.item;
/*    */ 
/*    */ import com.hotmail.kalebmarc.textfighter.main.Action;
/*    */ import com.hotmail.kalebmarc.textfighter.main.Ui;
/*    */ import com.hotmail.kalebmarc.textfighter.player.Coins;
/*    */ import com.hotmail.kalebmarc.textfighter.player.Health;
/*    */ import com.hotmail.kalebmarc.textfighter.player.Stats;
/*    */ import com.hotmail.kalebmarc.textfighter.player.Xp;
/*    */ 
/*    */ 
/*    */ public class FirstAid
/*    */ {
/*    */   private static int firstAid;
/* 14 */   public static int used = 0;
/*    */   public static int price;
/*    */   public static int level;
/*    */   
/*    */   public static int get() {
/* 19 */     return firstAid;
/*    */   }
/*    */   public static void set(int amount, boolean add) {
/* 22 */     if (!add) {
/* 23 */       firstAid = amount;
/*    */     } else {
/* 25 */       firstAid += amount;
/* 26 */       if (firstAid < 0) firstAid = 0; 
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void use() {
/* 31 */     Action.cls();
/*    */     
/* 33 */     if (get() <= 0) {
/*    */       
/* 35 */       Ui.println("----------------------------------------------------");
/* 36 */       Ui.println("You have no First-Aid kits left!");
/* 37 */       Ui.println("Go to the shop to buy some more.");
/* 38 */       Ui.println("----------------------------------------------------");
/* 39 */       Action.pause();
/*    */     }
/* 41 */     else if (Health.get() == 100) {
/*    */       
/* 43 */       Ui.println("----------------------------------------------------");
/* 44 */       Ui.println("You already have full health!");
/* 45 */       Ui.println("You don't need a First-Aid kit!");
/* 46 */       Ui.println("----------------------------------------------------");
/* 47 */       Ui.println("Your health: " + Health.getStr());
/* 48 */       Ui.println("First-Aid kits: " + get());
/* 49 */       Ui.println("----------------------------------------------------");
/* 50 */       Action.pause();
/*    */     }
/*    */     else {
/*    */       
/* 54 */       set(-1, true);
/* 55 */       Health.gain(20);
/* 56 */       used++;
/*    */       
/* 58 */       Ui.println("----------------------------------------------------");
/* 59 */       Ui.println("You have used a First-Aid kit.");
/* 60 */       Ui.println("You've gained 20 health.");
/* 61 */       Ui.println("----------------------------------------------------");
/* 62 */       Ui.println("Your health: " + Health.getStr());
/* 63 */       Ui.println("First-Aid kits: " + get());
/* 64 */       Ui.println("----------------------------------------------------");
/* 65 */       Action.pause();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public static void buy() {
/* 71 */     if (Xp.getLevel() < level) {
/* 72 */       Ui.println("You have to be at least level " + level + " to buy this!");
/* 73 */       Action.pause();
/* 74 */     } else if (price <= Coins.get()) {
/* 75 */       Coins.set(-price, true);
/* 76 */       Stats.coinsSpentOnHealth += price;
/* 77 */       set(1, true);
/* 78 */       Ui.println("Thank you for your purchase. Come again soon! ");
/* 79 */       Action.pause();
/*    */     } else {
/* 81 */       Ui.println("You do not have enough coins.");
/* 82 */       Action.pause();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\item\FirstAid.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */