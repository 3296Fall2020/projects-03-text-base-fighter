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
/*    */ public class InstaHealth
/*    */ {
/*    */   private static int instaHealth;
/* 14 */   public static int used = 0;
/*    */   public static int price;
/*    */   public static int level;
/*    */   
/*    */   public static int get() {
/* 19 */     return instaHealth;
/*    */   }
/*    */   
/*    */   public static void set(int amount, boolean add) {
/* 23 */     if (!add) {
/* 24 */       instaHealth = amount;
/*    */     } else {
/* 26 */       instaHealth += amount;
/* 27 */       if (instaHealth < 0) instaHealth = 0;
/*    */     
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void use() {
/* 33 */     Action.cls();
/* 34 */     if (get() <= 0) {
/*    */       
/* 36 */       Ui.println("----------------------------------------------------");
/* 37 */       Ui.println("You have no Insta-Health's left!");
/* 38 */       Ui.println("Go to the shop to buy some more.");
/* 39 */       Ui.println("----------------------------------------------------");
/* 40 */       Action.pause();
/*    */     }
/* 42 */     else if (Health.get() == 100) {
/*    */       
/* 44 */       Ui.println("----------------------------------------------------");
/* 45 */       Ui.println("You already have full health!");
/* 46 */       Ui.println("You don't need an Insta-Health!");
/* 47 */       Ui.println("----------------------------------------------------");
/* 48 */       Ui.println("Your health: " + Health.getStr());
/* 49 */       Ui.println("Insta-Health's: " + get());
/* 50 */       Ui.println("----------------------------------------------------");
/* 51 */       Action.pause();
/*    */     }
/*    */     else {
/*    */       
/* 55 */       set(-1, true);
/* 56 */       Health.set(Health.getOutOf());
/* 57 */       used++;
/*    */       
/* 59 */       Ui.println("----------------------------------------------------");
/* 60 */       Ui.println("You have used an Insta-Health.");
/* 61 */       Ui.println("You're health has been fully restored.");
/* 62 */       Ui.println("----------------------------------------------------");
/* 63 */       Ui.println("Your health: " + Health.getStr());
/* 64 */       Ui.println("Insta-Health's: " + get());
/* 65 */       Ui.println("----------------------------------------------------");
/* 66 */       Action.pause();
/*    */     } 
/*    */   }
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


/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\item\InstaHealth.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */