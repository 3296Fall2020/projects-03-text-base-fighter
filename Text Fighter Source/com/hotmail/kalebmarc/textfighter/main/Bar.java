package com.hotmail.kalebmarc.textfighter.main;

import com.hotmail.kalebmarc.textfighter.player.Coins;
//Edited by: Aley Chaing
// 12 November 2020 21:13

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
            Ui.println("2) Talk to "+NPC.getName("quest"));
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
                NPCmenu();

                case 3:
                    return;
            }//end of switch

        }//end of while
    }//end of menu
/*-------------------------------------------------------------------------------------------------------*/
        //Making a seperate menu for the NPC
        public static void NPCmenu(){
            while(true){
                Action.cls();
                Ui.println("---------------------------------------");
                Ui.println("               "+NPC.getName("quest"));
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
                Ui.println("1) Say hi");
                Ui.println("2) Ask him about his day.");
                Ui.println("3) Back");
                Ui.println();
                Ui.println("---------------------------------------");

                int conMenu = Action.getValidInt();
                switch(conMenu){

                    case 1:
                        Action.cls();
                        Ui.println("Hello stranger");
                        Action.pause();
                        continue;

                    case 2:
                        backstory();

                    case 3:
                        return;

                }//end of switch
            }//end of while
        }//end of NPCmenu
    /*-------------------------------------------------------------------------------------------------------*/
    //this is for the options for the user to choose to listen to his backstory
        public static void backstory(){
            while(true){
                Action.cls();
                Ui.println("---------------------------------------");
                Ui.println("               "+NPC.getName("quest"));
                Ui.println();
                Ui.println();
                Ui.println();
                Ui.println();
                Ui.println();
                Ui.println();
                Ui.println("Actually it's not going too well");
                Ui.println("Would you like to listen to my story?");
                Ui.println();
                Ui.println();
                Ui.println();
                Ui.println("1) Yes");
                Ui.println("2) No");
                Ui.println("3) Back");
                Ui.println();
                Ui.println("---------------------------------------");

                int reply = Action.getValidInt();
                switch(reply){

                    case 1:
                        while(true) {
                            Action.cls();
                            Ui.println("First I need to give you a background of where it all began.");
                            Ui.println("During the World War in the year 700 my great grandfather was a general for Sector X.");
                            Ui.println("Due to the massive amount of deaths my great grandfather was given weapons and items from the fallen");
                            Ui.println("After the war, His Majesty awarded him with a lavish manor to reside and spend the rest of his days how he pleases.");
                            Ui.println("My great grandfather lived a secluded and quiet lifestyle.");
                            Ui.println("He passed within the last week and in his will he left me with his manor and his collection.");
                            Ui.println("Apparently, nowadays his entire collection is considered rare either in worth or power");
                            Ui.println("For the past few days of living in the manor I've had people try and break into the manor.");
                            Ui.println("There was once a sniper, who tried to shoot me through the window.");
                            Ui.println("Everyday, I fear for my life. I need help protect the manor and my great grandfather's treasure");
                            Ui.println();
                            Ui.println();
                            Ui.println("Would you like to help me?");
                            Ui.println();
                            Ui.println();
                            Ui.println("1) Yes");
                            Ui.println("2) No");

                            int response = Action.getValidInt();
                            switch(response){

                                case 1:
                                    Action.cls();
                                    Ui.println("Thank you so much! Let's meet at the Manor.");
                                    Action.pause();
                                    return;

                                case 2:
                                    Action.cls();
                                    Ui.println("Ok, well thanks for listening");
                                    Action.pause();
                                    return;
                            }//end of switch
                            //response();
                        }//end of while
                    case 2:
                        Action.cls();
                        Ui.println("It's alright. It was nice talking to you.");
                        Action.pause();
                        continue;
                    case 3:
                        return;

                }//end of switch
            }//end of while
        }//end of backstory
    /*-------------------------------------------------------------------------------------------------------*/
}//end of Bar class
