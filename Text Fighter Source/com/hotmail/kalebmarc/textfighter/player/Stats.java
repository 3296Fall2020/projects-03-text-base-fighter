/*    */ package com.hotmail.kalebmarc.textfighter.player;
/*    */ 
/*    */ import com.hotmail.kalebmarc.textfighter.item.FirstAid;
/*    */ import com.hotmail.kalebmarc.textfighter.item.InstaHealth;
/*    */ import com.hotmail.kalebmarc.textfighter.item.Power;
/*    */ import com.hotmail.kalebmarc.textfighter.main.Action;
/*    */ import com.hotmail.kalebmarc.textfighter.main.Bank;
/*    */ import com.hotmail.kalebmarc.textfighter.main.Casino;
/*    */ import com.hotmail.kalebmarc.textfighter.main.Cheats;
/*    */ import com.hotmail.kalebmarc.textfighter.main.Enemy;
/*    */ import com.hotmail.kalebmarc.textfighter.main.Ui;
/*    */ import com.hotmail.kalebmarc.textfighter.main.Weapon;
/*    */ 
/*    */ 
/*    */ public class Stats
/*    */ {
/*    */   public static int highScore;
/*    */   public static int kills;
/*    */   public static int totalDamageDealt;
/*    */   public static int totalKills;
/*    */   public static int bulletsFired;
/*    */   public static int bulletsThatHit;
/*    */   private static String killDeathRatio;
/*    */   public static int totalCoinsSpent;
/*    */   public static int coinsSpentOnWeapons;
/*    */   public static int coinsSpentOnHealth;
/*    */   public static int coinsSpentOnBankInterest;
/*    */   public static int xpBought;
/*    */   public static int timesCheated;
/*    */   public static int timesQuit;
/*    */   public static int itemsCrafted;
/*    */   public static int diceGamesPlayed;
/*    */   public static int slotGamesPlayed;
/*    */   
/*    */   public static void view() {
/* 36 */     updateKillDeathRatio();
/*    */     
/* 38 */     Action.cls();
/* 39 */     Ui.println("-------------------------------------------------");
/* 40 */     Ui.println("                   PLAYER STATS                  ");
/* 41 */     Ui.println();
/* 42 */     Ui.println("Battle stats:");
/* 43 */     Ui.println("   High Score - " + highScore);
/* 44 */     Ui.println("   Current Kill Streak - " + kills);
/* 45 */     Ui.println("   Total POWER's Used - " + Power.used);
/* 46 */     Ui.println("   Current Weapon - " + Weapon.get().getName());
/* 47 */     Ui.println("   Current Enemy - " + Enemy.get().getName());
/* 48 */     Ui.println("   Total Damage Dealt - " + totalDamageDealt);
/* 49 */     Ui.println("   Total Kills - " + totalKills);
/* 50 */     Ui.println("   Bullets Fired - " + bulletsFired);
/* 51 */     Ui.println("   Bullets that hit - " + bulletsThatHit);
/* 52 */     Ui.println("   K:D - " + killDeathRatio);
/* 53 */     Ui.println();
/* 54 */     Ui.println("Coins:");
/* 55 */     Ui.println("   Coins - " + Coins.get());
/* 56 */     Ui.println("   Coins in bank - " + Bank.get());
/* 57 */     Ui.println("   Total Coins Won in Casino - " + Casino.totalCoinsWon);
/* 58 */     Ui.println("   Total Games Played in Casino - " + Casino.gamesPlayed);
/* 59 */     Ui.println("   Total coins spent - " + totalCoinsSpent);
/* 60 */     Ui.println("   Coins spent on bank interest - " + coinsSpentOnBankInterest);
/* 61 */     Ui.println("   Coins spent on weapons - " + coinsSpentOnWeapons);
/* 62 */     Ui.println("   Coins spent on health - " + coinsSpentOnHealth);
/* 63 */     Ui.println("   XP bought - " + xpBought);
/* 64 */     Ui.println();
/* 65 */     Ui.println("Health:");
/* 66 */     Ui.println("   Health - " + Health.getStr());
/* 67 */     Ui.println("   Insta-Healths used - " + InstaHealth.used);
/* 68 */     Ui.println("   First-Aid kits used - " + FirstAid.used);
/* 69 */     Ui.println("   Potions used - " + (Potion.spUsed + Potion.rpUsed));
/* 70 */     Ui.println("   Times Died - " + Health.timesDied);
/* 71 */     Ui.println();
/* 72 */     Ui.println("Other: ");
/* 73 */     Ui.println("   Cheats Enabled? - " + Cheats.enabled());
/* 74 */     Ui.println("   Level - " + Xp.getLevel());
/* 75 */     Ui.println("   Xp - " + Xp.getFull());
/* 76 */     Ui.println("   Total Xp gained - " + Xp.total);
/* 77 */     Ui.println("   Times cheated - " + timesCheated);
/* 78 */     Ui.println("   Times quit - " + timesQuit);
/* 79 */     Ui.println("   Items Crafted - " + itemsCrafted);
/* 80 */     Ui.println("   Dice Games Played - " + diceGamesPlayed);
/* 81 */     Ui.println("   Slot Games Played - " + slotGamesPlayed);
/* 82 */     Ui.println();
/* 83 */     Ui.println("-------------------------------------------------");
/* 84 */     Action.pause();
/*    */   }
/*    */   private static void updateKillDeathRatio() {
/* 87 */     killDeathRatio = totalKills + ":" + Health.timesDied;
/*    */   }
/*    */ }


/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\player\Stats.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */