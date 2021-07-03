/*    */ package com.hotmail.kalebmarc.textfighter.main;
/*    */ 
/*    */ 
/*    */ class Start
/*    */ {
/*    */   public static void main(String[] args) {
/*  7 */     if (args.length != 0 && args[0].equalsIgnoreCase("nogui")) Ui.guiEnabled = false; 
/*  8 */     Ui.println("Loading..");
/*    */ 
/*    */     
/* 11 */     if (Version.get().contains("DEV")) {
/* 12 */       Debug.enable();
/*    */     }
/*    */ 
/*    */     
/* 16 */     Splash.screen();
/*    */ 
/*    */     
/* 19 */     Menu.load();
/*    */ 
/*    */     
/* 22 */     Action.cls();
/*    */   }
/*    */ }


/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\main\Start.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */