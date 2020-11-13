/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotmail.kalebmarc.textfighter.main;

import com.hotmail.kalebmarc.textfighter.item.Armour;
import com.hotmail.kalebmarc.textfighter.player.Health;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tutorial {
    private static Scanner scan = new Scanner(System.in);
    
    
    public static void start(){
        Health.set(100, 100);
        Ui.println("Welcome to the tutorial! We're gonna teach you how to fight monsters");
        Ui.println("In this game, you play as an adventuer on a quest to slay monsters, get gold and level up!");
        Enemy.encounterTutorial();
        Ui.println("For now, and the rest of the tutorial, press 1 to continue!");
        int choice;
        do {
        choice = Action.getValidInt();
        switch (choice){
            case 1:
                combatTutorialPart1();
                break;
            default:
                Ui.println("You have to press 1 to continue!");
                break;
                
        } } while (choice != 1);
        
    }
    
    public static void combatTutorialPart1(){
        Weapon tutorialWeapon = new Weapon("fists", true, false, 0, 1, 10, 10, true, false);
        Ui.println("This mean, green goblin machine looks nasty! Luckily, you can fight!");
        Ui.println("Use the fight command to do damage! Press 1 to attack the enemy and enter when the attack finishes!");
        
        int choice;
        do {
        choice = Action.getValidInt();
        switch (choice){
            case 1:
                Weapon.get().dealDam();
                combatTutorialPart2();
                break;
            default:
                Ui.println("You have to press 1 to continue!");
                break;
                
        } } while (choice != 1);
        
    }
    
    public static void combatTutorialPart2(){
        Ui.println("Good work! You did some damage. The total amount of damage you deal is dependent on your current weapon.");
        Ui.println("Of course, since you don't have a weapon right now, you're only going to do weak punches.");
        Ui.println("Now try hitting the goblin again!");
        int choice;
        
        do {
        choice = Action.getValidInt();
        switch (choice){
            case 1:
                Enemy.get().dealDamage();
                combatTutorialPart3();
                break;
            default:
                Ui.println("You have to press 1 to continue!");
                break;
                
        } } while (choice != 1);
    }
    
    public static void combatTutorialPart3(){
        Ui.println("Oh no! The goblin hit you. How did this happen?");
        Ui.println("In this game, there is a fifty-fifty chance that you will hit the enemy or the enemy wil hit you back.");
        Ui.println("Note also that each enemy has a damage range. This goblin is special because he only does five damage. Other enemies could do a lot more.");
        Ui.println("But don't despair, adventuer! With the proper equipment, any foe can be vanquished!");
        Ui.println("Show this goblin whatfor!");
        int choice;
        int finalChoice;
        do {
        choice = Action.getValidInt();
        switch (choice){
            case 1:
                 int fightPath = Random.RInt(1,100);
                 if (fightPath <= 50) {
                    Enemy.get().dealDamage();
                    Ui.println("Oof! Try again!");
                 } else {
                    Weapon.get().dealDam();
                 }
                break;
            default:
                Ui.println("You have to press 1 to continue!");
                break;
                
        } } while (Enemy.get().getHealth() > 0 && Health.get() > 0);
        
        if (Health.get() <= 0){
            Ui.println("Oh no, you died! But don't worry, adventuer. This is just a tutorial!");
            Ui.println("But don't worry adventuer! In the real game, you can heal, use items and get better equipment. You won't lose again!");
        } else {
            Ui.println("You did it! Defeated monsters give you gold to buy items and xp to level up!");
        }
            Ui.println("This concludes the combat tutorial. To return to the main menu, press 1. See ya!");
            
            do {
            finalChoice = Action.getValidInt();
            switch (finalChoice){
                case 1:
                    Menu.load();
                    Action.cls();
                    break;
                default:
                    Ui.println("You have to press 1 to continue!");
                    break;
                
        } } while (finalChoice != 1);
        }
    }
