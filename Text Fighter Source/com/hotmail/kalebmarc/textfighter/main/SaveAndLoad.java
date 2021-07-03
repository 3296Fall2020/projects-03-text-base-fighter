/*     */ package com.hotmail.kalebmarc.textfighter.main;
/*     */ import com.hotmail.kalebmarc.textfighter.item.Armour;
/*     */ import com.hotmail.kalebmarc.textfighter.item.FirstAid;
/*     */ import com.hotmail.kalebmarc.textfighter.item.InstaHealth;
/*     */ import com.hotmail.kalebmarc.textfighter.item.Power;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Ach;
import com.hotmail.kalebmarc.textfighter.player.Coins;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Health;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Potion;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Settings;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Stats;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Xp;
import java.io.File;
/*     */ import java.io.PrintStream;
/*     */ import java.util.Scanner;
/*     */ 
/*     */ class SaveAndLoad {
/*  16 */   private static String path = SaveAndLoad.class.getProtectionDomain().getCodeSource().getLocation().getPath() + ".TFsave";
/*     */   private static PrintStream output;
/*     */   private static Scanner input;
/*     */   
/*     */   public static boolean load() {
/*  21 */     User.promptNameSelection();
/*  22 */     path = path.replace(".jar", "_" + User.name());
/*  23 */     path = path.replaceAll("%20", " ");
/*     */     
/*     */     try {
/*  26 */       input = new Scanner(new File(path));
/*  27 */     } catch (Exception e) {
/*  28 */       Action.cls();
/*  29 */       Ui.println("------------------------------");
/*  30 */       Ui.println("Cannot find save file.  ");
/*  31 */       Ui.println("Starting a new game...  ");
/*  32 */       Ui.println("------------------------------");
/*  33 */       Action.pause();
/*  34 */       return false;
/*     */     } 
/*     */     
/*     */     try {
/*  38 */       if (!input.nextLine().equals(Version.getFull())) {
/*  39 */         Action.cls();
/*  40 */         Ui.println("------------------------------------");
/*  41 */         Ui.println("WARNING- This save file is from");
/*  42 */         Ui.println("a different version of TextFighter,");
/*  43 */         Ui.println("and will probably crash the game");
/*  44 */         Ui.println("if you try and load it. Do you");
/*  45 */         Ui.println("want to continue anyways?");
/*  46 */         Ui.println("------------------------------------");
/*  47 */         Ui.println("1) No, start a new game");
/*  48 */         Ui.println("2) Yes, attempt to load");
/*  49 */         switch (Action.getValidInt()) {
/*     */           case 1:
/*  51 */             return false;
/*     */           case 2:
/*     */             break;
/*     */           default:
/*  55 */             return false;
/*     */         } 
/*     */       
/*     */       } 
/*  59 */       Health.set(readInt(), readInt());
/*  60 */       FirstAid.set(readInt(), false);
/*  61 */       FirstAid.used = readInt();
/*  62 */       InstaHealth.set(readInt(), false);
/*  63 */       InstaHealth.used = readInt();
/*  64 */       Health.timesDied = readInt();
/*     */ 
/*     */       
/*  67 */       Coins.set(readInt(), false);
/*  68 */       Bank.set(readInt(), false);
/*  69 */       Casino.totalCoinsWon = readInt();
/*  70 */       Casino.gamesPlayed = readInt();
/*  71 */       Ach.boughtItem = readBoolean();
/*  72 */       Stats.totalCoinsSpent = readInt();
/*  73 */       Stats.coinsSpentOnBankInterest = readInt();
/*  74 */       Stats.coinsSpentOnWeapons = readInt();
/*  75 */       Stats.coinsSpentOnHealth = readInt();
/*  76 */       Stats.xpBought = readInt();
/*  77 */       Loan.setCurrentLoan(readInt());
/*  78 */       Loan.setNetDue(readInt());
/*     */ 
/*     */       
/*  81 */       Xp.setLevel(readInt());
/*  82 */       Xp.setOutOf(readInt());
/*  83 */       Xp.set(readInt(), false);
/*  84 */       Xp.total = readInt();
/*     */ 
/*     */       
/*  87 */       Potion.spUsed = readInt();
/*  88 */       Potion.rpUsed = readInt();
/*  89 */       Potion.set("survival", readInt(), false);
/*  90 */       Potion.set("recovery", readInt(), false);
/*     */ 
/*     */ 
/*     */       
/*  94 */       Settings.setDif(input.nextLine(), false, false);
/*  95 */       if (readBoolean()) Cheats.enable(); 
/*  96 */       if (readBoolean()) Cheats.lock(); 
/*  97 */       Settings.difLocked = readBoolean();
/*  98 */       Ui.guiEnabled = readBoolean();
/*     */ 
/*     */       
/* 101 */       Stats.kills = readInt();
/* 102 */       Stats.highScore = readInt();
/* 103 */       Stats.totalKills = readInt();
/* 104 */       Weapon.set(readInt()); int i;
/* 105 */       for (i = 0; i < Weapon.arrayWeapon.size(); i++) {
/* 106 */         ((Weapon)Weapon.arrayWeapon.get(i)).owns = readBoolean();
/*     */       }
/* 108 */       for (i = 0; i < Weapon.arrayWeapon.size(); i++) {
/* 109 */         ((Weapon)Weapon.arrayWeapon.get(i)).setAmmo(readInt(), false);
/*     */       }
/* 111 */       Power.set(readInt(), false);
/* 112 */       Power.used = readInt();
/* 113 */       Stats.totalDamageDealt = readInt();
/* 114 */       Stats.bulletsFired = readInt();
/* 115 */       Stats.bulletsThatHit = readInt();
/* 116 */       for (i = 0; i < Armour.getArmours().size(); i++) {
/* 117 */         ((Armour)Armour.getArmours().get(i)).setOwns(readBoolean());
/*     */       }
/* 119 */       Armour.set(readInt());
/*     */ 
/*     */       
/* 122 */       Enemy.set(readInt());
/* 123 */       Enemy.get().setHealth(readInt(), Enemy.get().getHealthMax());
/*     */ 
/*     */       
/* 126 */       Ach.moneyMaker = readBoolean();
/* 127 */       Ach.enemySlayer = readBoolean();
/* 128 */       Ach.firstKill = readBoolean();
/* 129 */       Ach.timeForAnUpgrade = readBoolean();
/* 130 */       for (i = 0; i < Enemy.arrayEnemy.size(); i++) {
/* 131 */         Ach.arrayKilled.set(i, Boolean.valueOf(readBoolean()));
/*     */       }
/* 133 */       Ach.textFighterMaster = readBoolean();
/* 134 */       Ach.YAYPOWER = readBoolean();
/* 135 */       Ach.awwYouCareAboutMe = readBoolean();
/* 136 */       Ach.slayer = readBoolean();
/* 137 */       Ach.nobodysPerfect = readBoolean();
/* 138 */       Ach.makingMoney = readBoolean();
/* 139 */       Ach.gamblingAddiction = readBoolean();
/* 140 */       Ach.level2Fighter = readBoolean();
/* 141 */       Ach.level3Fighter = readBoolean();
/* 142 */       Ach.level4Fighter = readBoolean();
/* 143 */       Ach.level5Fighter = readBoolean();
/* 144 */       Ach.level6Fighter = readBoolean();
/* 145 */       Ach.level7Fighter = readBoolean();
/* 146 */       Ach.level8Fighter = readBoolean();
/* 147 */       Ach.level9Fighter = readBoolean();
/* 148 */       Ach.level10Fighter = readBoolean();
/* 149 */       Ach.honestPlayer = readBoolean();
/* 150 */       Ach.learning = readBoolean();
/*     */ 
/*     */       
/* 153 */       About.setViewed(readBoolean());
/* 154 */       Stats.timesCheated = readInt();
/* 155 */       Stats.timesQuit = readInt();
/* 156 */       Stats.itemsCrafted = readInt();
/* 157 */       Stats.diceGamesPlayed = readInt();
/* 158 */       Stats.slotGamesPlayed = readInt();
/*     */     
/*     */     }
/* 161 */     catch (Exception e) {
/* 162 */       Handle.error("Error Code - 009\n\n" + e.toString());
/* 163 */       System.exit(1);
/*     */     } 
/*     */ 
/*     */     
/* 167 */     return true;
/*     */   }
/*     */   
/*     */   public static void save() {
/* 171 */     path = path.replace(".jar", User.name());
/* 172 */     path = path.replaceAll("%20", " ");
/*     */     
/*     */     try {
/* 175 */       output = new PrintStream(path);
/* 176 */     } catch (Exception e) {
/* 177 */       Handle.error("Error Code - 008");
/*     */     } 
/*     */ 
/*     */     
/* 181 */     output.println(Version.getFull());
/*     */ 
/*     */     
/* 184 */     output.println(Health.get());
/* 185 */     output.println(Health.getOutOf());
/* 186 */     output.println(FirstAid.get());
/* 187 */     output.println(FirstAid.used);
/* 188 */     output.println(InstaHealth.get());
/* 189 */     output.println(InstaHealth.used);
/* 190 */     output.println(Health.timesDied);
/*     */ 
/*     */     
/* 193 */     output.println(Coins.get());
/* 194 */     output.println(Bank.get());
/* 195 */     output.println(Casino.totalCoinsWon);
/* 196 */     output.println(Casino.gamesPlayed);
/* 197 */     output.println(Ach.boughtItem);
/* 198 */     output.println(Stats.totalCoinsSpent);
/* 199 */     output.println(Stats.coinsSpentOnBankInterest);
/* 200 */     output.println(Stats.coinsSpentOnWeapons);
/* 201 */     output.println(Stats.coinsSpentOnHealth);
/* 202 */     output.println(Stats.xpBought);
/* 203 */     output.println(Loan.getCurrentLoan());
/* 204 */     output.println(Loan.getNetDue());
/*     */ 
/*     */     
/* 207 */     output.println(Xp.getLevel());
/* 208 */     output.println(Xp.getOutOf());
/* 209 */     output.println(Xp.get());
/* 210 */     output.println(Xp.total);
/*     */ 
/*     */     
/* 213 */     output.println(Potion.spUsed);
/* 214 */     output.println(Potion.rpUsed);
/* 215 */     output.println(Potion.get("survival"));
/* 216 */     output.println(Potion.get("recovery"));
/*     */ 
/*     */     
/* 219 */     output.println(Settings.getDif());
/* 220 */     output.println(Cheats.enabled());
/* 221 */     output.println(Cheats.locked());
/* 222 */     output.println(Settings.difLocked);
/* 223 */     output.println(Ui.guiEnabled);
/*     */ 
/*     */     
/* 226 */     output.println(Stats.kills);
/* 227 */     output.println(Stats.highScore);
/* 228 */     output.println(Stats.totalKills);
/* 229 */     output.println(Weapon.getIndex(Weapon.get())); int i;
/* 230 */     for (i = 0; i < Weapon.arrayWeapon.size(); i++)
/*     */     {
/* 232 */       output.println(((Weapon)Weapon.arrayWeapon.get(i)).owns());
/*     */     }
/* 234 */     for (i = 0; i < Weapon.arrayWeapon.size(); i++) {
/* 235 */       output.println(((Weapon)Weapon.arrayWeapon.get(i)).getAmmo());
/*     */     }
/* 237 */     output.println(Power.get());
/* 238 */     output.println(Power.used);
/* 239 */     output.println(Stats.totalDamageDealt);
/* 240 */     output.println(Stats.bulletsFired);
/* 241 */     output.println(Stats.bulletsThatHit);
/* 242 */     for (i = 0; i < Armour.getArmours().size(); i++) {
/* 243 */       output.println(((Armour)Armour.getArmours().get(i)).isOwns());
/*     */     }
/* 245 */     output.println(Armour.get());
/*     */ 
/*     */     
/* 248 */     output.println(Enemy.getIndex(Enemy.get()));
/* 249 */     output.println(Enemy.get().getHealth());
/*     */ 
/*     */     
/* 252 */     output.println(Ach.moneyMaker);
/* 253 */     output.println(Ach.enemySlayer);
/* 254 */     output.println(Ach.firstKill);
/* 255 */     output.println(Ach.timeForAnUpgrade);
/* 256 */     for (i = 0; i < Enemy.arrayEnemy.size(); i++) {
/* 257 */       output.println(Ach.arrayKilled.get(i));
/*     */     }
/* 259 */     output.println(Ach.textFighterMaster);
/* 260 */     output.println(Ach.YAYPOWER);
/* 261 */     output.println(Ach.awwYouCareAboutMe);
/* 262 */     output.println(Ach.slayer);
/* 263 */     output.println(Ach.nobodysPerfect);
/* 264 */     output.println(Ach.makingMoney);
/* 265 */     output.println(Ach.gamblingAddiction);
/* 266 */     output.println(Ach.level2Fighter);
/* 267 */     output.println(Ach.level3Fighter);
/* 268 */     output.println(Ach.level4Fighter);
/* 269 */     output.println(Ach.level5Fighter);
/* 270 */     output.println(Ach.level6Fighter);
/* 271 */     output.println(Ach.level7Fighter);
/* 272 */     output.println(Ach.level8Fighter);
/* 273 */     output.println(Ach.level9Fighter);
/* 274 */     output.println(Ach.level10Fighter);
/* 275 */     output.println(Ach.honestPlayer);
/* 276 */     output.println(Ach.learning);
/*     */ 
/*     */     
/* 279 */     output.println(About.viewed());
/* 280 */     output.println(Stats.timesCheated);
/* 281 */     output.println(++Stats.timesQuit);
/* 282 */     output.println(Stats.itemsCrafted);
/* 283 */     output.println(Stats.diceGamesPlayed);
/* 284 */     output.println(Stats.slotGamesPlayed);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static int readInt() {
/* 294 */     return Integer.parseInt(input.nextLine());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static boolean readBoolean() {
/* 302 */     return Boolean.parseBoolean(input.nextLine());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static String readString() {
/* 310 */     return input.nextLine();
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\main\SaveAndLoad.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */