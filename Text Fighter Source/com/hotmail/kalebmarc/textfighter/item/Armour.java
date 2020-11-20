/*     */ package com.hotmail.kalebmarc.textfighter.item;
/*     */ 
/*     */ import com.hotmail.kalebmarc.textfighter.main.Action;
import com.hotmail.kalebmarc.textfighter.main.Enemy;
/*     */ import com.hotmail.kalebmarc.textfighter.main.Handle;
/*     */ import com.hotmail.kalebmarc.textfighter.main.Ui;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Coins;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Xp;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ public class Armour
/*     */ {
/*     */   private String name;
/*     */   private int price;
/*     */   private int damResist;
/*     */   private int level;
/*     */   private boolean owns;
/*     */   private boolean equipped;
/*     */   private boolean viewed;
/*  20 */   private static ArrayList<Armour> armours = new ArrayList<>(5);
/*     */   
/*     */   public Armour(String name, int price, int damResist, int level) {
/*  23 */     this.name = name;
/*  24 */     this.price = price;
/*  25 */     this.damResist = damResist;
/*  26 */     this.level = level;
/*  27 */     armours.add(this);
/*     */   }
/*     */   public void setName(String name) {
/*  30 */     if (name.equals(""))
/*  31 */       return;  this.name = name;
/*     */   }
/*     */   public String getName() {
/*  34 */     return this.name;
/*     */   }
/*     */   public void setPrice(int price) {
/*  37 */     this.price = price;
/*     */   }
/*     */   public int getPrice() {
/*  40 */     return this.price;
/*     */   }
/*     */   public void setDamResist(int damResist) {
/*  43 */     this.damResist = damResist;
/*     */   }
/*     */   public int getDamResist() {
/*  46 */     return this.damResist;
/*     */   }
/*     */   public void setLevel(int level) {
/*  49 */     this.level = level;
/*     */   }
/*     */   public int getLevel() {
/*  52 */     return this.level;
/*     */   }
/*     */   public void setOwns(boolean owns) {
/*  55 */     this.owns = owns;
/*     */   }
/*     */   public boolean isOwns() {
/*  58 */     return this.owns;
/*     */   }
/*     */   public boolean isEquipped() {
/*  61 */     return this.equipped;
/*     */   }
/*     */   public void equip() {
/*  64 */     if (!this.owns) {
/*  65 */       Action.cls();
/*  66 */       Ui.println("You do not own this.");
/*  67 */       Action.pause();
/*     */       
/*     */       return;
/*     */     } 
/*  71 */     this.equipped = true;
/*  72 */     getEquipped().unequip();
/*  73 */     this.equipped = true;
/*  74 */     Action.cls();
/*  75 */     Ui.println("You have equipped " + toString());
/*  76 */     Action.pause();
/*     */   }
/*     */   public void equipSilent() {
/*  79 */     if (!this.owns) {
/*     */       return;
/*     */     }
/*  82 */     this.equipped = true;
/*  83 */     getEquipped().unequip();
/*  84 */     this.equipped = true;
/*     */   }
/*     */   public void unequip() {
/*  87 */     this.equipped = false;
/*     */   }
/*     */   public static Armour getEquipped() {
/*  90 */     for (Armour i : armours) {
/*  91 */       if (i.isEquipped()) return i; 
/*     */     }
              if (Enemy.get().getName().equals("goblin") && Enemy.get().getDamageMin() == 5 && Enemy.get().getDamageMax()== 5){
                  return null;
              }
/*  93 */     Handle.error("Error - No armour equipped");
/*  94 */     return null;
/*     */   }
/*     */   public static ArrayList<Armour> getArmours() {
/*  97 */     return armours;
/*     */   }
/*     */   public String toString() {
/* 100 */     if (getName().equals("None")) return "No armour"; 
/* 101 */     return getName() + " armour";
/*     */   }
/*     */   public boolean buy() {
/* 104 */     if (Xp.getLevel() < getLevel()) {
/* 105 */       Ui.println("You have to be at least level " + getLevel() + " to buy this!");
/* 106 */       Action.pause();
/* 107 */       return false;
/* 108 */     }  if (isOwns()) {
/* 109 */       Ui.println("You already own this.");
/* 110 */       Action.pause();
/* 111 */       return false;
/* 112 */     }  if (getPrice() <= Coins.get()) {
/* 113 */       Coins.set(-this.price, true);
/* 114 */       setOwns(true);
/* 115 */       equip();
/* 116 */       Ui.println("Thank you for your purchase. Come again soon! ");
/* 117 */       Action.pause();
/* 118 */       return true;
/*     */     } 
/* 120 */     Ui.println("You do not have enough coins.");
/* 121 */     Action.pause();
/* 122 */     return false;
/*     */   }
/*     */   
/*     */   public static int get() {
/* 126 */     return armours.indexOf(getEquipped());
/*     */   }
/*     */   public static void set(int i) {
/* 129 */     ((Armour)armours.get(i)).equipped = true;
/*     */   }
/*     */   
/*     */   public void viewAbout() {
/* 133 */     int BORDER_LENGTH = 39;
/*     */ 
/*     */     
/* 136 */     Action.cls(); int i;
/* 137 */     for (i = 0; i < 39; ) { Ui.print("-"); i++; }
/* 138 */      Ui.println();
/* 139 */     for (i = 0; i < 19 - getName().length() / 2; ) { Ui.print(" "); i++; }
/* 140 */      Ui.println(toString());
/* 141 */     Ui.println("Price: " + this.price + " coins");
/* 142 */     Ui.println("Damage Resistance(%): " + this.damResist + "%");
/* 143 */     Ui.println("Level needed: " + this.level);
/* 144 */     for (i = 0; i < 39; ) { Ui.print("-"); i++; }
/* 145 */      Action.pause();
/* 146 */     Action.cls();
/*     */     
/* 148 */     setViewed(true);
/*     */   }
/*     */   public void setViewed(boolean viewed) {
/* 151 */     this.viewed = viewed;
/*     */   }
/*     */   public boolean getViewed() {
/* 154 */     return this.viewed;
/*     */   } public static void choose() {
/*     */     while (true) {
/*     */       int choice;
/* 158 */       Action.cls();
/* 159 */       Ui.println("----------------------------");
/* 160 */       Ui.println("Equip new armour");
/* 161 */       Ui.println();
/* 162 */       Ui.println("Equipped: " + getEquipped().toString());
/* 163 */       Ui.println("----------------------------");
/* 164 */       int j = 0;
/* 165 */       int[] offset = new int[getArmours().size()];
/* 166 */       for (int i = 0; i < getArmours().size(); i++) {
/* 167 */         if (((Armour)getArmours().get(i)).isOwns()) {
/* 168 */           Ui.println((j + 1) + ") " + ((Armour)getArmours().get(i)).getName());
/* 169 */           offset[j] = i - j;
/* 170 */           j++;
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/*     */       do {
/* 177 */         choice = Action.getValidInt() - 1;
/* 178 */       } while (choice < 0 || choice > getArmours().size());
/*     */       
/* 180 */       choice += offset[choice];
/*     */       
/* 182 */       if (((Armour)getArmours().get(choice)).isOwns()) {
/* 183 */         ((Armour)getArmours().get(choice)).equip();
/*     */         return;
/*     */       } 
/* 186 */       Action.cls();
/* 187 */       Ui.println("You don't have this armour.");
/* 188 */       Action.pause();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\item\Armour.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */