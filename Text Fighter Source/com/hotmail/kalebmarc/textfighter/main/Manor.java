package com.hotmail.kalebmarc.textfighter.main;

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
}//end of Manor