/*    */ package com.hotmail.kalebmarc.textfighter.main;
/*    */ 
/*    */ class Random
/*    */ {
/*    */   public static int RInt(int max) {
/*  6 */     java.util.Random ran = new java.util.Random();
/*    */     
/*  8 */     return ran.nextInt(max) + 1;
/*    */   }
/*    */   public static int RInt(int min, int max) {
/* 11 */     java.util.Random ran = new java.util.Random();
/*    */     
/* 13 */     return ran.nextInt(max - min + 1) + min;
/*    */   }
/*    */ }


/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\main\Random.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */