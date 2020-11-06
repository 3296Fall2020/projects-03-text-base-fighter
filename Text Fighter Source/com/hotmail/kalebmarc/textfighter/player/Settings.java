/*     */ package com.hotmail.kalebmarc.textfighter.player;
/*     */ 
/*     */ import com.hotmail.kalebmarc.textfighter.item.FirstAid;
/*     */ import com.hotmail.kalebmarc.textfighter.item.InstaHealth;
/*     */ import com.hotmail.kalebmarc.textfighter.item.Power;
/*     */ import com.hotmail.kalebmarc.textfighter.main.Action;
/*     */ import com.hotmail.kalebmarc.textfighter.main.Bank;
/*     */ import com.hotmail.kalebmarc.textfighter.main.Cheats;
/*     */ import com.hotmail.kalebmarc.textfighter.main.Enemy;
/*     */ import com.hotmail.kalebmarc.textfighter.main.Game;
/*     */ import com.hotmail.kalebmarc.textfighter.main.Ui;
/*     */ import com.hotmail.kalebmarc.textfighter.main.Weapon;
/*     */ 
/*     */ public class Settings {
/*     */   private static String difficulty;
/*     */   
/*     */   public static void menu() {
/*     */     while (true) {
/*  19 */       Action.cls();
/*  20 */       Ui.println("-------------------------------------------------");
/*  21 */       Ui.println("                  Settings                  ");
/*  22 */       Ui.println();
/*  23 */       Ui.println("1) Switch Difficulties (Currently on " + difficulty + ".)");
/*  24 */       Ui.println("2) Lock Difficulty on " + difficulty);
/*  25 */       Ui.println("3) Lock cheats off (Wont be able to use cheats)");
/*  26 */       Ui.println("4) Toggle popup windows");
/*  27 */       Ui.println("5) Back");
/*  28 */       Ui.println("-------------------------------------------------");
/*     */       
/*  30 */       switch (Action.getValidInt()) {
/*     */         case 1:
/*  32 */           switchDif();
/*     */         
/*     */         case 2:
/*  35 */           lockDif();
/*     */         
/*     */         case 3:
/*  38 */           lockCheats();
/*     */         
/*     */         case 4:
/*  41 */           Action.cls();
/*  42 */           if (Ui.guiEnabled) {
/*  43 */             Ui.guiEnabled = false;
/*  44 */             Ui.println("Popup windows disabled");
/*     */           } else {
/*  46 */             Ui.guiEnabled = true;
/*  47 */             Ui.println("Popup windows enabled");
/*     */           } 
/*  49 */           Action.pause();
/*     */         case 5:
/*     */           break;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   public static boolean difLocked = false; private static boolean godMode = false;
/*     */   public static void setDif(String dif, boolean firstInit, boolean switchDif) {
/*  57 */     difficulty = dif;
/*  58 */     setConstants(dif, firstInit, switchDif);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static void switchDif() {
/*  64 */     if (difLocked) {
/*  65 */       Action.cls();
/*  66 */       Ui.println("Difficulty is locked. You cannot switch difficulties.");
/*  67 */       Action.pause();
/*     */       
/*     */       return;
/*     */     } 
/*  71 */     if (difficulty.equals("Easy")) {
/*  72 */       setDif("Hard", false, true);
/*     */     } else {
/*  74 */       setDif("Easy", false, true);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static void lockDif() {
/*  81 */     if (difLocked) {
/*  82 */       Action.cls();
/*  83 */       Ui.println("Difficulty is already locked.");
/*  84 */       Action.pause();
/*     */       
/*     */       return;
/*     */     } 
/*     */     while (true) {
/*  89 */       Action.cls();
/*  90 */       Ui.println("Are you sure you want to lock the difficulty to " + difficulty + " ?\nYou wont be able to change difficulties in the future!");
/*     */       
/*  92 */       Ui.println("1) Continue");
/*  93 */       Ui.println("2) Cancel");
/*  94 */       switch (Action.getValidInt()) {
/*     */         case 1:
/*  96 */           Action.cls();
/*  97 */           Ui.println("Difficulty has been locked to " + difficulty);
/*  98 */           difLocked = true;
/*  99 */           Action.pause();
/*     */           return;
/*     */         case 2:
/*     */           break;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static void lockCheats() {
/* 110 */     if (Cheats.locked()) {
/* 111 */       Action.cls();
/* 112 */       Ui.println("Cheats are already locked.");
/* 113 */       Action.pause();
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */ 
/*     */     
/* 120 */     if (Cheats.enabled()) {
/* 121 */       Action.cls();
/* 122 */       Ui.println("Cheats are already enabled. You cannot turn them off.");
/* 123 */       Action.pause();
/*     */       
/*     */       return;
/*     */     } 
/*     */     while (true) {
/* 128 */       Action.cls();
/* 129 */       Ui.println("Are you sure you want to lock cheats off?");
/* 130 */       Ui.println("You wont be able to use cheats in the future!");
/* 131 */       Ui.println("1) Continue");
/* 132 */       Ui.println("2) Cancel");
/* 133 */       switch (Action.getValidInt()) {
/*     */         case 1:
/* 135 */           Action.cls();
/* 136 */           Ui.println("Cheats have been locked off");
/* 137 */           Cheats.lock();
/* 138 */           Action.pause();
/*     */           return;
/*     */         case 2:
/*     */           break;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   public static String getDif() {
/* 146 */     return difficulty;
/*     */   }
/*     */   private static void setConstants(String dif, boolean firstInit, boolean changeDif) {
/* 149 */     if (dif.equals("Easy")) {
/*     */ 
/*     */       
/* 152 */       Game.darkElf = new Enemy("Dark Elf", 45, 10, 15, 10, 15, 15, firstInit, changeDif);
/* 153 */       Game.ninja = new Enemy("Ninja", 75, 5, 15, 5, 15, 15, firstInit, changeDif);
/* 154 */       Game.giantSpider = new Enemy("Giant Spider", 35, 5, 10, 5, 10, 10, firstInit, changeDif);
/* 155 */       Game.zombie = new Enemy("Zombie", 20, 5, 15, 5, 15, 15, firstInit, changeDif);
/* 156 */       Game.goblin = new Enemy("Goblin", 60, 10, 20, 10, 20, 20, firstInit, changeDif);
/* 157 */       Game.ghost = new Enemy("Ghost", 85, 15, 25, 15, 25, 25, firstInit, changeDif);
/* 158 */       Game.barbarian = new Enemy("Barbarian", 50, 5, 15, 5, 15, 15, firstInit, changeDif);
/* 159 */       Game.giantAnt = new Enemy("Giant Ant", 30, 5, 10, 5, 10, 10, firstInit, changeDif);
/* 160 */       Game.evilUnicorn = new Enemy("Evil Unicorn", 35, 30, 40, 5, 15, 20, firstInit, changeDif);
/* 161 */       Game.ogre = new Enemy("Ogre", 90, 20, 50, 10, 30, 50, firstInit, changeDif);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 166 */       Game.nothing = new Weapon("Nothing", true, false, 0, 0, 5, 10, firstInit, changeDif);
/* 167 */       Game.baseballBat = new Weapon("Baseball Bat", false, true, 120, 1, 10, 15, firstInit, changeDif);
/* 168 */       Game.knife = new Weapon("Knife", false, true, 125, 2, 10, 20, firstInit, changeDif);
/* 169 */       Game.pipe = new Weapon("Pipe", false, false, 0, 0, 5, 20, firstInit, changeDif);
/* 170 */       Game.pistol = new Weapon("Pistol", 1, 18, true, 250, 1, 4, 15.0D, firstInit, changeDif);
/* 171 */       Game.smg = new Weapon("Smg", 10, 75, true, 700, 1, 10, 75.0D, firstInit, changeDif);
/* 172 */       Game.shotgun = new Weapon("Shotgun", 1, 12, true, 375, 2, 9, 60.0D, firstInit, changeDif);
/* 173 */       Game.rifle = new Weapon("Rifle", 1, 18, true, 275, 1, 5, 10.0D, firstInit, changeDif);
/* 174 */       Game.sniper = new Weapon("Sniper", 1, 10, true, 700, 2, 7, 0.0D, firstInit, changeDif);
/*     */ 
/*     */       
/* 177 */       Power.price = 25;
/* 178 */       Weapon.BULLET_DAMAGE = 10;
/* 179 */       FirstAid.price = 5;
/* 180 */       Potion.spPrice = 10;
/* 181 */       Potion.rpPrice = 20;
/* 182 */       InstaHealth.price = 30;
/* 183 */       Bank.setInterest(0.05D);
/* 184 */       Health.setUpgradePrice(100);
/*     */ 
/*     */       
/* 187 */       FirstAid.level = 1;
/* 188 */       Potion.spLevel = 2;
/* 189 */       Potion.rpLevel = 2;
/* 190 */       InstaHealth.level = 3;
/* 191 */       Power.level = 4;
/*     */     
/*     */     }
/*     */     else {
/*     */       
/* 196 */       Game.darkElf = new Enemy("Dark Elf", 55, 15, 20, 15, 20, 15, firstInit, changeDif);
/* 197 */       Game.ninja = new Enemy("Ninja", 85, 10, 20, 10, 20, 15, firstInit, changeDif);
/* 198 */       Game.giantSpider = new Enemy("Giant Spider", 45, 10, 15, 10, 15, 10, firstInit, changeDif);
/* 199 */       Game.zombie = new Enemy("Zombie", 30, 10, 20, 10, 20, 15, firstInit, changeDif);
/* 200 */       Game.goblin = new Enemy("Goblin", 70, 15, 25, 15, 25, 20, firstInit, changeDif);
/* 201 */       Game.ghost = new Enemy("Ghost", 95, 20, 30, 20, 30, 25, firstInit, changeDif);
/* 202 */       Game.barbarian = new Enemy("Barbarian", 50, 5, 15, 5, 15, 15, firstInit, changeDif);
/* 203 */       Game.giantAnt = new Enemy("Giant Ant", 30, 5, 10, 5, 10, 10, firstInit, changeDif);
/* 204 */       Game.evilUnicorn = new Enemy("Evil Unicorn", 35, 20, 40, 5, 15, 20, firstInit, changeDif);
/* 205 */       Game.ogre = new Enemy("Ogre", 100, 20, 50, 10, 30, 50, firstInit, changeDif);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 210 */       Game.nothing = new Weapon("Nothing", true, false, 0, 0, 5, 10, firstInit, changeDif);
/* 211 */       Game.baseballBat = new Weapon("Baseball Bat", false, true, 170, 1, 10, 15, firstInit, changeDif);
/* 212 */       Game.knife = new Weapon("Knife", false, true, 175, 2, 10, 20, firstInit, changeDif);
/* 213 */       Game.pipe = new Weapon("Pipe", false, false, 0, 0, 5, 20, firstInit, changeDif);
/* 214 */       Game.pistol = new Weapon("Pistol", 1, 18, true, 275, 1, 4, 15.0D, firstInit, changeDif);
/* 215 */       Game.smg = new Weapon("Smg", 10, 75, true, 800, 1, 10, 75.0D, firstInit, changeDif);
/* 216 */       Game.shotgun = new Weapon("Shotgun", 1, 12, true, 415, 2, 9, 60.0D, firstInit, changeDif);
/* 217 */       Game.rifle = new Weapon("Rifle", 1, 18, true, 300, 1, 5, 10.0D, firstInit, changeDif);
/* 218 */       Game.sniper = new Weapon("Sniper", 1, 10, true, 750, 2, 7, 0.0D, firstInit, changeDif);
/*     */ 
/*     */       
/* 221 */       Power.price = 75;
/* 222 */       Weapon.BULLET_DAMAGE = 5;
/* 223 */       FirstAid.price = 15;
/* 224 */       Potion.spPrice = 25;
/* 225 */       Potion.rpPrice = 35;
/* 226 */       InstaHealth.price = 45;
/* 227 */       Bank.setInterest(0.1D);
/* 228 */       Health.setUpgradePrice(100);
/*     */ 
/*     */       
/* 231 */       FirstAid.level = 1;
/* 232 */       Potion.spLevel = 2;
/* 233 */       Potion.rpLevel = 2;
/* 234 */       InstaHealth.level = 3;
/* 235 */       Power.level = 4;
/*     */     } 
/*     */     
/* 238 */     if (firstInit) newGameSetup(); 
/*     */   }
/*     */   
/*     */   private static void newGameSetup() {
/* 242 */     Coins.set(50, false);
/* 243 */     FirstAid.set(3, false);
/* 244 */     Potion.set("survival", 2, false);
/* 245 */     Potion.set("recovery", 2, false);
/* 246 */     Xp.setAll(0, 500, 1);
/* 247 */     Game.none.setOwns(true);
/* 248 */     Game.none.equipSilent();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean getGodMode() {
/* 254 */     return godMode;
/*     */   }
/*     */ 
/*     */   
/*     */   public static String godModeMsg() {
/* 259 */     if (godMode) {
/* 260 */       return "Godmode is enabled\n";
/*     */     }
/* 262 */     return "";
/*     */   }
/*     */   public static void toggleGodMode() {
/* 265 */     Action.cls();
/* 266 */     if (godMode) {
/* 267 */       godMode = false;
/* 268 */       Ui.println("Godmode has been disabled");
/*     */     } else {
/* 270 */       godMode = true;
/* 271 */       Ui.println("Godmode has been enabled");
/*     */     } 
/* 273 */     Action.pause();
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\player\Settings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */