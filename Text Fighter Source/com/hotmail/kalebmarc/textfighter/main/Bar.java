package com.hotmail.kalebmarc.textfighter.main;

import com.hotmail.kalebmarc.textfighter.player.Coins;

//bar to begin the quest for the NPC
public class Bar {

    public static void menu(){
        while(true){
            Action.cls();
            Ui.println("---------------------------------------");
            Ui.println("                BAR              ");
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
            Ui.println("1) Get a drink");
            Ui.println("2) Talk to Auto");
            Ui.println("3) Back");
            Ui.println();
            Ui.println("---------------------------------------");

            int barMenu = Action.getValidInt();
            switch (barMenu){

                case 1:
                    Action.cls();
                    Ui.println("Sorry, no drinks for today");
                    Action.pause();
                    continue;

                case 2:
                    Action.cls();



                case 3:
                    return;
            }//end of switch

        }//end of while
    }//end of menu
/*-------------------------------------------------------------------------------------------------------*/

}//end of Bar class
