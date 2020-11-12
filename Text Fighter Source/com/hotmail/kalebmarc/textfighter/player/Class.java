/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotmail.kalebmarc.textfighter.player;

/**
 *
 * @author Nolan
 */
public class Class {
    private static String name;
    
    
    public static void choose(String choice){
        name = choice;
    }
    
    public static String get(){
        return name;
    }
}
