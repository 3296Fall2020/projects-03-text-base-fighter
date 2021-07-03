/*    */ package com.hotmail.kalebmarc.textfighter.main;
/*    */ 
/*    */ import com.hotmail.kalebmarc.textfighter.item.FirstAid;
/*    */ import com.hotmail.kalebmarc.textfighter.item.InstaHealth;
/*    */ import com.hotmail.kalebmarc.textfighter.item.Power;
/*    */ import com.hotmail.kalebmarc.textfighter.player.Coins;
/*    */ import com.hotmail.kalebmarc.textfighter.player.Settings;
/*    */ import com.hotmail.kalebmarc.textfighter.player.Xp;
/*    */ 
/*    */ 
/*    */ class Debug
/*    */ {
/*    */   private static boolean enabled = false;
/*    */   
/*    */   public static void enable() {
/* 16 */     Ui.println("Enabling debug menu..");
/* 17 */     enabled = true;
/*    */   }
/*    */   public static boolean enabled() {
/* 20 */     return enabled;
/*    */   }
/*    */ 
/*    */   
/*    */   public static void menu() {
/* 25 */     if (!enabled()) {
/*    */       return;
/*    */     }
/*    */     while (true) {
/*    */       int i;
/* 30 */       Action.cls();
/* 31 */       Ui.println("==================");
/* 32 */       Ui.println("=== DEBUG MENU ===");
/* 33 */       Ui.println();
/* 34 */       Ui.println("1) Coins");
/* 35 */       Ui.println("2) Xp");
/* 36 */       Ui.println("3) Weapon");
/* 37 */       Ui.println("4) First-Aid");
/* 38 */       Ui.println("5) Insta-health");
/* 39 */       Ui.println("6) Encounter new");
/* 40 */       Ui.println("7) God Mode");
/* 41 */       Ui.println("8)");
/* 42 */       Ui.println("9) Go back");
/* 43 */       switch (Action.getValidInt()) {
/*    */         case 1:
/* 45 */           Action.cls();
/* 46 */           Ui.println("How much?");
/* 47 */           Coins.set(Action.getValidInt(), false);
/*    */         
/*    */         case 2:
/* 50 */           Action.cls();
/* 51 */           Ui.println("How much?");
/* 52 */           Xp.set(Action.getValidInt(), false);
/*    */         
/*    */         case 3:
/* 55 */           for (i = 0; i < Weapon.arrayWeapon.size(); i++) {
/* 56 */             ((Weapon)Weapon.arrayWeapon.get(i)).owns = true;
/*    */           }
/* 58 */           Power.set(100, true);
/* 59 */           for (i = 0; i <= Weapon.arrayWeapon.size(); i++) {
/* 60 */             ((Weapon)Weapon.arrayWeapon.get(i)).setAmmo(10000, false);
/*    */           }
/* 62 */           Ui.println("You now have all weapons");
/* 63 */           Action.pause();
/*    */         
/*    */         case 4:
/* 66 */           Action.cls();
/* 67 */           Ui.println("How much?");
/* 68 */           FirstAid.set(Action.getValidInt(), false);
/*    */         
/*    */         case 5:
/* 71 */           Action.cls();
/* 72 */           Ui.println("How much?");
/* 73 */           InstaHealth.set(Action.getValidInt(), false);
/*    */         
/*    */         case 6:
/* 76 */           Enemy.encounterNew();
/*    */         
/*    */         case 7:
/* 79 */           Settings.toggleGodMode();
/*    */         case 9:
/*    */           break;
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\main\Debug.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */