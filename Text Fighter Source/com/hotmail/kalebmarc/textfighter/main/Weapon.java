/*     */ package com.hotmail.kalebmarc.textfighter.main;
/*     */ 
/*     */ import com.hotmail.kalebmarc.textfighter.player.Ach;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Coins;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Health;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Stats;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Xp;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Weapon
/*     */ {
/*     */   public static int BULLET_DAMAGE;
/*     */   public int price;
/*     */   public int level;
/*     */   private int damageMin;
/*     */   private int damageMax;
/*     */   private double chanceOfMissing;
/*     */   private String name;
/*     */   private boolean buyable;
/*     */   private boolean viewedAbout;
/*     */   public boolean melee;
/*     */   public static Weapon starting;
/*  27 */   private static Weapon current = null;
/*     */   
/*     */   public boolean owns;
/*     */   
/*     */   private int ammo;
/*     */   
/*     */   private int ammoUsed;
/*     */   
/*     */   private int ammoPrice;
/*     */   private int ammoIncludedWithPurchase;
/*  37 */   public static final ArrayList<Weapon> arrayWeapon = new ArrayList<>();
/*     */ 
/*     */ 
/*     */   
/*     */   public Weapon(String name, int ammoUsed, int ammoIncludedWithPurchase, boolean buyable, int price, int ammoPrice, int level, double chanceOfMissing, boolean firstInit, boolean changeDif) {
/*  42 */     this.name = name;
/*  43 */     this.ammoUsed = ammoUsed;
/*  44 */     this.ammoIncludedWithPurchase = ammoIncludedWithPurchase;
/*  45 */     this.buyable = buyable;
/*  46 */     this.price = price;
/*  47 */     this.ammoPrice = ammoPrice;
/*  48 */     this.level = level;
/*  49 */     this.chanceOfMissing = chanceOfMissing;
/*  50 */     this.melee = false;
/*     */     
/*  52 */     if (!changeDif) {
/*  53 */       arrayWeapon.add(this);
/*     */     }
/*     */     
/*  56 */     if (firstInit) {
/*  57 */       this.owns = false;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Weapon(String name, boolean startingWeapon, boolean buyable, int price, int level, int damageMin, int damageMax, boolean firstInit, boolean changeDif) {
/*  64 */     this.name = name;
/*  65 */     this.buyable = buyable;
/*  66 */     this.price = price;
/*  67 */     this.level = level;
/*  68 */     this.damageMin = damageMin;
/*  69 */     this.damageMax = damageMax;
/*  70 */     this.melee = true;
/*     */     
/*  72 */     if (!changeDif) {
/*  73 */       arrayWeapon.add(this);
/*     */     }
/*     */     
/*  76 */     if (firstInit)
/*  77 */       if (startingWeapon) {
/*  78 */         this.owns = true;
/*  79 */         current = this;
/*  80 */         starting = this;
/*     */       } else {
/*  82 */         this.owns = false;
/*     */       }  
/*     */   }
/*     */   
/*     */   public static Weapon get() {
/*  87 */     return current;
/*     */   }
/*     */   public String getName() {
/*  90 */     return this.name;
/*     */   }
/*     */   public boolean owns() {
/*  93 */     return this.owns;
/*     */   }
/*     */   static int getIndex(Weapon i) {
/*  96 */     return arrayWeapon.indexOf(i);
/*     */   }
/*     */   public static void set(Weapon x) {
/*  99 */     current = x;
/*     */   }
/*     */   public static void set(int i) {
/* 102 */     current = arrayWeapon.get(i);
/*     */   }
/*     */   public void setAmmo(int amount, boolean add) {
/* 105 */     if (this.melee)
/* 106 */       return;  if (add) {
/* 107 */       this.ammo += amount;
/*     */     } else {
/* 109 */       this.ammo = amount;
/*     */     } 
/*     */   }
/*     */   public int getAmmo() {
/* 113 */     return this.ammo;
/*     */   }
/*     */   public static void choose() {
/*     */     while (true) {
/* 117 */       Action.cls();
/* 118 */       Ui.println("----------------------------");
/* 119 */       Ui.println("Equip new weapon");
/* 120 */       Ui.println();
/* 121 */       Ui.println("Ammo: " + current.getAmmo());
/* 122 */       Ui.println("Equipped weapon: " + current.getName());
/* 123 */       Ui.println("----------------------------");
/* 124 */       ArrayList<Weapon> validWeapons = new ArrayList<>();
/* 125 */       for (int i = 0; i < arrayWeapon.size(); i++) {
/* 126 */         if (((Weapon)arrayWeapon.get(i)).owns()) {
/* 127 */           Ui.println((validWeapons.size() + 1) + ") " + ((Weapon)arrayWeapon.get(i)).getName());
/* 128 */           validWeapons.add(arrayWeapon.get(i));
/*     */         } 
/*     */       } 
/*     */       
/* 132 */       int menuItem = Action.getValidInt();
/*     */       
/*     */       try {
/* 135 */         current = validWeapons.get(menuItem - 1);
/* 136 */         Action.cls();
/* 137 */         Ui.println("You have equipped a " + current.getName());
/* 138 */         Action.pause();
/*     */         break;
/* 140 */       } catch (Exception e) {
/*     */         
/* 142 */         if (menuItem == validWeapons.size() + 1) {
/*     */           return;
/*     */         }
/* 145 */         Ui.println();
/* 146 */         Ui.println(menuItem + " is not an option.");
/*     */       } 
/*     */     } 
/*     */   }
/*     */   public void dealDam() {
/* 151 */     int damageDealt = 0;
/*     */     
/* 153 */     if (this.melee) {
/*     */ 
/*     */ 
/*     */       
/* 157 */       damageDealt = Random.RInt(this.damageMin, this.damageMax);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 164 */     else if (getAmmo() >= this.ammoUsed) {
/*     */       
/* 166 */       for (int i = 1; i <= this.ammoUsed; i++) {
/* 167 */         if (Random.RInt(100) > this.chanceOfMissing) {
/* 168 */           damageDealt += BULLET_DAMAGE;
/* 169 */           Stats.bulletsThatHit++;
/*     */         } 
/*     */ 
/*     */         
/* 173 */         setAmmo(-this.ammoUsed, true);
/* 174 */         Stats.bulletsFired += this.ammoUsed;
/*     */       } 
/*     */     } else {
/*     */       
/* 178 */       noAmmo();
/* 179 */       damageDealt = 0;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 184 */     Stats.totalDamageDealt += damageDealt;
/* 185 */     Xp.set(damageDealt, true);
/* 186 */     Enemy.get().takeDamage(damageDealt);
/* 187 */     Action.cls();
              Ui.battle_pop();
/* 188 */     Ui.println("----------------------------------------------------");
/* 189 */     Ui.println("You have attacked a " + Enemy.get().getName() + "!");
/* 190 */     Ui.println("You dealt " + damageDealt + " damage with a " + this.name);
/* 191 */     Ui.println("----------------------------------------------------");
/* 192 */     Ui.println("Your health: " + Health.getStr());
/* 193 */     Ui.println("Enemy health: " + Enemy.get().getHeathStr());
/* 194 */     Ui.println("----------------------------------------------------");
/*     */     
/* 196 */     Action.pause();
/*     */   }
/*     */   
/*     */   public void viewAbout() {
/* 200 */     int BORDER_LENGTH = 39;
/*     */ 
/*     */     
/* 203 */     Action.cls(); int i;
/* 204 */     for (i = 0; i < 39; ) { Ui.print("-"); i++; }
/* 205 */      Ui.println();
/* 206 */     for (i = 0; i < 19 - getName().length() / 2; ) { Ui.print(" "); i++; }
/* 207 */      Ui.println(getName());
/* 208 */     Ui.println("Price: " + this.price + " coins");
/* 209 */     Ui.println("Chance of missing: " + this.chanceOfMissing + "%");
/* 210 */     Ui.println("Ammo Used: " + this.ammoUsed);
/* 211 */     Ui.println("Damage: " + getDamage());
/* 212 */     for (i = 0; i < 39; ) { Ui.print("-"); i++; }
/* 213 */      Action.pause();
/* 214 */     Action.cls();
/*     */     
/* 216 */     setViewed(true);
/*     */   }
/*     */   private String getDamage() {
/* 219 */     if (this.melee) {
/* 220 */       return this.damageMin + " - " + this.damageMax;
/*     */     }
/* 222 */     if (this.chanceOfMissing == 0.0D) {
/* 223 */       return String.valueOf(BULLET_DAMAGE * this.ammoUsed);
/*     */     }
/* 225 */     return "0 - " + String.valueOf(BULLET_DAMAGE * this.ammoUsed);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean viewedAbout() {
/* 230 */     return this.viewedAbout;
/*     */   }
/*     */   public void setViewed(boolean v) {
/* 233 */     this.viewedAbout = v;
/*     */   }
/*     */   public boolean isBuyable() {
/* 236 */     return this.buyable;
/*     */   }
/*     */   public void buy() {
/* 239 */     Action.cls();
/* 240 */     if (!isBuyable()) {
/* 241 */       Ui.println("Sorry, this item is no longer in stock.");
/* 242 */       Action.pause();
/*     */       return;
/*     */     } 
/* 245 */     if (owns()) {
/* 246 */       Ui.println("You already own this weapon.");
/* 247 */       Action.pause();
/*     */       return;
/*     */     } 
/* 250 */     if (this.level > Xp.getLevel()) {
/* 251 */       Ui.println("You are not a high enough level to buy this item.");
/* 252 */       Action.pause();
/*     */       return;
/*     */     } 
/* 255 */     if (this.price > Coins.get()) {
/* 256 */       Ui.println("You do not have enough coins to buy this item.");
/* 257 */       Action.pause();
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 262 */     Ach.boughtItem = true;
/* 263 */     Coins.set(-this.price, true);
/* 264 */     Stats.coinsSpentOnWeapons += this.price;
/* 265 */     this.owns = true;
/* 266 */     current = this;
/* 267 */     Ui.println("You have bought a " + getName() + " for " + this.price + " coins.");
/* 268 */     Ui.println("Coins: " + Coins.get());
/* 269 */     Action.pause();
/*     */ 
/*     */     
/* 272 */     this.ammo += this.ammoIncludedWithPurchase;
/*     */   }
/*     */ 
/*     */   
/*     */   public void buyAmmo() {
/* 277 */     Action.cls();
/*     */ 
/*     */     
/* 280 */     if (Xp.getLevel() < this.level) {
/* 281 */       Ui.println("You are not a high enough level. You need to be at least level " + this.level + ".");
/* 282 */       Action.pause();
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 287 */     Ui.println("How much ammo would you like to buy?");
/* 288 */     Ui.println("1 ammo cost " + this.ammoPrice + " coins.");
/* 289 */     Ui.println("You have " + Coins.get() + " coins.");
/* 290 */     int ammoToBuy = Action.getValidInt();
/* 291 */     int cost = ammoToBuy * this.ammoPrice;
/*     */ 
/*     */     
/* 294 */     if (Coins.get() < cost) {
/* 295 */       Ui.println("You don't have enough coins. You need " + (cost - Coins.get()) + " more coins.");
/* 296 */       Action.pause();
/*     */       
/*     */       return;
/*     */     } 
/* 300 */     this.ammo += ammoToBuy;
/* 301 */     Coins.set(-cost, true);
/* 302 */     Stats.coinsSpentOnWeapons += cost;
/*     */     
/* 304 */     Ui.println("You have bought " + ammoToBuy + " ammo.");
/* 305 */     Action.pause();
/*     */   }
/*     */   private static void noAmmo() {
/* 308 */     Ui.popup("You've run out of ammo!", "Warning", 2);
/* 309 */     current = starting;
/*     */   }
/*     */   public int getAmmoPrice() {
/* 312 */     return this.ammoPrice;
/*     */   }

            public static void scythe(){
                current = new Weapon("Scythe",true,false, 0, 5, 5, 12, true, true);
            }//end of scythe

            public static void fireSword(){
                current = new Weapon("Fire Sword",true,false, 0, 5, 2, 13, true, true);
            }//end of fireSword

            public static void morningStar(){
                current = new Weapon("Morning Star",true,false, 0, 5, 3, 15, true, true);
            }//end of morningStar

/*     */ }



/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\main\Weapon.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */