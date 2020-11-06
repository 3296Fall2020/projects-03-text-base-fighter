/*     */ package com.hotmail.kalebmarc.textfighter.main;
/*     */ 
/*     */ import com.hotmail.kalebmarc.textfighter.player.Health;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ public class Food
/*     */ {
/*     */   private String name;
/*     */   private String desc;
/*  11 */   private int quantity = 3;
/*     */   
/*     */   private StatusEffect.type statusEffect;
/*     */   
/*     */   private int effectLevel;
/*     */   
/*     */   private type foodType;
/*     */   
/*     */   private boolean viewedAbout;
/*  20 */   public static final ArrayList<Food> arrayFood = new ArrayList<>();
/*     */   
/*     */   public Food(String name, String desc, StatusEffect.type statusEffect, type foodType, int effectLevel) {
/*  23 */     this.name = name;
/*  24 */     this.desc = desc;
/*  25 */     this.statusEffect = statusEffect;
/*  26 */     this.foodType = foodType;
/*  27 */     this.effectLevel = effectLevel;
/*  28 */     arrayFood.add(this);

/*     */   }
/*     */   public String getName() {
/*  31 */     return this.name;
/*     */   }
/*     */   public int getEffectLevel() {
/*  34 */     return this.effectLevel;
/*     */   }
/*     */   public StatusEffect.type getStatusEffect() {
/*  37 */     return this.statusEffect;
/*     */   }
/*     */   public int getQuantity() {
/*  40 */     return this.quantity;
/*     */   }
/*     */   public void eat() {
/*  43 */     Action.cls();
/*  44 */     Ui.println("You have ate a " + getName());
/*  45 */     Ui.println("You've gained " + this.effectLevel + " " + this.statusEffect.toString() + " points.");
/*  46 */     this.quantity--;
/*  47 */     Action.pause();
/*     */     
/*  49 */     switch (this.statusEffect) {
/*     */       case HEALTH:
/*  51 */         Health.gain(this.effectLevel);
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void viewAbout() {
/*  66 */     int BORDER_LENGTH = 39;
/*     */ 
/*     */     
/*  69 */     Action.cls(); int i;
/*  70 */     for (i = 0; i < 39; ) { Ui.print("-"); i++; }
/*  71 */      Ui.println();
/*  72 */     for (i = 0; i < 19 - getName().length() / 2; ) { Ui.print(" "); i++; }
/*  73 */      Ui.println(getName());
/*  74 */     Ui.println(this.desc);
/*  75 */     Ui.println("Category: " + this.foodType.toString());
/*  76 */     Ui.println("Status effect type: " + this.statusEffect.toString());
/*  77 */     Ui.println("Status effect level: " + getEffectLevel());
/*  78 */     for (i = 0; i < 39; ) { Ui.print("-"); i++; }
/*  79 */      Action.pause();
/*  80 */     Action.cls();
/*     */     
/*  82 */     setViewed(true);
/*     */   }
/*     */   public boolean viewedAbout() {
/*  85 */     return this.viewedAbout;
/*     */   }
/*     */   public void setViewed(boolean v) {
/*  88 */     this.viewedAbout = v;
/*     */   }
/*     */   
/*     */   public static void list() {
/*     */     while (true) {
/*  93 */       Action.cls();
/*  94 */       int j = 0;
/*  95 */       int[] offset = new int[arrayFood.size()];
/*  96 */       for (int i = 0; i < arrayFood.size(); i++) {
/*  97 */         if (((Food)arrayFood.get(i)).quantity > 0) {
/*  98 */           Ui.println((j + 1) + ") " + ((Food)arrayFood.get(i)).getName() + "(" + ((Food)arrayFood.get(i)).quantity + ")");
/*  99 */           offset[j] = i - j;
/* 100 */           j++;
/*     */         } 
/*     */       } 
/* 103 */       Ui.println((j + 1) + ") Back");
/*     */ 
/*     */       
/* 106 */       int choice = 0;
/*     */       do {
/* 108 */         choice = Action.getValidInt() - 1 + offset[choice];
/* 109 */       } while (choice < 0 || choice > arrayFood.size());
/*     */ 
/*     */       
/* 112 */       if (choice >= arrayFood.size())
/*     */         return; 
/* 114 */       if (((Food)arrayFood.get(choice)).quantity > 0) {
/* 115 */         ((Food)arrayFood.get(choice)).eat();
/*     */         return;
/*     */       } 
/* 118 */       Action.cls();
/* 119 */       Ui.println("You don't have this food.");
/* 120 */       Action.pause();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public enum type
/*     */   {
/* 127 */     MEAT_FISH,
/* 128 */     MEAT_OTHER,
/* 129 */     FRUIT,
/* 130 */     OTHER;
/*     */ 
/*     */     
/*     */     public String toString() {
/* 134 */       String effectString = super.toString();
/* 135 */       effectString = effectString.replace("_", " ");
/* 136 */       effectString = effectString.replace("MEAT", "");
/* 137 */       effectString = effectString.trim();
/* 138 */       return effectString.substring(0, 1) + effectString.substring(1).toLowerCase();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\main\Food.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */