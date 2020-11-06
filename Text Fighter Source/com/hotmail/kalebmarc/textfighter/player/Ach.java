/*     */ package com.hotmail.kalebmarc.textfighter.player;
/*     */ 
/*     */ import com.hotmail.kalebmarc.textfighter.item.Armour;
/*     */ import com.hotmail.kalebmarc.textfighter.item.Power;
/*     */ import com.hotmail.kalebmarc.textfighter.main.Action;
/*     */ import com.hotmail.kalebmarc.textfighter.main.Casino;
/*     */ import com.hotmail.kalebmarc.textfighter.main.Cheats;
/*     */ import com.hotmail.kalebmarc.textfighter.main.Enemy;
/*     */ import com.hotmail.kalebmarc.textfighter.main.Ui;
/*     */ import com.hotmail.kalebmarc.textfighter.main.Weapon;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Ach
/*     */ {
/*     */   public static boolean moneyMaker = false;
/*     */   public static boolean enemySlayer = false;
/*     */   public static boolean firstKill = false;
/*     */   public static boolean timeForAnUpgrade = false;
/*     */   public static boolean textFighterMaster = false;
/*     */   public static boolean YAYPOWER = false;
/*     */   public static boolean awwYouCareAboutMe = false;
/*     */   public static boolean slayer = false;
/*     */   public static boolean nobodysPerfect = false;
/*     */   public static boolean makingMoney = false;
/*     */   public static boolean gamblingAddiction = false;
/*     */   public static boolean level2Fighter = false;
/*     */   public static boolean level3Fighter = false;
/*     */   public static boolean level4Fighter = false;
/*     */   public static boolean level5Fighter = false;
/*     */   public static boolean level6Fighter = false;
/*     */   public static boolean level7Fighter = false;
/*     */   public static boolean level8Fighter = false;
/*     */   public static boolean level9Fighter = false;
/*     */   public static boolean level10Fighter = false;
/*     */   public static boolean honestPlayer = false;
/*     */   public static boolean learning = false;
/*     */   public static boolean boughtItem = false;
/*     */   public static boolean viewedAbout = false;
/*     */   public static boolean viewedArmour = false;
/*     */   public static boolean viewedHealth = false;
/*     */   public static boolean viewedXP = false;
/*     */   public static boolean viewedCheats = false;
/*     */   public static boolean viewedAchs = false;
/*  57 */   public static final ArrayList<Boolean> arrayKilled = new ArrayList<>();
/*  58 */   private static final ArrayList<Enemy> arrayEnemy = new ArrayList<>();
/*     */ 
/*     */   
/*     */   public static void setUpEnemyAch(String name, Enemy type) {
/*  62 */     arrayKilled.add(Boolean.valueOf(false));
/*  63 */     arrayEnemy.add(type);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void view() {
/*  69 */     Action.cls();
/*     */     
/*  71 */     boolean[] ach = new boolean[22];
/*  72 */     String[] strAch = new String[22];
/*  73 */     ach[0] = moneyMaker;
/*  74 */     strAch[0] = "Money Maker";
/*     */     
/*  76 */     ach[1] = enemySlayer;
/*  77 */     strAch[1] = "Enemy Slayer";
/*     */     
/*  79 */     ach[2] = firstKill;
/*  80 */     strAch[2] = "First Kill";
/*     */     
/*  82 */     ach[3] = timeForAnUpgrade;
/*  83 */     strAch[3] = "Time For An Upgrade";
/*     */     
/*  85 */     ach[4] = textFighterMaster;
/*  86 */     strAch[4] = "Text-Fighter Master";
/*     */     
/*  88 */     ach[5] = YAYPOWER;
/*  89 */     strAch[5] = "YAY POWER!";
/*     */     
/*  91 */     ach[6] = awwYouCareAboutMe;
/*  92 */     strAch[6] = "Aww, You Care About Me :')";
/*     */     
/*  94 */     ach[7] = slayer;
/*  95 */     strAch[7] = "Slayer";
/*     */     
/*  97 */     ach[8] = nobodysPerfect;
/*  98 */     strAch[8] = "Nobodys Perfect";
/*     */     
/* 100 */     ach[9] = makingMoney;
/* 101 */     strAch[9] = "Making Money";
/*     */     
/* 103 */     ach[10] = gamblingAddiction;
/* 104 */     strAch[10] = "Gambling Addiction";
/*     */     
/* 106 */     ach[11] = level2Fighter;
/* 107 */     strAch[11] = "Level 2 Fighter!";
/*     */     
/* 109 */     ach[12] = level3Fighter;
/* 110 */     strAch[12] = "Level 3 Fighter!";
/*     */     
/* 112 */     ach[13] = level4Fighter;
/* 113 */     strAch[13] = "Level 4 Fighter!";
/*     */     
/* 115 */     ach[14] = level5Fighter;
/* 116 */     strAch[14] = "Level 5 Fighter!";
/*     */     
/* 118 */     ach[15] = level6Fighter;
/* 119 */     strAch[15] = "Level 6 Fighter!";
/*     */     
/* 121 */     ach[16] = level7Fighter;
/* 122 */     strAch[16] = "Level 7 Fighter!";
/*     */     
/* 124 */     ach[17] = level8Fighter;
/* 125 */     strAch[17] = "Level 8 Fighter!";
/*     */     
/* 127 */     ach[18] = level9Fighter;
/* 128 */     strAch[18] = "Level 9 Fighter!";
/*     */     
/* 130 */     ach[19] = level10Fighter;
/* 131 */     strAch[19] = "Level 10 Fighter!";
/*     */     
/* 133 */     ach[20] = honestPlayer;
/* 134 */     strAch[20] = "Honest Player";
/*     */     
/* 136 */     ach[21] = learning;
/* 137 */     strAch[21] = "Learning";
/*     */     
/* 139 */     Ui.println("---------------------------------------");
/* 140 */     Ui.println("Achievements");
/* 141 */     Ui.println();
/* 142 */     Ui.println("Unlocked Achievements:");
/* 143 */     Ui.println(); int i;
/* 144 */     for (i = 0; i < ach.length; i++) {
/* 145 */       if (ach[i]) {
/* 146 */         Ui.println(strAch[i]);
/*     */       }
/*     */     } 
/*     */     
/* 150 */     for (i = 0; i < arrayEnemy.size(); i++) {
/* 151 */       if (((Boolean)arrayKilled.get(i)).booleanValue()) {
/* 152 */         Ui.println("Goodbye, " + ((Enemy)arrayEnemy.get(i)).getName() + "!");
/*     */       }
/*     */     } 
/* 155 */     Ui.println();
/* 156 */     Ui.println("Locked Achievements:");
/* 157 */     Ui.println();
/* 158 */     for (i = 0; i < ach.length; i++) {
/* 159 */       if (!ach[i]) {
/* 160 */         Ui.println(strAch[i]);
/*     */       }
/*     */     } 
/*     */     
/* 164 */     for (i = 0; i < arrayEnemy.size(); i++) {
/* 165 */       if (!((Boolean)arrayKilled.get(i)).booleanValue()) {
/* 166 */         Ui.println("Goodbye, " + ((Enemy)arrayEnemy.get(i)).getName() + "!");
/*     */       }
/*     */     } 
/* 169 */     Ui.println();
/* 170 */     Ui.println("---------------------------------------");
/*     */     
/* 172 */     Action.pause();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void check() {
/* 178 */     if (!Cheats.enabled()) {
/* 179 */       if (!moneyMaker) checkMoneyMaker(); 
/* 180 */       if (!enemySlayer) checkEnemySlayer(); 
/* 181 */       if (!firstKill) checkFirstKill(); 
/* 182 */       if (!timeForAnUpgrade) checkTimeForAnUpgrade(); 
/* 183 */       if (!textFighterMaster) checkTextFighterMaster(); 
/* 184 */       if (!YAYPOWER) checkYAYPOWER(); 
/* 185 */       if (!awwYouCareAboutMe) checkAwwYouCareAboutMe(); 
/* 186 */       if (!slayer) checkSlayer(); 
/* 187 */       if (!nobodysPerfect) checkNobodysPerfect(); 
/* 188 */       if (!makingMoney) checkMakingMoney(); 
/* 189 */       if (!gamblingAddiction) checkGamblingAddiction(); 
/* 190 */       if (!level2Fighter) checkLevel2Fighter(); 
/* 191 */       if (!level3Fighter) checkLevel3Fighter(); 
/* 192 */       if (!level4Fighter) checkLevel4Fighter(); 
/* 193 */       if (!level5Fighter) checkLevel5Fighter(); 
/* 194 */       if (!level6Fighter) checkLevel6Fighter(); 
/* 195 */       if (!level7Fighter) checkLevel7Fighter(); 
/* 196 */       if (!level8Fighter) checkLevel8Fighter(); 
/* 197 */       if (!level9Fighter) checkLevel9Fighter(); 
/* 198 */       if (!level10Fighter) checkLevel10Fighter(); 
/* 199 */       if (!honestPlayer) checkHonestPlayer(); 
/* 200 */       if (!learning) checkLearning(); 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void getEnemyAch(Enemy x) {
/* 205 */     get("Goodbye, " + x.getName() + "!");
/* 206 */     arrayKilled.set(arrayEnemy.indexOf(x), Boolean.valueOf(true));
/*     */   }
/*     */   
/*     */   private static void get(String ach) {
/* 210 */     Ui.popup("You've got an achievement! \n\n" + ach, "Achievement", 1);
/* 211 */     Xp.set(100, true);
/*     */   }
/*     */   private static void checkMoneyMaker() {
/* 214 */     if (Coins.get() >= 1500) {
/* 215 */       moneyMaker = true;
/* 216 */       get("Money Maker");
/*     */     } 
/*     */   }
/*     */   private static void checkEnemySlayer() {
/* 220 */     if (Stats.totalKills >= 100) {
/* 221 */       enemySlayer = true;
/* 222 */       get("Enemy Slayer");
/*     */     } 
/*     */   }
/*     */   private static void checkFirstKill() {
/* 226 */     if (Stats.totalKills >= 1) {
/* 227 */       firstKill = true;
/* 228 */       get("First Kill");
/*     */     } 
/*     */   }
/*     */   private static void checkTimeForAnUpgrade() {
/* 232 */     if (boughtItem) {
/* 233 */       timeForAnUpgrade = true;
/* 234 */       get("Time for an Upgrade");
/*     */     } 
/*     */   }
/*     */   private static void checkTextFighterMaster() {
/* 238 */     if (moneyMaker && enemySlayer && firstKill && timeForAnUpgrade && YAYPOWER && awwYouCareAboutMe && slayer && nobodysPerfect && makingMoney && gamblingAddiction && level2Fighter && level3Fighter && level4Fighter && level5Fighter && level6Fighter && level7Fighter && level8Fighter && level9Fighter && level10Fighter && honestPlayer && learning) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 263 */       int temp = 0;
/* 264 */       for (int i = 0; i <= arrayEnemy.size(); i++) {
/* 265 */         if (((Boolean)arrayKilled.get(i)).booleanValue()) {
/* 266 */           temp++;
/*     */         }
/*     */       } 
/* 269 */       if (temp < arrayEnemy.size()) {
/* 270 */         textFighterMaster = true;
/* 271 */         get("Text-Fighter Master\n Congratulations, you have gotten every achievement in Text Fighter! You've been awarded 2500 coins.");
/* 272 */         Coins.set(2500, true);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   private static void checkYAYPOWER() {
/* 277 */     if (Power.used >= 5) {
/* 278 */       YAYPOWER = true;
/* 279 */       get("YAY, POWER!!");
/*     */     } 
/*     */   }
/*     */   private static void checkAwwYouCareAboutMe() {
/* 283 */     if (viewedAbout) {
/* 284 */       awwYouCareAboutMe = true;
/* 285 */       get("Aww, You Care About Me");
/*     */     } 
/*     */   }
/*     */   private static void checkSlayer() {
/* 289 */     if (Stats.totalDamageDealt >= 1000) {
/* 290 */       slayer = true;
/* 291 */       get("Slayer");
/*     */     } 
/*     */   }
/*     */   private static void checkNobodysPerfect() {
/* 295 */     if (Health.timesDied > 0) {
/* 296 */       nobodysPerfect = true;
/* 297 */       get("Nobodys Perfect");
/*     */     } 
/*     */   }
/*     */   private static void checkMakingMoney() {
/* 301 */     if (Casino.totalCoinsWon >= 1000) {
/* 302 */       makingMoney = true;
/* 303 */       get("Making Money");
/*     */     } 
/*     */   }
/*     */   private static void checkGamblingAddiction() {
/* 307 */     if (Casino.gamesPlayed >= 75) {
/* 308 */       gamblingAddiction = true;
/* 309 */       get("Gambling Addiction");
/*     */     } 
/*     */   }
/*     */   private static void checkLevel2Fighter() {
/* 313 */     if (Xp.getLevel() == 2) {
/* 314 */       level2Fighter = true;
/* 315 */       get("Level 2 Fighter!");
/*     */     } 
/*     */   }
/*     */   private static void checkLevel3Fighter() {
/* 319 */     if (Xp.getLevel() == 3) {
/* 320 */       level3Fighter = true;
/* 321 */       get("Level 3 Fighter!");
/*     */     } 
/*     */   }
/*     */   private static void checkLevel4Fighter() {
/* 325 */     if (Xp.getLevel() == 4) {
/* 326 */       level4Fighter = true;
/* 327 */       get("Level 4 Fighter!");
/*     */     } 
/*     */   }
/*     */   private static void checkLevel5Fighter() {
/* 331 */     if (Xp.getLevel() == 5) {
/* 332 */       level5Fighter = true;
/* 333 */       get("Level 5 Fighter!");
/*     */     } 
/*     */   }
/*     */   private static void checkLevel6Fighter() {
/* 337 */     if (Xp.getLevel() == 6) {
/* 338 */       level6Fighter = true;
/* 339 */       get("Level 6 Fighter!");
/*     */     } 
/*     */   }
/*     */   private static void checkLevel7Fighter() {
/* 343 */     if (Xp.getLevel() == 7) {
/* 344 */       level7Fighter = true;
/* 345 */       get("Level 7 Fighter!");
/*     */     } 
/*     */   }
/*     */   private static void checkLevel8Fighter() {
/* 349 */     if (Xp.getLevel() == 8) {
/* 350 */       level8Fighter = true;
/* 351 */       get("Level 8 Fighter!");
/*     */     } 
/*     */   }
/*     */   private static void checkLevel9Fighter() {
/* 355 */     if (Xp.getLevel() == 9) {
/* 356 */       level9Fighter = true;
/* 357 */       get("Level 9 Fighter!");
/*     */     } 
/*     */   }
/*     */   private static void checkLevel10Fighter() {
/* 361 */     if (Xp.getLevel() == 10) {
/* 362 */       level10Fighter = true;
/* 363 */       get("Level 10 Fighter!");
/*     */     } 
/*     */   }
/*     */   private static void checkHonestPlayer() {
/* 367 */     if (Cheats.locked()) {
/* 368 */       honestPlayer = true;
/* 369 */       get("Honest Player");
/*     */     } 
/*     */   }
/*     */   private static void checkLearning() {
/*     */     int i;
/* 374 */     for (i = 0; i < Weapon.arrayWeapon.size(); i++) {
/* 375 */       if (!((Weapon)Weapon.arrayWeapon.get(i)).viewedAbout())
/*     */         return; 
/*     */     } 
/* 378 */     for (i = 0; i < Enemy.arrayEnemy.size(); i++) {
/* 379 */       if (!((Enemy)Enemy.arrayEnemy.get(i)).viewedAbout())
/*     */         return; 
/*     */     } 
/* 382 */     for (i = 0; i < Enemy.arrayEnemy.size(); i++) {
/* 383 */       if (!((Armour)Armour.getArmours().get(i)).getViewed())
/*     */         return; 
/*     */     } 
/* 386 */     if (!viewedArmour)
/* 387 */       return;  if (!viewedXP)
/* 388 */       return;  if (!viewedCheats)
/* 389 */       return;  if (!viewedAchs)
/* 390 */       return;  if (!viewedHealth)
/*     */       return; 
/* 392 */     learning = true;
/* 393 */     get("Learning");
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\player\Ach.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */