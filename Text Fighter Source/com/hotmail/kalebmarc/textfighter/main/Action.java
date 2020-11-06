/*    */ package com.hotmail.kalebmarc.textfighter.main;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Action {
/*  6 */   private static Scanner in = new Scanner(System.in);
/*    */ 
/*    */ 
/*    */   
/*    */   public static int getValidInt() {
/* 11 */     while (!in.hasNextInt()) {
/* 12 */       in.nextLine();
/*    */     }
/* 14 */     return in.nextInt();
/*    */   }
/*    */ 
/*    */   
/*    */   public static String getValidString() {
/* 19 */     in.reset();
/* 20 */     return in.next();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void pause() {
/*    */     try {
/* 30 */       Scanner pauseScan = new Scanner(System.in);
/* 31 */       String temp = pauseScan.nextLine();
/* 32 */       Ui.println(temp);
/*    */     }
/* 34 */     catch (Exception exception) {}
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static void displayAmmo() {
/* 40 */     if (!(Weapon.get()).melee) {
/* 41 */       Ui.println("     Ammo: " + Weapon.get().getAmmo());
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void cls() {
/* 49 */     for (int i = 1; i < 50; i++)
/* 50 */       Ui.println("\n"); 
/*    */   }
/*    */ }


/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\main\Action.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */