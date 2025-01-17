
/*     */ package com.hotmail.kalebmarc.textfighter.main;
/*     */ 
/*     */ import com.hotmail.kalebmarc.textfighter.item.Armour;
/*     */ import com.hotmail.kalebmarc.textfighter.item.Chest;
/*     */ import com.hotmail.kalebmarc.textfighter.item.FirstAid;
/*     */ import com.hotmail.kalebmarc.textfighter.item.InstaHealth;
/*     */ import com.hotmail.kalebmarc.textfighter.item.Power;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Ach;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Coins;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Health;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Potion;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Settings;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Stats;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Xp;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Class;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Mana;
/*     */ import java.util.Scanner;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Game
/*     */ {
/*     */   public static Enemy darkElf;
/*     */   public static Enemy ninja;
/*     */   public static Enemy giantSpider;
/*     */   public static Enemy zombie;
/*     */   public static Enemy goblin;
/*     */   public static Enemy ghost;
/*     */   public static Enemy barbarian;
/*     */   public static Enemy giantAnt;
/*     */   public static Enemy evilUnicorn;
/*     */   public static Enemy ogre;
/*     */   public static Weapon nothing;
/*     */   public static Weapon baseballBat;
/*     */   public static Weapon knife;
/*     */   public static Weapon pipe;
/*     */   public static Weapon pistol;
/*     */   public static Weapon smg;
/*     */   public static Weapon shotgun;
/*     */   public static Weapon rifle;
/*     */   public static Weapon sniper;
/*     */   public static Weapon broadsword;	
/*     */   public static Weapon battleAxe;	
/*     */   public static Weapon dagger;	
/*     */   public static Weapon mace;
/*     */   public static Weapon staff;
/*  41 */   public static Armour none = new Armour("None", 0, 0, 1);
/*  42 */   public static Armour basic = new Armour("Basic", 400, 15, 5);
/*  43 */   public static Armour advanced = new Armour("Advanced", 750, 30, 7);
/*     */   public static Armour knight = new Armour("Knight", 100, 20, 1);	
/*     */   public static Armour warrior = new Armour("Warrior", 100, 10, 1);	
/*     */   public static Armour rogue = new Armour("Rogue", 100, 5, 1);	
/*     */   public static Armour paladin = new Armour("Paladin", 100, 25, 1);
/*     */   public static Armour mage = new Armour("Mage", 100, 5, 1);
/*  45 */   private static final Scanner scan = new Scanner(System.in);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void start() 
			{
/*  52 */     Action.cls();
/*  53 */     Ui.println("____________________________________________");
/*  54 */     Ui.println("|                                           |");
/*  55 */     Ui.println("|       Do you want to load your game       |");
/*  56 */     Ui.println("|            from save file?                |");
/*  57 */     Ui.println("|                                           |");
/*  58 */     Ui.println("| 1) Yes                                    |");
/*  59 */     Ui.println("| 2) No, Start a new game                   |");
/*  60 */     Ui.println("|___________________________________________|");
/*     */     
/*  62 */     int choice = Action.getValidInt();
/*  63 */     switch (choice) 
			{
/*     */       case 1:
/*  65 */         if (SaveAndLoad.load())
/*     */           break; 
/*  67 */       default: 
                    Settings.setDif(getDifficulty(), true, false);
/*  70 */           if (choice != 1) 
					{
/*  71 */           User.promptNameSelection();
/*     */           }
                    	
/*     */     Action.cls();	
/*  53 */     Ui.println("____________________________________________");	
/*  54 */     Ui.println("|                                           |");	
/*  55 */     Ui.println("|            Choose your Class?             |");	
/*  57 */     Ui.println("|                                           |");	
/*  58 */     Ui.println("| 1) Knight                                 |");	
/*  59 */     Ui.println("| 2) Warrior                                |");	
/*  59 */     Ui.println("| 3) Rogue                                  |");	
/*  59 */     Ui.println("| 4) Paladin                                |");	
/*  59 */     Ui.println("| 5) Mage                                   |");	
/*  59 */     Ui.println("| 6) None                                   |");	
/*  60 */     Ui.println("|___________________________________________|");	
/*     */      	
/*     */     switch (Action.getValidInt())
				{	
/*     */       case 1:	
/*     */           Class.choose("Knight", 110, broadsword, 3);	
/*     */           break;	
/*     */       case 2:	
/*     */           Class.choose("Warrior", 85, battleAxe, 4);	
/*     */           break;	
/*     */       case 3:	
/*     */           Class.choose("Rogue", 70, dagger, 5);	
/*     */           break;	
/*     */       case 4:	
/*     */           Class.choose("Paladin", 125, mace, 6);	
/*     */           break;	
/*     */       case 5:	
/*     */           Class.choose("Mage", 75, staff, 7);	
/*     */           break;	
/*     */       case 6:	
/*     */           Class.choose("Deprived", 50, nothing, 0);	
/*     */           break;
/*     */     }	/*     */     
			}//end of switch
/*     */     Class.startingClass();
/*     */     if(Class.getName().equals("Mage")){Mana.set(60, 60);}	
/*  69 */     Enemy.encounterNew();	//}//end of start
/*     */     mainGameplay();  
/*     */     } //end start

/*     */   public static void town() 
			{
/*     */     while (true) 
				{
/* 188 */       Action.cls();
                
/* 189 */       Ui.println("------------------------------------------------------------------");
/* 190 */       Ui.println("                      WELCOME TO THE TOWN                         ");
                Ui.town_pop();
/* 191 */       Ui.println("--Score Info--");
/* 192 */       Ui.println("     Kill Streak: " + Stats.kills);
/* 193 */       Ui.println("     Highest Kill Streak: " + Stats.highScore);
/* 194 */       Ui.println("--Player Info--");
/* 195 */       Ui.println("     Health: " + Health.getStr());
/* 196 */       Ui.println("     Coins: " + Coins.get());
/* 197 */       Ui.println("     First-Aid kits: " + FirstAid.get());
/* 198 */       Ui.println("     Potions: " + (Potion.get("survival") + Potion.get("recovery")));
/* 199 */       Ui.println("     Equipped Weapon: " + Weapon.get().getName());
/* 200 */       Ui.println("------------------------------------------------------------------");
/* 201 */       Ui.println("1) Casino");
/* 202 */       Ui.println("2) Home");
/* 203 */       Ui.println("3) Bank");
/* 204 */       Ui.println("4) Shop");
/* 205 */       Ui.println("5) Upgrade Health");
                Ui.println("6) Bar");
/* 206 */       Ui.println("7) Back");
/* 207 */       Ui.println("------------------------------------------------------------------");
/*     */       
/* 209 */       int menuChoice = Action.getValidInt();
/*     */       
/* 211 */       switch (menuChoice) 
				{
/*     */         case 1:
/* 213 */           Casino.menu();
                    break;
/*     */         
/*     */         case 2:
/* 216 */           home();
                    break;
/*     */         
/*     */         case 3:
/* 219 */           Bank.menu();
                    break;
/*     */         
/*     */         case 4:
/* 222 */           Shop.menu();
                    break;
/*     */         
/*     */         case 5:
/* 225 */           Health.upgrade();
                    break;
/*     */         case 6:
                    Bar.menu();
                  case 7:
/*     */           return;
/*     */       } 
/*     */     }//end while() 
/*     */   }//end of town
/*     */ 
/*     */ public static void battle_hotkey()
			{	
              int fightPath;	
              fightPath = Random.RInt(1,100);	

        if (Weapon.get().getName().equals("Sniper")) 
        {	
            if (fightPath <= 30) Enemy.get().dealDamage(); 	
            if (fightPath > 30) sniper.dealDam();  	
            return;	
        }
        if (Weapon.get().getName().equals("Staff"))
        {
            if(fightPath <= 30) Enemy.get().dealDamage();
            if(fightPath > 30){
                if(Mana.get() >= 20){
                    staff.dealDam();
                    Mana.lose(20);
                } else {
                    System.out.println("You do not have enough mana to cast fireball.");
                }
            }
            Mana.gain(5);
            return;
        }
        if (fightPath <= 50) Enemy.get().dealDamage(); 	
        if (fightPath > 50) Weapon.get().dealDam();	
}//end of hotkey
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void home() 
			{
/*     */     while (true) {
/* 241 */       Action.cls();
                
/* 242 */       Ui.println("------------------------------------------------------------------");
/* 243 */       Ui.println("                          WELCOME HOME                            ");
                Ui.home_pop();
/* 244 */       Ui.println("--Score Info--");
/* 245 */       Ui.println("     Kill Streak: " + Stats.kills);
/* 246 */       Ui.println("     Highest Kill Streak: " + Stats.highScore);
/* 247 */       Ui.println("--Player Info--");
/* 248 */       Ui.println("     Health: " + Health.getStr());
/* 249 */       Ui.println("     Coins: " + Coins.get());
/* 250 */       Ui.println("     First-Aid kits: " + FirstAid.get());
/* 251 */       Ui.println("     Potions: " + (Potion.get("survival") + Potion.get("recovery")));
/* 252 */       Ui.println("     Equipped Weapon: " + Weapon.get().getName());
/* 253 */       Ui.println("------------------------------------------------------------------");
/* 254 */       Ui.println("1) Equip weapon");
/* 255 */       Ui.println("2) Equip Armour");
/* 256 */       Ui.println("3) View Item Chest");
/* 257 */       Ui.println("4) Achievements");
/* 258 */       Ui.println("5) Stats");
/* 259 */       Ui.println("6) About");
/* 260 */       Ui.println("7) Settings");
/* 261 */       Ui.println("8) Help");
/* 262 */       Ui.println("9) Back");
/* 263 */       Ui.println("------------------------------------------------------------------");
/*     */       
/* 265 */       int menuChoice = Action.getValidInt();
/*     */       
/* 267 */       switch (menuChoice) {
/*     */         case 1:
/* 269 */           Weapon.choose();
                    break;
/*     */         
/*     */         case 2:
/* 272 */           Armour.choose();
                    break;
/*     */         
/*     */         case 3:
/* 275 */           Chest.view();
                    break;
/*     */         
/*     */         case 4:
/* 278 */           Ach.view();
                    break;
/*     */         
/*     */         case 5:
/* 281 */           Stats.view();
                    break;
/*     */         
/*     */         case 6:
/* 284 */           About.view(true);
/* 285 */           Ach.viewedAbout = true;
                    break;
/*     */         
/*     */         case 7:
/* 288 */           Settings.menu();
/*     */           break;
/*     */         case 8:
/* 291 */           Help.view();
/*     */           break;
/*     */         case 9:
/*     */           return;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */

    /*-----------------------------------------------------------------------------------------------*/
        public static void estate(){
            while (true) {
                Action.cls();

                Ui.println("------------------------------------------------------------------");
                Ui.println("                 WELCOME TO THE MEIER ESTATE                      ");
                Ui.println("--Score Info--");
                Ui.println("     Kill Streak: " + Stats.kills);
                Ui.println("     Highest Kill Streak: " + Stats.highScore);
                Ui.println("--Player Info--");
                Ui.println("     Health: " + Health.getStr());
                Ui.println("     Coins: " + Coins.get());
                Ui.println("     First-Aid kits: " + FirstAid.get());
                Ui.println("     Potions: " + (Potion.get("survival") + Potion.get("recovery")));
                Ui.println("     Equipped Weapon: " + Weapon.get().getName());
                Ui.println("------------------------------------------------------------------");
                Ui.println("1) Go to the Manor");
                Ui.println("2) Back");
                Ui.println("------------------------------------------------------------------");

                int menuChoice = Action.getValidInt();

                switch(menuChoice){

                    case 1:
                        Manor.menu();
                        break;

                    case 2:
                        return;

                }//end of switch
             }//end of while
            }//end of estate
    /*-----------------------------------------------------------------------------------------------*/
    /*     */
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static String getDifficulty() {
/* 308 */     Action.cls();
/* 309 */     Ui.println("_____________________________________________");
/* 310 */     Ui.println("|                                           |");
/* 311 */     Ui.println("|       What difficulty would you           |");
/* 312 */     Ui.println("|            like to play on?               |");
/* 313 */     Ui.println("|                                           |");
/* 314 */     Ui.println("| 1) Easy                                   |");
/* 315 */     Ui.println("| 2) Hard                                   |");
/* 316 */     Ui.println("|___________________________________________|");
/*     */     
/* 318 */     if (!scan.hasNextInt()) {
/* 319 */       Action.cls();
/* 320 */       return "Easy";
/*     */     } 
/* 322 */     int difficultyChoice = scan.nextInt();
/* 323 */     if (difficultyChoice == 2) {
/* 324 */       Action.cls();
/* 325 */       return "Hard";
/*     */     } 
/* 327 */     Action.cls();
/* 328 */     return "Easy";
/*     */   }//end of getDifficulty
 

/*     */   public static void mainGameplay(){
    /*     */     while (true) {
/*  78 */       if (Stats.kills > Stats.highScore) Stats.highScore = Stats.kills; 
/*  79 */       Ach.check();
/*  80 */       SaveAndLoad.save();
/*  81 */       Action.cls();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  87 */       Ui.println("Text-Fighter " + Version.getFull());
/*  88 */       Ui.println("------------------------------------------------------------------");
/*     */       Ui.Player();
/*  90 */       if (Cheats.enabled()) {
/*  91 */         Ui.println("CHEATS ACTIVATED");
/*     */       }
/*  93 */       Ui.println(Settings.godModeMsg());
/*     */       
/*  95 */       Ui.println("--Score Info--");
/*  96 */       Ui.println("     Level " + Xp.getLevel() + "      " + Xp.getFull());
/*  97 */       Ui.println("     Kill Streak: " + Stats.kills);
/*  98 */       Ui.println("     Highest Kill Streak: " + Stats.highScore);
/*  99 */       Ui.println("--" + User.name() + " the " + Class.getName() + "--");
/* 100 */       Ui.println("     Health: " + Health.getStr());
/*     */       if(Class.getName().equals("Mage")){
/*     */       Ui.println("     Mana: " + Mana.getStr());
/*     */       }
/* 101 */       Ui.println("     Coins: " + Coins.get());
/* 102 */       Ui.println("     First-Aid kits: " + FirstAid.get());
/* 103 */       Ui.println("     Potions: " + (Potion.get("survival") + Potion.get("recovery")));
/* 104 */       Ui.println("     Equipped armour: " + Armour.getEquipped().toString());
/* 105 */       Ui.println("     Equipped Weapon: " + Weapon.get().getName());
/*     */       
/* 107 */       Action.displayAmmo();
/*     */       
/* 109 */       Ui.println("--Enemy Info--");
/* 110 */       Ui.println("     Enemy: " + Enemy.get().getName());
/* 111 */       Ui.println("     Enemy Health: " + Enemy.get().getHeathStr());
/* 112 */       Ui.println("------------------------------------------------------------------");
/* 113 */       Ui.println("1) Go to battle");
/* 114 */       Ui.println("2) Go Home");
/* 115 */       Ui.println("3) Go to the town");
                Ui.println("4) Go to Meier Estate");
/* 116 */       Ui.println("5) Use First-Aid kit");
/* 117 */       Ui.println("6) Use Potion");
/* 118 */       Ui.println("7) Use Insta-Health");
/* 119 */       Ui.println("8) Use POWER");
/* 120 */       Ui.println("9) Quit Game (Game will automatically be saved)");
/* 121 */       Ui.println("------------------------------------------------------------------");
/*     */       
/* 123 */       switch (Action.getValidInt()) {
                  case 1:
/* 125 */           battle_hotkey();
                    int b_loop=0;
                     while(b_loop!=1){
                         Ui.println("press 1 to refight, press 2 to heal, press 3 for more option");
                           switch(Action.getValidInt()){
                                case 1:
                                    battle_hotkey();
                                   continue;
                                case 2:
                                    FirstAid.use();
                                    continue;
                                case 3: 
                                default :
                                    b_loop=1;
                           }
                    }
/*     */         
/*     */         
/*     */         case 2:
/* 136 */           home();
                    break;
/*     */         
/*     */         case 3:
/* 139 */           town();
                    break;

/*     */         case 4:
                    estate();
                    break;

/*     */         case 5:
/* 142 */           FirstAid.use();
/*     */         
/*     */         case 6:
/* 145 */           Action.cls();
/* 146 */           Ui.println("Which potion would you like to use?");
/* 147 */           Ui.println("1) Survival Potion");
/* 148 */           Ui.println("2) Recovery Potion");
/* 149 */           Ui.println("3) Back");
/* 150 */           switch (Action.getValidInt()) {
/*     */             case 1:
/* 152 */               Potion.use("survival");
/*     */               break;
/*     */             case 2:
/* 155 */               Potion.use("recovery");
/*     */               break;
/*     */             
/*     */             case 3:
                        Game.mainGameplay();
/*     */               break;
/*     */           } 
/*     */         
/*     */         
/*     */         case 7:
/* 164 */           InstaHealth.use();
                    break;
/*     */         
/*     */         case 8:
/* 167 */           Power.use();
                    break;
/*     */         
/*     */         case 9:
/*     */           return;
/*     */         case 0:
/* 172 */           Cheats.cheatGateway();
/*     */         
/*     */         case 99:
/* 175 */           Debug.menu();
/*     */       } 
/*     */     } 
}//end of Gameplay
/*     */
}//end of Game
