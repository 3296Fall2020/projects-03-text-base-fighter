/*     */ package com.hotmail.kalebmarc.textfighter.main;
/*     */ 
/*     */ import com.hotmail.kalebmarc.textfighter.item.Armour;
/*     */ import com.hotmail.kalebmarc.textfighter.item.FirstAid;
/*     */ import com.hotmail.kalebmarc.textfighter.item.InstaHealth;
/*     */ import com.hotmail.kalebmarc.textfighter.item.Power;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Coins;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Potion;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Stats;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Xp;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ 
/*     */ class Shop
/*     */ {
/*     */   public static void menu() {
/*     */     while (true) {
/*  19 */       Action.cls();
/*  20 */       Ui.println("-------------------------------------------------------------------");
/*  21 */       Ui.println("                        Welcome to the shop!                       ");
/*  22 */       Ui.println();
/*  23 */       Ui.println("Coins: " + Coins.get());
/*  24 */       Ui.println("First-Aid kits: " + FirstAid.get());
/*  25 */       Ui.println("Potions: " + (Potion.get("survival") + Potion.get("recovery")));
/*  26 */       Ui.println();
/*  27 */       Ui.println("-------------------------------------------------------------------");
/*  28 */       Ui.println("1) Health");
/*  29 */       Ui.println("2) Weapons/Ammo");
/*  30 */       Ui.println("3) Body Armour");
/*  31 */       Ui.println("4) XP");
/*  32 */       Ui.println("5) Back");
/*  33 */       Ui.println("-------------------------------------------------------------------");
/*  34 */       switch (Action.getValidInt()) {
/*     */         case 1:
/*  36 */           health();
/*     */         
/*     */         case 2:
/*  39 */           weapons();
/*     */         
/*     */         case 3:
/*  42 */           armour();
/*     */         
/*     */         case 4:
/*  45 */           xp();
/*     */         case 5:
/*     */           break;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void health() {
/*     */     while (true) {
/*  57 */       Action.cls();
/*  58 */       Ui.println("-------------------------------------------------------------------");
/*  59 */       Ui.println("                               Health                              ");
/*  60 */       Ui.println();
/*  61 */       NPC.welcome("Health");
/*  62 */       Ui.println();
/*  63 */       Ui.println("Coins: " + Coins.get());
/*  64 */       Ui.println("First-Aid kits: " + FirstAid.get());
/*  65 */       Ui.println("Potions: " + (Potion.get("survival") + Potion.get("recovery")));
/*  66 */       Ui.println("Insta-Healths: " + InstaHealth.get());
/*  67 */       Ui.println();
/*  68 */       Ui.println("-------------------------------------------------------------------");
/*  69 */       Ui.println("1) FIRST-AID KIT");
/*  70 */       Ui.println("   Price - " + FirstAid.price + " coins");
/*  71 */       Ui.println("   Level - " + FirstAid.level);
/*  72 */       Ui.println();
/*  73 */       Ui.println("2) SURVIVAL POTION");
/*  74 */       Ui.println("   Price - " + Potion.spPrice + " coins");
/*  75 */       Ui.println("   Level - " + Potion.spLevel);
/*  76 */       Ui.println();
/*  77 */       Ui.println("3) RECOVERY POTION");
/*  78 */       Ui.println("   Price - " + Potion.rpPrice + " coins");
/*  79 */       Ui.println("   Level - " + Potion.rpLevel);
/*  80 */       Ui.println();
/*  81 */       Ui.println("4) INSTA-HEALTH");
/*  82 */       Ui.println("   Price - " + InstaHealth.price + " coins");
/*  83 */       Ui.println("   Level - " + InstaHealth.level);
/*  84 */       Ui.println();
/*  85 */       Ui.println("5) Back");
/*  86 */       Ui.println("-------------------------------------------------------------------");
/*  87 */       switch (Action.getValidInt()) {
/*     */         case 1:
/*  89 */           Action.cls();
/*  90 */           FirstAid.buy();
/*  91 */           NPC.gratitude("Health", "purchase");
/*     */         
/*     */         case 2:
/*  94 */           Action.cls();
/*  95 */           Potion.buy("survival");
/*  96 */           NPC.gratitude("Health", "purchase");
/*     */         
/*     */         case 3:
/*  99 */           Action.cls();
/* 100 */           Potion.buy("recovery");
/* 101 */           NPC.gratitude("Health", "purchase");
/*     */         
/*     */         case 4:
/* 104 */           Action.cls();
/* 105 */           InstaHealth.buy();
/* 106 */           NPC.gratitude("Health", "purchase");
/*     */         case 5:
/*     */           break;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static void weapons() {
/*     */     label29: while (true) {
/* 117 */       Action.cls();
/* 118 */       Ui.println("-------------------------------------------------------------------");
/* 119 */       Ui.println("                              Weapons                              ");
/* 120 */       Ui.println();
/* 121 */       NPC.welcome("Weapon");
/* 122 */       Ui.println();
/* 123 */       Ui.println("Coins: " + Coins.get());
/* 124 */       Ui.println("Level: " + Xp.getLevel());
/* 125 */       Ui.println();
/* 126 */       Ui.println("-------------------------------------------------------------------");
/* 127 */       ArrayList<Weapon> buyableWeapons = new ArrayList<>();
/* 128 */       for (int i = 0; i < Weapon.arrayWeapon.size(); i++) {
/* 129 */         if (((Weapon)Weapon.arrayWeapon.get(i)).isBuyable()) {
/* 130 */           Ui.println((buyableWeapons.size() + 1) + ") " + ((Weapon)Weapon.arrayWeapon.get(i)).getName());
/* 131 */           Ui.println("   Price: " + ((Weapon)Weapon.arrayWeapon.get(i)).price);
/* 132 */           Ui.println("   Level: " + ((Weapon)Weapon.arrayWeapon.get(i)).level);
/* 133 */           buyableWeapons.add(Weapon.arrayWeapon.get(i));
/* 134 */           Ui.println();
/*     */         } 
/*     */       } 
/* 137 */       Ui.println((buyableWeapons.size() + 1) + ") POWER");
/* 138 */       Ui.println("   Price: " + Power.price);
/* 139 */       Ui.println("   Level: " + Power.level);
/* 140 */       Ui.println();
/* 141 */       Ui.println((buyableWeapons.size() + 2) + ") AMMO");
/* 142 */       Ui.println();
/* 143 */       Ui.println((buyableWeapons.size() + 3) + ") Back");
/*     */ 
/*     */       
/*     */       while (true) {
/* 147 */         int menuItem = Action.getValidInt();
/*     */ 
/*     */         
/*     */         try {
/* 151 */           ((Weapon)buyableWeapons.get(menuItem - 1)).buy();
/* 152 */           NPC.gratitude("Weapon", "purchase");
/*     */         
/*     */         }
/* 155 */         catch (Exception e) {}
/*     */         continue label29;
/*     */       } 
/*     */     } 
/*     */   }
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
/*     */   private static void xp() {
/*     */     while (true) {
/* 184 */       if (Xp.getLevel() == 100) {
/* 185 */         Action.cls();
/* 186 */         Ui.println("You're already level 100! You cannot buy any more xp.");
/* 187 */         Action.pause();
/*     */         
/*     */         return;
/*     */       } 
/* 191 */       Action.cls();
/* 192 */       Ui.println("-------------------------------------------------------------------");
/* 193 */       Ui.println("                                 XP                                ");
/* 194 */       Ui.println();
/* 195 */       NPC.welcome("XP");
/* 196 */       Ui.println();
/* 197 */       Ui.println("Level: " + Xp.getLevel());
/* 198 */       Ui.println("XP: " + Xp.getFull());
/* 199 */       Ui.println("Coins: " + Coins.get());
/* 200 */       Ui.println();
/* 201 */       Ui.println("You can buy XP for 1 coin per XP. How much would you like to buy?");
/* 202 */       Ui.println("**Enter 0 to go back**");
/* 203 */       Ui.println("-------------------------------------------------------------------");
/*     */       
/* 205 */       int buy = Action.getValidInt();
/* 206 */       boolean valid = true;
/*     */ 
/*     */       
/* 209 */       if (buy > Coins.get()) {
/*     */         
/* 211 */         Action.cls();
/* 212 */         Ui.println("You don't have enough coins to buy this much xp.");
/* 213 */         valid = false;
/* 214 */         Action.pause();
/*     */       } 
/* 216 */       if (Xp.getLevel() == 100) {
/* 217 */         Action.cls();
/* 218 */         Ui.println("You are already level 100; which is the maximum level.");
/* 219 */         valid = false;
/* 220 */         Action.pause();
/*     */       } 
/* 222 */       if (buy < 0) {
/* 223 */         Action.cls();
/* 224 */         Ui.println("You can't buy a negative amount of Xp.. Nice try though ;)");
/* 225 */         valid = false;
/* 226 */         Action.pause();
/*     */       } 
/* 228 */       if (buy == 0) {
/*     */         return;
/*     */       }
/*     */       
/* 232 */       if (valid) {
/* 233 */         Action.cls();
/* 234 */         Ui.println("You have bought " + buy + " xp.");
/* 235 */         Action.pause();
/*     */ 
/*     */         
/* 238 */         Xp.set(buy, true);
/* 239 */         Coins.set(-buy, true);
/* 240 */         Stats.xpBought += buy;
/* 241 */         NPC.gratitude("XP", "purchase");
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static void buyAmmo() {
/*     */     label23: while (true) {
/* 250 */       Action.cls();
/* 251 */       Ui.println("-------------------------------------------------------------------");
/* 252 */       Ui.println("                                Ammo                               ");
/* 253 */       Ui.println();
/* 254 */       Ui.println("Coins: " + Coins.get());
/* 255 */       Ui.println("Level: " + Xp.getLevel());
/* 256 */       Ui.println();
/* 257 */       Ui.println("-------------------------------------------------------------------");
/* 258 */       ArrayList<Weapon> validWeapons = new ArrayList<>();
/* 259 */       for (int i = 0; i < Weapon.arrayWeapon.size(); i++) {
/* 260 */         if (((Weapon)Weapon.arrayWeapon.get(i)).isBuyable() && !((Weapon)Weapon.arrayWeapon.get(i)).melee && ((Weapon)Weapon.arrayWeapon.get(i)).owns()) {
/* 261 */           Ui.println((validWeapons.size() + 1) + ") " + ((Weapon)Weapon.arrayWeapon.get(i)).getName());
/* 262 */           Ui.println("   Price: " + ((Weapon)Weapon.arrayWeapon.get(i)).getAmmoPrice());
/* 263 */           Ui.println("   Level: " + ((Weapon)Weapon.arrayWeapon.get(i)).level);
/* 264 */           validWeapons.add(Weapon.arrayWeapon.get(i));
/*     */         } 
/*     */       } 
/* 267 */       Ui.println((validWeapons.size() + 1) + ") Back");
/*     */ 
/*     */       
/*     */       while (true) {
/* 271 */         int menuItem = Action.getValidInt();
/*     */         
/*     */         try {
/* 274 */           ((Weapon)validWeapons.get(menuItem - 1)).buyAmmo();
/* 275 */           NPC.gratitude("Weapon", "purchase");
/*     */         
/*     */         }
/* 278 */         catch (Exception e) {}
/*     */         continue label23;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void armour() {
/*     */     label21: while (true) {
/* 291 */       Action.cls();
/* 292 */       Ui.println("-------------------------------------------------------------------");
/* 293 */       Ui.println("                            Body Armour                            ");
/* 294 */       Ui.println();
/* 295 */       NPC.welcome("Armour");
/* 296 */       Ui.println();
/* 297 */       Ui.println("Coins: " + Coins.get());
/* 298 */       Ui.println("Level: " + Xp.getLevel());
/* 299 */       Ui.println();
/* 300 */       Ui.println("-------------------------------------------------------------------");
/* 301 */       int j = 1;
/* 302 */       int[] armourShopOffset = new int[Armour.getArmours().size()];
/* 303 */       for (int i = 1; i < Armour.getArmours().size(); i++) {
/* 304 */         if (((Armour)Armour.getArmours().get(i)).getPrice() != 0) {
/* 305 */           Ui.println(j + ") " + ((Armour)Armour.getArmours().get(i)).getName());
/* 306 */           Ui.println("   Price: " + ((Armour)Armour.getArmours().get(i)).getPrice());
/* 307 */           Ui.println("   Level: " + ((Armour)Armour.getArmours().get(i)).getLevel());
/* 308 */           armourShopOffset[j - 1] = i - j - 1;
/* 309 */           j++;
/* 310 */           Ui.println();
/*     */         } 
/*     */       } 
/* 313 */       Ui.println(j + ") Back");
/*     */ 
/*     */       
/*     */       while (true) {
/* 317 */         int menuItem = Action.getValidInt();
/*     */ 
/*     */         
/*     */         try {
/* 321 */           menuItem += armourShopOffset[menuItem];
/* 322 */           ((Armour)Armour.getArmours().get(menuItem)).buy();
/* 323 */           NPC.gratitude("Armour", "purchase");
/*     */         
/*     */         }
/* 326 */         catch (Exception e) {}
/*     */         continue label21;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\main\Shop.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */