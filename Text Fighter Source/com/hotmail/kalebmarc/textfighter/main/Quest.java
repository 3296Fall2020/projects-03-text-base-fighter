/*    */ package com.hotmail.kalebmarc.textfighter.main;
/*    */ 
/*    */ import com.hotmail.kalebmarc.textfighter.item.Armour;
/*    */ import com.hotmail.kalebmarc.textfighter.player.Xp;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Quest
/*    */ {
/*    */   private String host;
/*    */   private int coinRewardMin;
/*    */   private int coinRewardMax;
/*    */   private int xpRewardMin;
/*    */   private int xpRewardMax;
/*    */   private int healthRewardMin;
/*    */   private int healthRewardMax;
/* 22 */   private final ArrayList<Armour> rewardArmor = new ArrayList<>();
/* 23 */   private final ArrayList<Weapon> rewardWeapon = new ArrayList<>();
/*    */   
/*    */   private int minLevelReq;
/*    */   
/*    */   private boolean completed;
/*    */   
/*    */   private boolean available;
/* 30 */   private static final ArrayList<Quest> QuestList = new ArrayList<>();
/*    */ 
/*    */ 
/*    */   
/*    */   public Quest(String host, int coinMin, int coinMax, int xpMin, int xpMax, int healthMin, int healthMax, int minLevel, boolean complete, boolean avail) {
/* 35 */     this.host = host;
/* 36 */     this.coinRewardMin = coinMin;
/* 37 */     this.coinRewardMax = coinMax;
/* 38 */     this.xpRewardMin = xpMin;
/* 39 */     this.xpRewardMax = xpMax;
/* 40 */     this.healthRewardMin = healthMin;
/* 41 */     this.healthRewardMax = healthMax;
/* 42 */     this.minLevelReq = minLevel;
/* 43 */     this.completed = complete;
/* 44 */     this.available = avail;
/* 45 */     QuestList.add(this);
/*    */   }
/*    */   public static boolean checkQuestsForNPC(String npcName) {
/* 48 */     boolean check = false;
/* 49 */     int i = 0;
/*    */     while (true) {
/* 51 */       if (((Quest)QuestList.get(i)).host.equalsIgnoreCase(npcName) && (
/* 52 */         (Quest)QuestList.get(i)).getMinLevelReq() <= Xp.getLevel() && (
/* 53 */         (Quest)QuestList.get(i)).getAvailable()) {
/* 54 */         check = !((Quest)QuestList.get(i)).getComplete();
/*    */       }
/*    */ 
/*    */       
/* 58 */       i++;
/*    */       
/* 60 */       if (i >= QuestList.size() && !check)
/* 61 */         return check; 
/*    */     } 
/*    */   }
/*    */   public int getMinLevelReq() {
/* 65 */     return this.minLevelReq;
/*    */   }
/*    */   
/*    */   public boolean getComplete() {
/* 69 */     return this.completed;
/*    */   }
/*    */   
/*    */   public boolean getAvailable() {
/* 73 */     return this.available;
/*    */   }
/*    */ }


/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\main\Quest.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */