/*     */ package com.hotmail.kalebmarc.textfighter.player;
/*     */ 
/*     */ import com.hotmail.kalebmarc.textfighter.item.Armour;
/*     */ import com.hotmail.kalebmarc.textfighter.main.Action;
/*     */ import com.hotmail.kalebmarc.textfighter.main.Enemy;
import com.hotmail.kalebmarc.textfighter.main.Game;
/*     */ import com.hotmail.kalebmarc.textfighter.main.Handle;
/*     */ import com.hotmail.kalebmarc.textfighter.main.Ui;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Health
/*     */ {
/*     */   private static int health;
/*     */   private static int outOf;
/*     */   public static int timesDied;
/*     */   private static int UPGRADE_PRICE;
/*     */   
/*     */   public static String getStr() {
/*  23 */     return health + "/" + outOf;
/*     */   }
/*     */   public static int get() {
/*  26 */     return health;
/*     */   }
/*     */   public static int getOutOf() {
/*  29 */     return outOf;
/*     */   }
/*     */   public static void set(int h) {
/*  32 */     health = h;
/*  33 */     if (health > outOf) {
/*  34 */       Handle.error("Error Code - 002");
/*  35 */       health = outOf;
/*     */     } 
/*     */   }
/*     */   public static void set(int h, int hOutOf) {
/*  39 */     health = h;
/*  40 */     outOf = hOutOf;
/*  41 */     if (health > outOf) {
/*  42 */       Handle.error("Error Code - 002");
/*  43 */       health = outOf;
/*     */     } 
/*     */   }
/*     */   public static void setUpgradePrice(int price) {
/*  47 */     UPGRADE_PRICE = price;
/*     */   }
/*     */   public static void gain(int h) {
/*  50 */     health += h;
/*  51 */     if (health > outOf)
/*  52 */       health = outOf; 
/*     */   }
/*     */   
/*     */   public static void lose(int h) {
/*  56 */     health -= h;
/*  57 */     if (health <= 0)
/*  58 */       die(); 
/*     */   }
/*     */   
/*     */   private static void die() {
/*  62 */     Ui.popup("You have died! You lost half of your coins. ", "You've died!", 2);
/*  63 */     Coins.set(-(Coins.get() / 2), true);
/*  64 */     Stats.kills = 0;
/*  65 */     set(getOutOf());
/*     */ 
/*     */     
/*  68 */     Enemy.get().setHealth(Enemy.get().getHealthMax(), Enemy.get().getHealthMax());
/*  69 */     timesDied++;
/*     */   }
/*     */   
/*     */   public static void takeDamage(int damage) {
/*  73 */     if (Settings.getGodMode()) {
/*  74 */       damage = 0;
/*     */     }
/*     */     if (Armour.getEquipped() != null){
                double resist = Armour.getEquipped().getDamResist() / 100.0D;
/*  78 */       damage = (int)(damage - damage * resist);
              }
/*  77 */     
/*     */     
/*  80 */     Action.cls();
              Ui.battle_pop();
/*  81 */     Ui.println("----------------------------------------------------");
/*  82 */     Ui.println("You have been hit by a " + Enemy.get().getName() + "!");
/*  83 */     Ui.println("You lost " + damage + " health.");
/*  84 */     Ui.println("----------------------------------------------------");
/*  85 */     Ui.println("Your health: " + (health - damage));
              lose(damage);
              Ui.enemy_health_bar(Health.get(), Health.getOutOf());
/*  86 */     Ui.println("Enemy health: " + Enemy.get().getHeathStr());
              Ui.enemy_health_bar(Enemy.get().getHealth(), Enemy.get().getHealthMax());
/*  87 */     Ui.println("----------------------------------------------------");
/*  88 */     Action.pause();
/*  89 */     
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static int getLevel() {
/*  95 */     switch (getOutOf()) {
/*     */       case 100:
/*  97 */         return 0;
/*     */       case 110:
/*  99 */         return 1;
/*     */       case 120:
/* 101 */         return 2;
/*     */       case 130:
/* 103 */         return 3;
/*     */       case 140:
/* 105 */         return 4;
/*     */       case 150:
/* 107 */         return 5;
/*     */       case 160:
/* 109 */         return 6;
/*     */       case 170:
/* 111 */         return 7;
/*     */       case 180:
/* 113 */         return 8;
/*     */       case 190:
/* 115 */         return 9;
/*     */       case 200:
/* 117 */         return 10;
/*     */     } 
/* 119 */     Handle.error("Error Code - 003");
/* 120 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void upgrade() {
/*     */     while (true) {
/* 127 */       if (getOutOf() == 200) {
/* 128 */         Action.cls();
/* 129 */         Ui.println("You have upgraded your health to the maximum level");
/* 130 */         Action.pause();
/*     */         
/*     */         return;
/*     */       } 
/*     */       
/* 135 */       int health = getOutOf() + 10;
/*     */ 
/*     */       
/* 138 */       if (health > 200) {
/* 139 */         health = 200;
/*     */       }
/*     */       
/* 142 */       Action.cls();
/* 143 */       Ui.println("-----------------------------------------------------------");
/* 144 */       Ui.println("                           Upgrade Health                     ");
/* 145 */       Ui.println("You can increase your max health up to 200. ");
/* 146 */       Ui.println("You'll be able to upgrade 10HP at a time, and");
/* 147 */       Ui.println("each upgrade will cost " + UPGRADE_PRICE + " coins.");
/* 148 */       Ui.println();
/* 149 */       Ui.println("Current Health: " + getStr());
/* 150 */       Ui.println();
/* 151 */       Ui.println("1) Upgrade to " + health + " health.");
/* 152 */       Ui.println("2) Go back");
/* 153 */       Ui.println("-----------------------------------------------------------");
/*     */       
/* 155 */       if (Action.getValidInt() == 1) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 165 */         int level = getLevel() + 1;
/*     */         
/* 167 */         if (Xp.getLevel() >= level && Coins.get() >= UPGRADE_PRICE) {
/*     */ 
/*     */           
/* 170 */           if (getLevel() == 10) {
/* 171 */             Action.cls();
/* 172 */             Ui.println("You already have max health!");
/* 173 */             Action.pause();
/*     */           } 
/*     */ 
/*     */           
/* 177 */           set(health, health);
/* 178 */           Coins.set(-UPGRADE_PRICE, true);
/*     */           
/* 180 */           Action.cls();
/* 181 */           Ui.println("You upgraded your health.");
/* 182 */           Action.pause();
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           continue;
/*     */         } 
/*     */ 
/*     */ 
/*     */         
/* 192 */         Action.cls();
/* 193 */         Ui.println("Cannot upgrade, make sure you are at least");
/* 194 */         Ui.println("level " + level + ", and you have at least " + UPGRADE_PRICE + " coins.");
/* 195 */         Ui.println();
/* 196 */         Ui.println("Level: " + Xp.getLevel());
/* 197 */         Ui.println("Coins: " + Coins.get());
/* 198 */         Action.pause();
/*     */         continue;
/*     */       }
                return;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\player\Health.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */