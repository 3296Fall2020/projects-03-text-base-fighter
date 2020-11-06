/*     */ package com.hotmail.kalebmarc.textfighter.main;
/*     */ 
/*     */ import com.hotmail.kalebmarc.textfighter.item.Armour;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Ach;
/*     */ 
/*     */ 
/*     */ class Help
/*     */ {
/*     */   public static void view() {
/*     */     while (true) {
/*  11 */       Action.cls();
/*  12 */       Ui.println("------------------------------------------------------------");
/*  13 */       Ui.println("                         HELP MENU                          ");
/*  14 */       Ui.println("Here you can find (almost) all the information you need to");
/*  15 */       Ui.println("know about Text-Fighter.");
/*  16 */       Ui.println("------------------------------------------------------------");
/*  17 */       Ui.println("1) Enemy");
/*  18 */       Ui.println("2) Armour");
/*  19 */       Ui.println("3) Weapon");
/*  20 */       Ui.println("4) Health");
/*  21 */       Ui.println("5) XP");
/*  22 */       Ui.println("6) Cheats");
/*  23 */       Ui.println("7) Achievements");
/*  24 */       Ui.println("8) Back");
/*  25 */       Ui.println("------------------------------------------------------------");
/*  26 */       switch (Action.getValidInt()) {
/*     */         case 1:
/*  28 */           info_enemy();
/*     */         
/*     */         case 2:
/*  31 */           info_armour();
/*     */         
/*     */         case 3:
/*  34 */           info_weapons();
/*     */         
/*     */         case 4:
/*  37 */           info_health();
/*     */         
/*     */         case 5:
/*  40 */           info_xp();
/*     */         
/*     */         case 6:
/*  43 */           info_cheats();
/*     */         
/*     */         case 7:
/*  46 */           info_achs();
/*     */         case 8:
/*     */           break;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static void info_enemy() {
/*     */     while (true) {
/*  56 */       Action.cls();
/*  57 */       Ui.println("------------------------------------------------------------");
/*  58 */       Ui.println("                         ENEMY INFO                         ");
/*  59 */       Ui.println("Which enemy would you like to know about?");
/*  60 */       Ui.println();
/*  61 */       for (int i = 0; i < Enemy.arrayEnemy.size(); i++) {
/*  62 */         Ui.println((i + 1) + ") " + ((Enemy)Enemy.arrayEnemy.get(i)).getName());
/*     */       }
/*  64 */       Ui.println((Enemy.arrayEnemy.size() + 1) + ") Back");
/*  65 */       Ui.println("------------------------------------------------------------");
/*     */       
/*  67 */       int menuItem = Action.getValidInt();
/*     */       
/*     */       try {
/*  70 */         ((Enemy)Enemy.arrayEnemy.get(menuItem - 1)).viewAbout();
/*  71 */       } catch (Exception e) {
/*  72 */         if (menuItem == Enemy.arrayEnemy.size() + 1)
/*  73 */           return;  Ui.println(menuItem + " is not an option.");
/*  74 */         Action.pause();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void info_armour() {
/*     */     while (true) {
/*  81 */       Action.cls();
/*  82 */       Ui.println("--------------------------------------------------");
/*  83 */       Ui.println("                    ARMOUR INFO                   ");
/*  84 */       Ui.println("Which armour type would you like to know about?");
/*  85 */       Ui.println();
/*  86 */       for (int i = 0; i < Armour.getArmours().size(); i++) {
/*  87 */         Ui.println((i + 1) + ") " + ((Armour)Armour.getArmours().get(i)).getName());
/*     */       }
/*  89 */       Ui.println((Armour.getArmours().size() + 1) + ") Back");
/*  90 */       Ui.println("--------------------------------------------------");
/*     */       
/*  92 */       int menuItem = Action.getValidInt();
/*     */       
/*     */       try {
/*  95 */         ((Armour)Armour.getArmours().get(menuItem - 1)).viewAbout();
/*  96 */       } catch (Exception e) {
/*  97 */         if (menuItem == Armour.getArmours().size() + 1)
/*  98 */           return;  Ui.println(menuItem + " is not an option.");
/*  99 */         Action.pause();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void info_weapons() {
/*     */     while (true) {
/* 106 */       Action.cls();
/* 107 */       Ui.println("------------------------------------------------------------");
/* 108 */       Ui.println("                         WEAPON INFO                        ");
/* 109 */       Ui.println("Which weapon would you like to know about?");
/* 110 */       Ui.println();
/* 111 */       for (int i = 0; i < Weapon.arrayWeapon.size(); i++) {
/* 112 */         Ui.println((i + 1) + ") " + ((Weapon)Weapon.arrayWeapon.get(i)).getName());
/*     */       }
/* 114 */       Ui.println((Weapon.arrayWeapon.size() + 1) + ") Back");
/* 115 */       Ui.println("------------------------------------------------------------");
/*     */       
/* 117 */       int menuItem = Action.getValidInt();
/*     */       
/*     */       try {
/* 120 */         ((Weapon)Weapon.arrayWeapon.get(menuItem - 1)).viewAbout();
/* 121 */       } catch (Exception e) {
/* 122 */         if (menuItem == Weapon.arrayWeapon.size() + 1)
/* 123 */           return;  Ui.println(menuItem + " is not an option.");
/* 124 */         Action.pause();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   private static void info_health() {
/* 129 */     Action.cls();
/* 130 */     Ui.println("------------------------------------------------------------");
/* 131 */     Ui.println("                        HEALTH INFO                         ");
/* 132 */     Ui.println("You will start off with 100 health, and you can upgrade your");
/* 133 */     Ui.println("health up to 200. Each upgrade will cost 100 coins on easy, ");
/* 134 */     Ui.println("and 150 coins on hard; and it will upgrade your health by 10.");
/* 135 */     Ui.println("You will be able to upgrade once per level.");
/*     */     
/* 137 */     Ui.println("------------------------------------------------------------");
/* 138 */     Action.pause();
/* 139 */     Ach.viewedHealth = true;
/*     */   }
/*     */   private static void info_xp() {
/* 142 */     Action.cls();
/* 143 */     Ui.println("------------------------------------------------------------");
/* 144 */     Ui.println("                              XP                            ");
/* 145 */     Ui.println("Getting XP levels you up, which unlocks more items to buy.  ");
/* 146 */     Ui.println("You start on level one, and you can get up to level 100.    ");
/* 147 */     Ui.println("You need more and more XP for each level. You start needing ");
/* 148 */     Ui.println("only 500 XP to reach level two, then each level you need 500");
/* 149 */     Ui.println("more. So you need 1000 for level 3, 1500 for level 4, etc.  ");
/* 150 */     Ui.println("Each time you level up, your XP gets reset back to 0. You   ");
/* 151 */     Ui.println("get an achievement for each level you reach up to level 10. ");
/* 152 */     Ui.println("You will also receive 100 coins (or 250 coins when you get  ");
/* 153 */     Ui.println("to level 10) Although you can get up to level 100, once you ");
/* 154 */     Ui.println("get to level 10, there's nothing else to unlock.");
/* 155 */     Ui.println();
/* 156 */     Ui.println("How to get XP..");
/* 157 */     Ui.println("There's a few different ways that you can get XP. The main   ");
/* 158 */     Ui.println("way you get XP is by fighting enemies. For every point of   ");
/* 159 */     Ui.println("damage you deal to an enemy, you get 1 XP. Another way is by");
/* 160 */     Ui.println("buying it. You can buy 1 XP for 1 coin. (You can buy as much");
/* 161 */     Ui.println("as you like/as much as you can afford). You will also get   ");
/* 162 */     Ui.println("100 XP for each achievement you unlock. Using a POWER will  ");
/* 163 */     Ui.println("give you 20 XP");
/* 164 */     Ui.println("------------------------------------------------------------");
/* 165 */     Action.pause();
/* 166 */     Ach.viewedXP = true;
/*     */   }
/*     */   private static void info_cheats() {
/* 169 */     Action.cls();
/* 170 */     Ui.println("------------------------------------------------------------------------");
/* 171 */     Ui.println("                            CHEATS                          ");
/* 172 */     Ui.println("To use a cheat code, make sure to be in the main game menu, ");
/* 173 */     Ui.println("then enter '0'. A star (*) should appear to indicate that   ");
/* 174 */     Ui.println("you can type in a cheat code.                               ");
/* 175 */     Ui.println("WARNING: Using cheats will disable all achievements and the ");
/* 176 */     Ui.println("XP system.                                                  ");
/* 177 */     Ui.println("*Tip: You can lock cheats off in the settings menu to       ");
/* 178 */     Ui.println("      prevent the use of cheats                             ");
/* 179 */     Ui.println();
/* 180 */     Ui.println("List of cheat codes:");
/* 181 */     Ui.println("   Code             | Description");
/* 182 */     Ui.println("                    |            ");
/* 183 */     Ui.println("   moneylover       | Gives you 1000 coins");
/* 184 */     Ui.println("   givemeitall      | Gives you 5000 of every item + all weapons");
/* 185 */     Ui.println("   weaponstash      | Gives you every weapon, and 5000 ammo");
/* 186 */     Ui.println("   nomorepain       | Gives you 1000 First-Aid kits and 500 Insta-Healths");
/* 187 */     Ui.println("   healme           | Sets your health to 100");
/* 188 */     Ui.println("   givemeachallenge | Gives enemy 1000 health");
/* 189 */     Ui.println("   lotsofkills      | Sets kill-streak to 5000");
/* 190 */     Ui.println("   suicide          | Kills you");
/* 191 */     Ui.println("   godmode          | Never dies");
/* 192 */     Ui.println("   loanshark        | Removes current loan");
/* 193 */     Ui.println("------------------------------------------------------------------------");
/* 194 */     Action.pause();
/* 195 */     Ach.viewedCheats = true;
/*     */   }
/*     */   private static void info_achs() {
/* 198 */     Action.cls();
/* 199 */     Ui.println("-------------------------------------------------------------------------");
/* 200 */     Ui.println("                         ACHIEVEMENTS                       ");
/* 201 */     Ui.println("You are rewarded 100 xp for each achievement you get. ");
/* 202 */     Ui.println("If you get all achievements, you will be rewarded with 2500 ");
/* 203 */     Ui.println("coins.");
/* 204 */     Ui.println("");
/* 205 */     Ui.println("List of achievements: ");
/* 206 */     Ui.println("   Achievement            | Description");
/* 207 */     Ui.println("                          | ");
/* 208 */     Ui.println("   Money Maker            | Get 1500 coins");
/* 209 */     Ui.println("   Enemy Slayer           | Kill a total of 100 enemies");
/* 210 */     Ui.println("   First Kill             | Kill one enemy");
/* 211 */     Ui.println("   Time For An Upgrade    | Buy any weapon from the shop");
/* 212 */     for (int i = 0; i < Enemy.arrayEnemy.size(); i++) {
/* 213 */       Ui.print("   Goodbye, " + ((Enemy)Enemy.arrayEnemy.get(i)).getName());
/* 214 */       for (int x = 0; x < 14 - ((Enemy)Enemy.arrayEnemy.get(i)).getName().length(); ) { Ui.print(" "); x++; }
/* 215 */        Ui.println("| Kill a " + ((Enemy)Enemy.arrayEnemy.get(i)).getName());
/*     */     } 
/*     */     
/* 218 */     Ui.println("   Text-Fighter Master    | Get all other achievements");
/* 219 */     Ui.println("   Yay, POWER!            | Use 5 POWERS");
/* 220 */     Ui.println("   Slayer                 | Deal a total of 1000 damage");
/* 221 */     Ui.println("   Nobody's Perfect       | Die");
/* 222 */     Ui.println("   Making Money           | Win 1000 coins altogether in the Casino");
/* 223 */     Ui.println("   Gambling Addiction     | Complete 75 rounds in the Casino");
/* 224 */     Ui.println("   Level 2 Fighter        | Reach level 2");
/* 225 */     Ui.println("   Level 3 Fighter        | Reach level 3");
/* 226 */     Ui.println("   Level 4 Fighter        | Reach level 4");
/* 227 */     Ui.println("   Level 5 Fighter        | Reach level 5");
/* 228 */     Ui.println("   Level 6 Fighter        | Reach level 6");
/* 229 */     Ui.println("   Level 7 Fighter        | Reach level 7");
/* 230 */     Ui.println("   Level 8 Fighter        | Reach level 8");
/* 231 */     Ui.println("   Level 9 Fighter        | Reach level 9");
/* 232 */     Ui.println("   Level 10 Fighter       | Reach level 10");
/* 233 */     Ui.println("   Honest Player          | Lock cheats off");
/* 234 */     Ui.println("   Learning               | Look at every single help page in one session");
/* 235 */     Ui.println("-------------------------------------------------------------------------");
/* 236 */     Action.pause();
/* 237 */     Ach.viewedAchs = true;
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\main\Help.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */