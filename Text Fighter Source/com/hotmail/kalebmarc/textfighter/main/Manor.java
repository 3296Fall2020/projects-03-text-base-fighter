package com.hotmail.kalebmarc.textfighter.main;

import com.hotmail.kalebmarc.textfighter.item.Armour;
import com.hotmail.kalebmarc.textfighter.item.FirstAid;
import com.hotmail.kalebmarc.textfighter.player.*;
import com.hotmail.kalebmarc.textfighter.player.Class;

import java.util.ArrayList;

public class Manor {

    public static void menu() {
        while (true) {
            Action.cls();
            Ui.println("---------------------------------------");
            Ui.println("         WELCOME TO THE MANOR          ");
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println("1) Knock on the Door");
            Ui.println("2) Back");
            Ui.println();
            Ui.println("---------------------------------------");

            int manorMenu = Action.getValidInt();
            switch (manorMenu) {

                case 1:
                    Action.cls();
                    enter();
                    Action.pause();
                    continue;

                case 2:
                    return;
            }//end of switch

        }//end of while
    }//end of menu

    /*-----------------------------------------------------------------------------------------------*/
    //after you knock on the door and enter the manor
    public static void enter() {
        while (true) {
            Action.cls();
            Ui.println("---------------------------------------");
            Ui.println("         WELCOME TO THE MANOR          ");
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println("1) Talk to " + NPC.getName("quest"));
            Ui.println("2) Go to Bedroom 1");
            Ui.println("3) Go to Bedroom 2");
            Ui.println("4) Go to Master Bedroom");
            Ui.println("5) Go to Garden");
            Ui.println("6) Go to Kitchen");
            Ui.println("7) Go to Gallery");
            Ui.println("8) Go to Bathroom");
            Ui.println("9) Go to Library");
            Ui.println("10) Back");
            Ui.println();
            Ui.println("---------------------------------------");

            int manorMenu = Action.getValidInt();
            switch (manorMenu) {

                case 1:
                    NPCMenu();
                    continue;
                case 2:
                    bedroom1();
                    continue;

                case 3:
                    bedroom2();
                    continue;

                case 4:
                    masterBedroom();
                    continue;

                case 5:
                    garden();
                    continue;

                case 6:
                    kitchen();
                    continue;

                case 7:
                    gallery();
                    continue;

                case 8:
                    bathroom();
                    continue;

                case 9:
                    library();
                    continue;

                case 10:
                    return;

            }//end of switch

        }//end of while
    }//end of knock

    /*-----------------------------------------------------------------------------------------------*/
    public static void NPCMenu() {

        while (true) {
            Action.cls();
            Ui.println("---------------------------------------");
            Ui.println("                ENTRANCE               ");
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println("My great grandfather's collection is located in the library.");
            Ui.println("Once in the Library search for a book called the Rogue's Sanctuary.");
            Ui.println("Good Luck.");
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println("1) You're not going to join me?");
            Ui.println("2) Back");
            Ui.println();
            Ui.println("---------------------------------------");

            int choiceMenu = Action.getValidInt();
            switch (choiceMenu) {

                case 1:
                    Action.cls();
                    Ui.println("Unfortunately, I must deal with separate matter, but I shall return");
                    Action.pause();
                    continue;

                case 2:
                    return;

            }//end of switch

        }//end of while
    }//end of NPCMenu

    /*-----------------------------------------------------------------------------------------------*/
    public static void bedroom1() {

        while (true) {
            Action.cls();
            Ui.println("---------------------------------------");
            Ui.println("                BEDROOM  1             ");
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println("Really nothing in here except for a bed");
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println("1) Take a nap");
            Ui.println("2) Back");
            Ui.println();
            Ui.println("---------------------------------------");

            int choiceMenu = Action.getValidInt();
            switch (choiceMenu) {

                case 1:
                    Action.cls();
                    Ui.println("zzzzzzzzzzzz");
                    Action.pause();
                    continue;

                case 2:
                    return;

            }//end of switch

        }//end of while
    }//end of bathroom1

    /*-----------------------------------------------------------------------------------------------*/
    public static void bedroom2() {

        while (true) {
            Action.cls();
            Ui.println("---------------------------------------");
            Ui.println("                BEDROOM  2             ");
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println("Really nothing in here except for a bed");
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println("1) Take a nap");
            Ui.println("2) Back");
            Ui.println();
            Ui.println("---------------------------------------");

            int choiceMenu = Action.getValidInt();
            switch (choiceMenu) {

                case 1:
                    Action.cls();
                    Ui.println("zzzzzzzzzzzz");
                    Action.pause();
                    continue;

                case 2:
                    return;

            }//end of switch

        }//end of while
    }//end of bathroom2

    /*-----------------------------------------------------------------------------------------------*/
    public static void masterBedroom() {

        while (true) {
            Action.cls();
            Ui.println("---------------------------------------");
            Ui.println("            MASTER BEDROOM             ");
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println("Really nothing in here except for a big bed");
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println("1) Take a nap");
            Ui.println("2) Back");
            Ui.println();
            Ui.println("---------------------------------------");

            int choiceMenu = Action.getValidInt();
            switch (choiceMenu) {

                case 1:
                    Action.cls();
                    Ui.println("ZZZZZZZZZZZ");
                    Action.pause();
                    continue;

                case 2:
                    return;

            }//end of switch

        }//end of while
    }//end of masterbedroom

    /*-----------------------------------------------------------------------------------------------*/
    public static void garden() {

        while (true) {
            Action.cls();
            Ui.println("---------------------------------------");
            Ui.println("                GARDEN                 ");
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println("The garden is filled with beautiful flowers");
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println("1) Smell the flowers");
            Ui.println("2) Back");
            Ui.println();
            Ui.println("---------------------------------------");

            int choiceMenu = Action.getValidInt();
            switch (choiceMenu) {

                case 1:
                    Action.cls();
                    Ui.println("They smell wonderful");
                    Action.pause();
                    continue;

                case 2:
                    return;

            }//end of switch

        }//end of while
    } //end of garden
    /*-----------------------------------------------------------------------------------------------*/
    public static void kitchen(){

         while (true) {
            Action.cls();
            Ui.println("---------------------------------------");
            Ui.println("                KITCHEN                ");
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println("Nice kitchen");
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println("1) Make a sandwich");
            Ui.println("2) Back");
            Ui.println();
            Ui.println("---------------------------------------");

            int choiceMenu = Action.getValidInt();
            switch (choiceMenu) {

                case 1:
                    Action.cls();
                    Ui.println("They don't have the ingredients to make a sandwich");
                    Action.pause();
                    continue;

                case 2:
                    return;

            }//end of switch

        }//end of while
    }//end of kitchen

    /*-----------------------------------------------------------------------------------------------*/
    public static void gallery(){

        while (true) {
            Action.cls();
            Ui.println("---------------------------------------");
            Ui.println("                GALLERY                ");
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println("You see a painting");
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println("1) Take a closer look at the painting");
            Ui.println("2) Back");
            Ui.println();
            Ui.println("---------------------------------------");

            int choiceMenu = Action.getValidInt();
            switch (choiceMenu) {

                case 1:
                    Action.cls();
                    Ui.println("It seems to be Auto's great grandfather Sage Meier");
                    Action.pause();
                    continue;

                case 2:
                    return;

            }//end of switch

        }//end of while
    }//end of gallery
    /*-----------------------------------------------------------------------------------------------*/
    public static void bathroom(){

        while (true) {
            Action.cls();
            Ui.println("---------------------------------------");
            Ui.println("                BATHROOM               ");
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println("It's a nice bathroom");
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println("1) Urinate in the toilet");
            Ui.println("2) Defecate in the toilet");
            Ui.println("3) Wash your hands");
            Ui.println("4) Back");
            Ui.println();
            Ui.println("---------------------------------------");

            int choiceMenu = Action.getValidInt();
            switch (choiceMenu) {

                case 1:
                    Action.cls();
                    Ui.println("You feel relieved");
                    Action.pause();
                    continue;

                case 2:
                    Action.cls();
                    Ui.println("You clogged the toilet.");
                    Ui.println("UH-OH!");
                    Ui.println("SHH! it was not your fault");
                    Action.pause();
                    continue;

                case 3:
                    Action.cls();
                    Ui.println("Good for you being hygienic! Gold star!");
                    Action.pause();
                    continue;

                case 4:
                    return;

            }//end of switch

        }//end of while

    }//end of bathroom
    /*-----------------------------------------------------------------------------------------------*/
    public static void library(){

        while (true) {
            Action.cls();
            Ui.println("---------------------------------------");
            Ui.println("                LIBRARY                ");
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println("There are lots of books");
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println("1) Look on the left side");
            Ui.println("2) Look on the right side");
            Ui.println("3) Back");
            Ui.println();
            Ui.println("---------------------------------------");

            int choiceMenu = Action.getValidInt();
            switch (choiceMenu) {

                case 1:
                    left();
                    continue;

                case 2:
                    right();
                    continue;

                case 3:
                    return;

            }//end of switch

        }//end of while
    }//end of library
    /*-----------------------------------------------------------------------------------------------*/
    //this is for the left side of the library
    public static void left(){

        while (true) {
            Action.cls();
            Ui.println("---------------------------------------");
            Ui.println("                LIBRARY                ");
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println("There are lots of books.Three of them stands out");
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println("1) Gamble of Acheron");
            Ui.println("2) The Prey in the Vale");
            Ui.println("3) The Bloodless Academy");
            Ui.println("4) Back");
            Ui.println();
            Ui.println("---------------------------------------");

            int choiceMenu = Action.getValidInt();
            switch (choiceMenu) {

                case 1:
                    Action.cls();
                    Ui.println("A story of a ruler who sells his homeland");
                    Action.pause();
                    continue;

                case 2:
                    Action.cls();
                    Ui.println("A sweet story of how a crow and human boy become friends");
                    Action.pause();
                    continue;

                case 3:
                    Action.cls();
                    Ui.println("With their history of bloodshed, the Academy tries to have students");
                    Ui.println("kill with no blood traces");
                    Action.pause();
                    continue;

                case 4:
                    return;

            }//end of switch

        }//end of while
    }//end of left
    /*-----------------------------------------------------------------------------------------------*/

