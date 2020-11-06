/*    */ package com.hotmail.kalebmarc.textfighter.item;
/*    */ 
/*    */ import com.hotmail.kalebmarc.textfighter.main.Action;
/*    */ import com.hotmail.kalebmarc.textfighter.main.Ui;
/*    */ import com.hotmail.kalebmarc.textfighter.main.Weapon;
/*    */ import com.hotmail.kalebmarc.textfighter.player.Coins;
/*    */ import com.hotmail.kalebmarc.textfighter.player.Potion;
/*    */ 
/*    */ 
/*    */ public class Chest
/*    */ {
/*    */   public static void view() {
/* 13 */     Action.cls();
/* 14 */     Ui.println("------------------------------");
/* 15 */     Ui.println("          Item Chest          ");
/* 16 */     Ui.println();
/* 17 */     Ui.println("First-Aid kits: " + FirstAid.get());
/* 18 */     Ui.println("Insta-Healths: " + InstaHealth.get());
/* 19 */     Ui.println("Potions: " + (Potion.get("survival") + Potion.get("recovery")));
/* 20 */     Ui.println("Coins: " + Coins.get());
/* 21 */     Ui.println("POWERS: " + Power.get()); int i;
/* 22 */     for (i = 0; i < Weapon.arrayWeapon.size(); i++) {
/* 23 */       Ui.print(((Weapon)Weapon.arrayWeapon.get(i)).getName() + ": " + ((Weapon)Weapon.arrayWeapon.get(i)).owns());
/* 24 */       Ui.println(" (Ammo: " + ((Weapon)Weapon.arrayWeapon.get(i)).getAmmo() + ")");
/*    */     } 
/* 26 */     for (i = 1; i < Armour.getArmours().size(); i++) {
/* 27 */       Ui.println(((Armour)Armour.getArmours().get(i)).toString() + ": " + ((Armour)Armour.getArmours().get(i)).isOwns());
/*    */     }
/* 29 */     Ui.println();
/* 30 */     Ui.println("------------------------------");
/* 31 */     Action.pause();
/*    */   }
/*    */ }


/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\item\Chest.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */