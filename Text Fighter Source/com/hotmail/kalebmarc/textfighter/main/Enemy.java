/*     */ package com.hotmail.kalebmarc.textfighter.main;
/*     */ 
/*     */ import com.hotmail.kalebmarc.textfighter.player.Ach;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Coins;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Health;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Potion;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Stats;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Xp;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Enemy
/*     */ {
/*     */   private static Enemy current;
/*     */   private String name;
/*     */   private int healthMax;
/*     */   private int coinDropMin;
/*     */   private int coinDropMax;
/*     */   private int damageMin;
/*     */   private int damageMax;
/*     */   private int xp;
/*     */   private boolean viewedAbout = false;
/*     */   private int health;
/*  28 */   public static final ArrayList<Enemy> arrayEnemy = new ArrayList<>();
/*     */ 
/*     */ 
/*     */   
/*     */   public Enemy(String name, int healthMax, int coinDropMin, int coinDropMax, int damageMin, int damageMax, int xp, boolean firstInit, boolean changeDif) {
/*  33 */     this.name = name;
/*  34 */     this.healthMax = healthMax;
/*  35 */     this.coinDropMin = coinDropMin;
/*  36 */     this.coinDropMax = coinDropMax;
/*  37 */     this.damageMin = damageMin;
/*  38 */     this.damageMax = damageMax;
/*  39 */     this.xp = xp;
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
/*  55 */     if (!changeDif) {
/*  56 */       arrayEnemy.add(this);
/*  57 */       Ach.setUpEnemyAch(name, this);
/*     */     } 
/*  59 */     if (firstInit) {
/*  60 */       this.health = healthMax;
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean takeDamage(int damage) {
/*  65 */     this.health -= damage;
/*  66 */     if (this.health <= 0) {
/*  67 */       die();
/*  68 */       return true;
/*     */     } 
/*  70 */     return false;
/*     */   }
/*     */   public void dealDamage() {
/*  73 */     int damage = Random.RInt(this.damageMin, this.damageMax);
/*  74 */     Health.takeDamage(damage);
/*     */   }
/*     */ 
/*     */   
/*     */   private void die() {
/*  79 */     int tempCoin = Random.RInt(this.coinDropMin, this.coinDropMax);
/*  80 */     int tempHealth = Random.RInt(0, 2);
/*     */     Action.cls();
/*     */     Ui.victory_pop();
/*  83 */     Ui.popup("You have defeated an enemy! You've found " + tempCoin + " coins, and " + this.xp + "Xp!", "You've defeated an enemy!", -1);
/*     */ 
/*     */     if (!(current.getName().equals("goblin"))){
                    testFoundPipe();
                }
/*  86 */     
/*  87 */     Coins.set(tempCoin, true);
/*  88 */     switch (tempHealth) {
/*     */       case 0:
/*  90 */         Health.gain(10);
/*     */         break;
/*     */       case 1:
/*  93 */         Potion.set("survival", 1, true);
/*     */         break;
/*     */       case 2:
/*  96 */         Potion.set("recovery", 1, true);
/*     */         break;
/*     */     } 
/*  99 */     Xp.set(this.xp, true);
/* 100 */     Stats.kills++;
/* 101 */     Stats.totalKills++;
              if (Enemy.get().name.equals("goblin") && Enemy.get().damageMin == 5 && Enemy.get().damageMax == 5){
                  return;
              }
/*     */ 
/*     */     
/* 104 */     Ach.getEnemyAch(get());
/*     */     
/* 106 */     encounterNew();
/*     */   }
/*     */

            public int getCoinDropMin() {
                return coinDropMin;
            }

            public int getCoinDropMax() {
              return coinDropMax;
            }

            public int getDamageMin() {
              return damageMin;
            }

            public int getDamageMax() {
              return damageMax;
            }
    
            public static void set(int i) {
/* 109 */     current = arrayEnemy.get(i);
/*     */   }
/*     */   public void setDamage(int min, int max) {
/* 112 */     this.damageMin = min;
/* 113 */     this.damageMax = max;
/*     */   }
/*     */   public void setCoinDrop(int min, int max) {
/* 116 */     this.coinDropMin = min;
/* 117 */     this.coinDropMax = max;
/*     */   }
/*     */   public void setHealth(int current, int max) {
/* 120 */     this.health = current;
/* 121 */     this.healthMax = max;
/*     */   }
/*     */   public int getHealth() {
/* 124 */     return this.health;
/*     */   }
/*     */   public int getHealthMax() {
/* 127 */     return this.healthMax;
/*     */   }
/*     */   public String getHeathStr() {
/* 130 */     return this.health + "/" + this.healthMax;
/*     */   }
/*     */   public String getName() {
/* 133 */     return this.name;
/*     */   }
/*     */   public static Enemy get() {
/* 136 */     return current;
/*     */   }
/*     */   public void setViewed(boolean viewed) {
/* 139 */     this.viewedAbout = viewed;
/*     */   }
/*     */   public boolean viewedAbout() {
/* 142 */     return this.viewedAbout;
/*     */   }
/*     */   public static int getIndex(Enemy i) {
/* 145 */     return arrayEnemy.indexOf(i);
/*     */   }
/*     */   
/*     */   public static void encounterNew() {
/* 149 */     current = arrayEnemy.get(Random.RInt(0, arrayEnemy.size() - 1));
/* 150 */     current.health = current.healthMax;
              Action.cls();
              Ui.ememies_pop();
/* 151 */     Ui.popup("You have encountered a " + current.getName(), "Encounter", 1);
/*     */   }
            
            public static void encounterTutorial(){
                current = new Enemy("goblin", 20, 0, 1, 5, 5, 10, false, false);
                current.health = current.healthMax;
                Ui.popup("You have encountered a " + current.getName(), "Encounter", 1);
                
            }

            //making the boss for the manor
            public static void encounterBoss(){

                current = new Enemy("Displacer Beast", 200, 1000, 3000, 5, 20, 2000, false, false );
                current.health = current.healthMax;
                Ui.popup("You have encountered a " + current.getName(), "Encounter", 1);
            }//end of encounterBoss
/*     */ 
/*     */   
/*     */   public void viewAbout() {
/* 156 */     int BORDER_LENGTH = 39;
/*     */ 
/*     */     
/* 159 */     Action.cls(); int i;
/* 160 */     for (i = 0; i < 39; ) { Ui.print("-"); i++; }
/* 161 */      Ui.println();
/* 162 */     for (i = 0; i < 19 - getName().length() / 2; ) { Ui.print(" "); i++; }
/* 163 */      Ui.println(getName());
/* 164 */     Ui.println("Health: " + getHealthMax());
/* 165 */     Ui.println("Damage: " + this.damageMin + "-" + this.damageMax);
/* 166 */     Ui.println("Coin Drop: " + this.coinDropMin + "-" + this.coinDropMax);
/* 167 */     Ui.println();
/* 168 */     Ui.println("XP Dropped: " + this.xp + "Xp");
/* 169 */     for (i = 0; i < 39; ) { Ui.print("-"); i++; }
/* 170 */      Action.pause();
/* 171 */     Action.cls();
/*     */     
/* 173 */     setViewed(true);
/*     */   }
/*     */   private static void testFoundPipe() {
/* 176 */     int found = Random.RInt(100);
/* 177 */     if (found <= 2 && !Game.pipe.owns) {
/* 178 */       Game.pipe.owns = true;
/* 179 */       Weapon.set(Game.pipe);
/* 180 */       Ui.popup("You have found an old pipe!", "You found something!", 1);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\main\Enemy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */