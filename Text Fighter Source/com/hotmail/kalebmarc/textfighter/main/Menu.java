/*    */ package com.hotmail.kalebmarc.textfighter.main;
/*    */ 
/*    */ 
/*    */ 
/*    */ class Menu
/*    */ {
/*    */   public static void load() {
/*    */     while (true) {
/*  9 */       Action.cls();
/*    */       
/* 11 */       Ui.println("_____________________________________________");
/* 12 */       Ui.println("|          WELCOME TO TEXT FIGHTER          |");
/* 13 */       Ui.println("|        A Text-Based Fighting Game         |");
/* 14 */       Ui.println("|*******************************************|");
/* 15 */       Ui.println("|                                           |");
/* 16 */       Ui.println("|   To get started, Type in a number below  |");
/* 17 */       Ui.println("|             and press enter.              |");
/* 18 */       Ui.println("|                                           |");
/* 19 */       Ui.println("| 1) Start Game                             |");
/* 20 */       Ui.println("| 2) About Game                             |");
/* 21 */       Ui.println("| 3) Exit                                   |");
/* 22 */       Ui.println("|             www.TextFighter.tk            |");
/* 23 */       Ui.println("|___________________________________________|");
/*    */       
/* 25 */       switch (Action.getValidInt()) {
/*    */         case 1:
/* 27 */           Action.cls();
/* 28 */           Ui.guiEnabled = false;
/* 29 */           Game.start();
/*    */ 
/*    */           
/* 32 */           SaveAndLoad.save();
/*    */           return;
/*    */         case 2:
/* 35 */           About.view(false);
/*    */         case 3:
/*    */           return;
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\main\Menu.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */