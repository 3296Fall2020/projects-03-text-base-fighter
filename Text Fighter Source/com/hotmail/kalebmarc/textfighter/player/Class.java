/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotmail.kalebmarc.textfighter.player;

import com.hotmail.kalebmarc.textfighter.main.Weapon;
import com.hotmail.kalebmarc.textfighter.item.Armour;

/**
 *
 * @author Nolan
 */
public class Class {
    private static String name;
    private static int classHealth;
    private static Weapon classWeapon;
    private static int classArmour;
    
    
    public static void choose(String choice, int health, Weapon weapon, int armour){
        name = choice;
        classHealth = health;
        classWeapon = weapon;
        classArmour = armour;
    }
    
    public static String getName(){
        return name;
    }

    public static void startingClass(){
        setHealth();
        setWeapon();
        setArmour();
    }

    public static void setHealth(){
        Health.set(classHealth, classHealth);
    }

    public static void setWeapon(){
        Weapon.set(classWeapon);
    }

    public static void setArmour(){
        Armour.set(classArmour);
    }
}