    //this is for the right side of the library
    public static void right(){

        while (true) {
            Action.cls();
            Ui.println("---------------------------------------");
            Ui.println("                LIBRARY                ");
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println("There are lots of books.Three of them stands out");
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println("1) The Summer Flame");
            Ui.println("2) The Blood in the Fog");
            Ui.println("3) Rogue's Sanctuary");
            Ui.println("4) Back");
            Ui.println();
            Ui.println("---------------------------------------");

            int choiceMenu = Action.getValidInt();
            switch (choiceMenu) {

                case 1:
                    Action.cls();
                    Ui.println("A story of the flaming war that took place in the summer of 420");
                    Action.pause();
                    continue;

                case 2:
                    Action.cls();
                    Ui.println("The mysterious fog that led to many murders");
                    Action.pause();
                    continue;

                case 3:
                    rogueS();
                    continue;

                case 4:
                    return;

            }//end of switch

        }//end of while
    }//end of right
    /*-----------------------------------------------------------------------------------------------*/
    public static void rogueS(){

        while (true) {
            Action.cls();
            Ui.println("---------------------------------------");
            Ui.println("              PANIC ROOM               ");
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println("You picked up the book and opened the door to the Panic room.");
            Ui.println("This seems to be a place where Auto's great grandfather keeps his collection");
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println("1) Look around");
            Ui.println("2) Back");
            Ui.println();
            Ui.println("---------------------------------------");

            int choiceMenu = Action.getValidInt();
            switch (choiceMenu) {

                case 1:
                    rareWeapons();
                    continue;

                case 2:
                    return;

            }//end of switch

        }//end of while
    }//end of rougueS

    /*-----------------------------------------------------------------------------------------------*/
    //creating a rare items
    private static void rareWeapons(){



        while (true) {
            Action.cls();
            Ui.println("---------------------------------------");
            Ui.println("                PANIC ROOM             ");
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println("Choose one rare weapon you would like to equip");
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println("1) Scythe");
            Ui.println("2) Fire Sword");
            Ui.println("3) Morning Star");
            Ui.println("4) Back");
            Ui.println();
            Ui.println("---------------------------------------");

            int choiceMenu = Action.getValidInt();

            switch(choiceMenu) {

                case 1:
                    Weapon scythe = new Weapon("Scythe",true,false, 0, 5, 5, 12, true, true);
                    Action.cls();
                    Ui.println("You now equipped "+scythe.getName());
                    Action.pause();
                    fightBoss();
                    break;



                case 2:
                    Weapon fireSword = new Weapon("Fire Sword",true,false, 0, 5, 2, 13, true, true);
                    Action.cls();
                    Ui.println("You now equipped "+fireSword.getName());
                    Action.pause();
                    fightBoss();

                    break;

                case 3:
                    Weapon morningStar = new Weapon("Morning Star",true,false, 0, 5, 3, 15, true, true);
                    Action.cls();
                    Ui.println("You now equipped "+morningStar.getName());
                    Action.pause();
                    fightBoss();

                    break;

                case 4:
                    return;
            }//end of switch


        }//end of while
    }//end of rareWeapons

    /*-----------------------------------------------------------------------------------------------*/
    public static void fightBoss(){

        Enemy.encounterBoss();

        while (true) {
            Action.cls();
            Ui.println("---------------------------------------");
            Ui.println("         DISPLACER BEAST (BOSS)        ");
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println("--Score Info--");
            Ui.println("     Level " + Xp.getLevel() + "      " + Xp.getFull());
            Ui.println("     Kill Streak: " + Stats.kills);
            Ui.println("     Highest Kill Streak: " + Stats.highScore);
            Ui.println("--" + User.name() + " the " + Class.getName() + "--");
            Ui.println("     Health: " + Health.getStr());
            Ui.println("     Coins: " + Coins.get());
            Ui.println("     First-Aid kits: " + FirstAid.get());
            Ui.println("     Potions: " + (Potion.get("survival") + Potion.get("recovery")));
            Ui.println("     Equipped armour: " + Armour.getEquipped().toString());
            Ui.println("     Equipped Weapon: " + Weapon.get().getName());
            Ui.println("--Enemy Info--");
            Ui.println("     Enemy: " + Enemy.get().getName());
            Ui.println("     Enemy Health: " + Enemy.get().getHeathStr());
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println("1) Attack");
            Ui.println("2) First Aid Kit");
            Ui.println("3) Potion");
            Ui.println("4) Back");
            Ui.println();
            Ui.println("---------------------------------------");


            int choiceMenu = Action.getValidInt();

            switch(choiceMenu) {

                case 1:

                    if((Health.get() > 0) && (Enemy.get().getHealth() > 0)) {
                            Enemy.get().dealDamage();
                            Weapon.get().dealDam();
                    }//end of if


                    continue;

                case 2:
                    Action.cls();
                    FirstAid.use();
                    Action.pause();
                    continue;

                case 3:
                    Action.cls();
                    Ui.println("Which potion would you like to use?");
                    Ui.println("1) Survival Potion");
                    Ui.println("2) Recovery Potion");
                    Ui.println("3) Back");
                    switch (Action.getValidInt()) {
                        case 1:
                            Potion.use("survival");
                            continue;
                        case 2:
                            Potion.use("recovery");
                            continue;

                        case 3:
                            continue;

                        }//end of switch
                        break;

                case 4:
                    library();
                    return;
            }//end of switch

        }//end of while

    }//end of fightBoss
    /*-----------------------------------------------------------------------------------------------*/
    public static void ending(){

        while (true) {
            Action.cls();
            Ui.println("---------------------------------------");
            Ui.println("                  AUTO                 ");
            Ui.println();
            Ui.println(" QUEST COMPLETED");
            Ui.println();
            Ui.println();
            Ui.println("--Score Info--");
            Ui.println("     Level " + Xp.getLevel() + "      " + Xp.getFull());
            Ui.println("     Kill Streak: " + Stats.kills);
            Ui.println("     Highest Kill Streak: " + Stats.highScore);
            Ui.println("--" + User.name() + " the " + Class.getName() + "--");
            Ui.println("     Health: " + Health.getStr());
            Ui.println("     Coins: " + Coins.get());
            Ui.println("     First-Aid kits: " + FirstAid.get());
            Ui.println("     Potions: " + (Potion.get("survival") + Potion.get("recovery")));
            Ui.println("     Equipped armour: " + Armour.getEquipped().toString());
            Ui.println("     Equipped Weapon: " + Weapon.get().getName());
            Ui.println();
            Ui.println();
            Ui.println();
            Ui.println("Thank you so much, as a thanks please take the weapon as my gratitude");
            Ui.println();
            Ui.println();
            Ui.println("1) Woo");
            Ui.println("2) Back");
            Ui.println();
            Ui.println("---------------------------------------");


            int choiceMenu = Action.getValidInt();

            switch(choiceMenu) {

                case 1:
                  Action.cls();
                  Ui.println("");
                  Action.pause();
                  continue;

                case 2:
                    library();
                    return;
            }//end of switch


        }//end of while
    }//end of ending

}//end of Manor