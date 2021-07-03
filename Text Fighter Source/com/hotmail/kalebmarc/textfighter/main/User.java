/*    */ package com.hotmail.kalebmarc.textfighter.main;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class User
/*    */ {
/*  8 */   private static String playerName = "Player";
/*    */   
/*    */   public static String name() {
/* 11 */     return playerName;
/*    */   }
/*    */   public static void setName(String name) {
/* 14 */     playerName = name;
/*    */   }
/*    */   
/*    */   public static void promptNameSelection() {
/* 18 */     Action.cls();
/* 19 */     Ui.println("Please enter your username.");
/* 20 */     String name = Action.getValidString();
/*    */ 
/*    */     
/* 23 */     name = name.trim();
/* 24 */     if (name.equals("")) {
/* 25 */       Ui.println("Name cannot be blank. Using default name.");
/* 26 */       name = "Player";
/*    */     } 
/*    */     
/* 29 */     playerName = name;
/*    */   }
/*    */ }


/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\main\User.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */