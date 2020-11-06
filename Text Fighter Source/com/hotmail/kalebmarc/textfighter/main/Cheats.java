/*     */ package com.hotmail.kalebmarc.textfighter.main;
/*     */ import com.hotmail.kalebmarc.textfighter.item.FirstAid;
/*     */ import com.hotmail.kalebmarc.textfighter.item.InstaHealth;
/*     */ import com.hotmail.kalebmarc.textfighter.item.Power;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Coins;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Health;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Settings;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Stats;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Xp;
/*     */ import java.util.Scanner;
/*     */ 
/*     */ public class Cheats {
/*  13 */   private static Scanner cheat = new Scanner(System.in);
/*     */   
/*     */   private static boolean enabled = false;
/*     */   
/*     */   private static boolean locked = false;
/*     */   
/*     */   public static void cheatGateway() {
/*  20 */     if (locked()) {
/*  21 */       Action.cls();
/*  22 */       Ui.println("Cheats are locked off- You cannot use cheats!");
/*  23 */       Action.pause();
/*     */       
/*     */       return;
/*     */     } 
/*  27 */     if (!enabled()) {
/*  28 */       int confirm = Ui.confirmPopup("If you enable cheats, achievements and xp will be disabled. Are you sure you want to continue?", "Warning");
/*  29 */       if (confirm == 0) {
/*  30 */         Xp.setAll(0, 0, 10);
/*  31 */         enable();
/*     */       } 
/*     */     } 
/*  34 */     if (enabled()) cheatSelect(); 
/*     */   } private static void cheatSelect() {
/*     */     int i;
/*  37 */     Ui.println("*");
/*     */     
/*  39 */     switch (cheat.nextLine()) {
/*     */       case "moneylover":
/*  41 */         Coins.set(1000, false);
/*  42 */         Stats.timesCheated++;
/*     */         break;
/*     */       case "givemeitall":
/*  45 */         Coins.set(5000, false);
/*  46 */         FirstAid.set(5000, false);
/*  47 */         InstaHealth.set(5000, false);
/*  48 */         for (i = 0; i <= Weapon.arrayWeapon.size(); i++) {
/*  49 */           ((Weapon)Weapon.arrayWeapon.get(i)).setAmmo(5000, false);
/*     */         }
/*  51 */         Power.set(5000, false);
/*  52 */         for (i = 0; i < Weapon.arrayWeapon.size(); i++) {
/*  53 */           ((Weapon)Weapon.arrayWeapon.get(i)).owns = true;
/*     */         }
/*  55 */         Stats.timesCheated++;
/*     */         break;
/*     */       case "weaponstash":
/*  58 */         for (i = 0; i <= Weapon.arrayWeapon.size(); i++) {
/*  59 */           Weapon.get().setAmmo(5000, false);
/*     */         }
/*     */         
/*  62 */         Power.set(5000, false);
/*  63 */         for (i = 0; i <= Weapon.arrayWeapon.size(); i++) {
/*  64 */           ((Weapon)Weapon.arrayWeapon.get(i)).owns = true;
/*     */         }
/*  66 */         Stats.timesCheated++;
/*     */         break;
/*     */       case "nomorepain":
/*  69 */         FirstAid.set(1000, false);
/*  70 */         InstaHealth.set(500, false);
/*  71 */         Stats.timesCheated++;
/*     */         break;
/*     */       case "healme":
/*  74 */         Health.set(Health.getOutOf());
/*  75 */         Stats.timesCheated++;
/*     */         break;
/*     */       case "givemeachallange":
/*  78 */         Enemy.get().setHealth(1000, 1000);
/*  79 */         Stats.timesCheated++;
/*     */         break;
/*     */       case "lotsofkills":
/*  82 */         Stats.kills = 5000;
/*  83 */         Stats.timesCheated++;
/*     */         break;
/*     */       case "suicide":
/*  86 */         Health.set(0);
/*  87 */         Stats.timesCheated++;
/*     */         break;
/*     */       case "godmode":
/*  90 */         Settings.toggleGodMode();
/*  91 */         Stats.timesCheated++;
/*     */         break;
/*     */       case "loanshark":
/*  94 */         Loan.setCurrentLoan(0);
/*  95 */         Loan.setNetDue(0);
/*     */         break;
/*     */     } 
/*     */   }
/*     */   public static boolean enabled() {
/* 100 */     return enabled;
/*     */   }
/*     */   public static boolean locked() {
/* 103 */     return locked;
/*     */   }
/*     */   public static void enable() {
/* 106 */     enabled = true;
/*     */   }
/*     */   public static void lock() {
/* 109 */     locked = true;
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\main\Cheats.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */