/*    */ package com.hotmail.kalebmarc.textfighter.player;
/*    */ 
/*    */ import com.hotmail.kalebmarc.textfighter.main.Cheats;
/*    */ import com.hotmail.kalebmarc.textfighter.main.Handle;
/*    */ import com.hotmail.kalebmarc.textfighter.main.Ui;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Xp
/*    */ {
/*    */   private static int xp;
/*    */   private static int xpNeeded;
/*    */   private static int level;
/*    */   public static int total;
/*    */   
/*    */   private static void levelUp() {
/* 19 */     if (level == 9) {
/*    */       
/* 21 */       Ui.popup("You've reached level 10!\nYou have been rewarded 250 coins!", "Level Up!", 1);
/* 22 */       level = 10;
/* 23 */       Coins.set(250, true);
/*    */     }
/* 25 */     else if (level > 100) {
/* 26 */       Handle.error("Error code 006");
/* 27 */     } else if (level == 99) {
/* 28 */       level = 100;
/* 29 */       xp = 49000;
/*    */     } else {
/*    */       
/* 32 */       Ui.popup("You've leveled up! You are now level " + (level + 1) + "!\nYou have been rewarded 100 coins!", "Level Up!", 1);
/* 33 */       xp = 0;
/* 34 */       xpNeeded += 500;
/* 35 */       level++;
/* 36 */       Coins.set(100, true);
/*    */     } 
/*    */     
/* 39 */     Ach.check();
/*    */   }
/*    */ 
/*    */   
/*    */   public static void set(int amount, boolean add) {
/* 44 */     if (level == 100 || Cheats.enabled()) {
/*    */       return;
/*    */     }
/* 47 */     if (add) {
/* 48 */       xp += amount;
/* 49 */       total += amount;
/*    */     } else {
/* 51 */       xp = amount;
/*    */     } 
/* 53 */     if (xp >= xpNeeded && xpNeeded != 0) {
/* 54 */       int leftOverXp = xp - xpNeeded;
/* 55 */       levelUp();
/* 56 */       set(leftOverXp, true);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public static void setLevel(int lvl) {
/* 62 */     level = lvl;
/*    */   }
/*    */   
/*    */   public static void setOutOf(int outOf) {
/* 66 */     xpNeeded = outOf;
/*    */   }
/*    */   public static void setAll(int current, int outOf, int lvl) {
/* 69 */     xp = current;
/* 70 */     xpNeeded = outOf;
/* 71 */     level = lvl;
/*    */   }
/*    */   
/*    */   public static int get() {
/* 75 */     return xp;
/*    */   }
/*    */   
/*    */   public static int getOutOf() {
/* 79 */     return xpNeeded;
/*    */   }
/*    */   
/*    */   public static int getLevel() {
/* 83 */     return level;
/*    */   }
/*    */   
/*    */   public static String getFull() {
/* 87 */     return xp + "/" + xpNeeded + " xp";
/*    */   }
/*    */ }


/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\player\Xp.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */