/*     */ package com.hotmail.kalebmarc.textfighter.player;
/*     */ 
/*     */ import com.hotmail.kalebmarc.textfighter.main.Action;
/*     */ import com.hotmail.kalebmarc.textfighter.main.Ui;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Potion
/*     */ {
/*     */   private static int survivalPotion;
/*     */   private static int recoveryPotion;
/*  14 */   public static int spUsed = 0;
/*     */   
/*     */   public static int spLevel;
/*     */   public static int spPrice;
/*  18 */   public static int rpUsed = 0;
/*     */   public static int rpLevel;
/*     */   public static int rpPrice;
/*     */   
/*     */   public static int get(String kind) {
/*  23 */     switch (kind.toLowerCase()) {
/*     */       case "survival":
/*  25 */         return survivalPotion;
/*     */       case "recovery":
/*  27 */         return recoveryPotion;
/*     */     } 
/*  29 */     return 0;
/*     */   }
/*     */   
/*     */   public static void set(String kind, int amount, boolean add) {
/*  33 */     switch (kind.toLowerCase()) {
/*     */       case "survival":
/*  35 */         if (!add) {
/*  36 */           survivalPotion = amount;
/*     */         } else {
/*  38 */           survivalPotion += amount;
/*  39 */           if (survivalPotion < 0) survivalPotion = 0; 
/*     */         } 
/*     */       case "recovery":
/*  42 */         if (!add) {
/*  43 */           recoveryPotion = amount; break;
/*     */         } 
/*  45 */         recoveryPotion += amount;
/*  46 */         if (recoveryPotion < 0) recoveryPotion = 0;
/*     */         
/*     */         break;
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void use(String k) {
/*  53 */     String kind = k.trim().substring(0, 1).toUpperCase() + k.substring(1).toLowerCase();
/*  54 */     Action.cls();
/*     */     
/*  56 */     if (get(kind) <= 0) {
/*     */       
/*  58 */       Ui.println("----------------------------------------------------");
/*  59 */       Ui.println("You have no " + kind + " Potions left!");
/*  60 */       Ui.println("Go to the shop to buy some more.");
/*  61 */       Ui.println("----------------------------------------------------");
/*  62 */       Action.pause();
/*     */     }
/*  64 */     else if (Health.get() == 100) {
/*     */       
/*  66 */       Ui.println("----------------------------------------------------");
/*  67 */       Ui.println("You already have full health!");
/*  68 */       Ui.println("You don't need to use a " + kind + " Potion!");
/*  69 */       Ui.println("----------------------------------------------------");
/*  70 */       Ui.println("Your health: " + Health.getStr());
/*  71 */       Ui.println(kind + " Potions: " + get(kind));
/*  72 */       Ui.println("----------------------------------------------------");
/*  73 */       Action.pause();
/*     */     }
/*     */     else {
/*     */       
/*  77 */       set(kind, -1, true);
/*  78 */       int heal = (int)Math.round(healBy(kind));
/*  79 */       Health.gain(heal);
/*  80 */       used(kind);
/*     */       
/*  82 */       Ui.println("----------------------------------------------------");
/*  83 */       Ui.println("You have used a " + kind + " Potion.");
/*  84 */       Ui.println("You've gained " + heal + " health.");
/*  85 */       Ui.println("----------------------------------------------------");
/*  86 */       Ui.println("Your health: " + Health.getStr());
/*  87 */       Ui.println(kind + " Potions: " + get(kind));
/*  88 */       Ui.println("----------------------------------------------------");
/*  89 */       Action.pause();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static double healBy(String kind) {
/*  95 */     switch (kind.toLowerCase()) {
/*     */       case "survival":
/*  97 */         return Health.getOutOf() * 0.25D;
/*     */       case "recovery":
/*  99 */         return Health.getOutOf() * 0.75D;
/*     */     } 
/* 101 */     return 0.0D;
/*     */   }
/*     */   
/*     */   public static void used(String kind) {
/* 105 */     switch (kind.toLowerCase()) {
/*     */       case "survival":
/* 107 */         spUsed++;
/*     */       case "recovery":
/* 109 */         rpUsed++;
/*     */         break;
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void buy(String kind) {
/* 115 */     int level = getLevel(kind);
/* 116 */     int price = getPrice(kind);
/*     */     
/* 118 */     if (Xp.getLevel() < level) {
/* 119 */       Ui.println("You have to be at least level " + level + " to buy this!");
/* 120 */       Action.pause();
/* 121 */     } else if (price <= Coins.get()) {
/* 122 */       Coins.set(-price, true);
/* 123 */       Stats.coinsSpentOnHealth += price;
/* 124 */       set(kind, 1, true);
/* 125 */       Ui.println("Thank you for your purchase. Come again soon! ");
/* 126 */       Action.pause();
/*     */     } else {
/* 128 */       Ui.println("You do not have enough coins.");
/* 129 */       Action.pause();
/*     */     } 
/*     */   }
/*     */   public static int getLevel(String kind) {
/* 133 */     switch (kind.toLowerCase()) {
/*     */       case "survival":
/* 135 */         return spLevel;
/*     */       case "recovery":
/* 137 */         return rpLevel;
/*     */     } 
/* 139 */     return 0;
/*     */   }
/*     */   
/*     */   public static int getPrice(String kind) {
/* 143 */     switch (kind.toLowerCase()) {
/*     */       case "survival":
/* 145 */         return spPrice;
/*     */       case "recovery":
/* 147 */         return rpPrice;
/*     */     } 
/* 149 */     return 0;
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\player\Potion.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */