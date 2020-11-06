/*    */ package com.hotmail.kalebmarc.textfighter.main;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class About
/*    */ {
/*    */   private static boolean viewed = false;
/*    */   
/*    */   public static void view(boolean achValid) {
/* 12 */     Ui.popup("Text-Fighter " + Version.getFull() + "\n\n" + Version.getDesc(), "About", 1);
/*    */ 
/*    */     
/* 15 */     Ui.popup("Text-Fighter " + Version.getFull() + " Change Log\n\n" + Version.getChange(), "Change Log", 1);
/*    */     
/* 17 */     if (achValid)
/* 18 */       viewed = true; 
/*    */   }
/*    */   
/*    */   public static boolean viewed() {
/* 22 */     return viewed;
/*    */   }
/*    */   public static void setViewed(boolean v) {
/* 25 */     viewed = v;
/*    */   }
/*    */   public static boolean isEven(int check) {
/* 28 */     return (check % 2 == 0);
/*    */   }
/*    */ }


/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\main\About.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */