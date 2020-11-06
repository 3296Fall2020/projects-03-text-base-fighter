/*    */ package com.hotmail.kalebmarc.textfighter.main;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class NPC
/*    */ {
/*    */   private static String name;
/*    */   private static String shop;
/*    */   private static final String NAME_HEALTH = "Corinna";
/*    */   private static final String NAME_WEAPON = "Niel";
/*    */   private static final String NAME_XP = "Halette";
/*    */   private static final String NAME_ARMOUR = "Leon";
/*    */   
/*    */   public static String getName(String type) {
/* 19 */     switch (type.toLowerCase())
/*    */     { case "health":
/* 21 */         name = "Corinna";
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 36 */         return name;case "weapon": name = "Niel"; return name;case "xp": name = "Halette"; return name;case "armour": name = "Leon"; return name; }  name = "This shop does not exist."; return name;
/*    */   }
/*    */   
/*    */   public static String getShop(String npc) {
/* 40 */     switch (npc.toLowerCase())
/*    */     { case "corinna":
/* 42 */         shop = "Health";
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 56 */         return shop;case "niel": shop = "Weapon"; return shop;case "halette": shop = "XP"; return shop;case "leon": shop = "Armour"; return shop; }  shop = "This NPC does not exist."; return shop;
/*    */   }
/*    */   
/*    */   public static void setName(String npc) {
/* 60 */     name = npc;
/*    */   }
/*    */   
/*    */   public static void setShop(String type) {
/* 64 */     shop = type;
/*    */   }
/*    */   
/*    */   public static void welcome(String type) {
/* 68 */     Ui.println(getName(type) + ": \n\tWelcome to the " + type + " shop.");
/* 69 */     Ui.println("\tHow can I help you today?");
/*    */   }
/*    */   
/*    */   public static void gratitude(String shop, String type) {
/* 73 */     if (type.toLowerCase().equals("purchase")) {
/* 74 */       Ui.println(getName(shop) + ": \nThank you for your purchase.");
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean hasQuests() {
/* 80 */     return Quest.checkQuestsForNPC(name);
/*    */   }
/*    */ }


/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\main\NPC.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */