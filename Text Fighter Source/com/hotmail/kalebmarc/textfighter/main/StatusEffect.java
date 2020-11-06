/*    */ package com.hotmail.kalebmarc.textfighter.main;
/*    */ 
/*    */ public class StatusEffect
/*    */ {
/*    */   public enum type
/*    */   {
/*  7 */     HEALTH, STRENGTH, STANIMA, ACCURACY, LUCK;
/*    */ 
/*    */     
/*    */     public String toString() {
/* 11 */       String effectString = super.toString();
/* 12 */       return effectString.substring(0, 1) + effectString.substring(1).toLowerCase();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\main\StatusEffect.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */