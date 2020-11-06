/*     */ package com.hotmail.kalebmarc.textfighter.main;
/*     */ 
/*     */ import com.hotmail.kalebmarc.textfighter.player.Coins;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Stats;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Xp;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Bank
/*     */ {
/*     */   private static double interest;
/*     */   private static int balance;
/*     */   
/*     */   public static void menu() {
/*  17 */     if (Xp.getLevel() < 2) {
/*  18 */       Action.cls();
/*  19 */       Ui.println("You have to be at least level 2 to use the bank.");
/*  20 */       Action.pause();
/*     */       
/*     */       return;
/*     */     } 
/*     */     while (true) {
/*     */       int amount;
/*  26 */       Action.cls();
/*  27 */       Ui.println("---------------------------------------");
/*  28 */       Ui.println("                BANK              ");
/*  29 */       Ui.println();
/*  30 */       Ui.println("You can deposit your coins into");
/*  31 */       Ui.println("the bank, so they will be safe if");
/*  32 */       Ui.println("you die. However, you will need to");
/*  33 */       Ui.println("pay " + (interest * 100.0D) + "% of what you're depositing");
/*  34 */       Ui.println("every time (Rounded to the nearest ");
/*  35 */       Ui.println("whole number).");
/*  36 */       Ui.println();
/*  37 */       Ui.println("Balance (Coins in the bank): " + get());
/*  38 */       Ui.println("Coins: " + Coins.get());
/*  39 */       Ui.println();
/*  40 */       Ui.println("1) Deposit");
/*  41 */       Ui.println("2) Withdraw");
/*  42 */       Ui.println("3) Request Loan");
/*  43 */       Ui.println("4) Back");
/*  44 */       Ui.println("---------------------------------------");
/*     */       
/*  46 */       switch (Action.getValidInt()) {
/*     */         
/*     */         case 1:
/*  49 */           if (Loan.hasLoan()) {
/*  50 */             Action.cls();
/*  51 */             Ui.println("You can not deposit coins until you pay off your loan!");
/*  52 */             Action.pause();
/*     */             continue;
/*     */           } 
/*  55 */           Ui.println("How much money would you like to deposit? (You will have to pay " + (interest * 100.0D) + "% of this)");
/*  56 */           Ui.println("You currently have " + Coins.get() + " coins.");
/*     */           while (true) {
/*  58 */             amount = Action.getValidInt();
/*  59 */             if (amount > Coins.get()) {
/*  60 */               Ui.println("You don't have enough coins. You only have " + Coins.get() + " coins.");
/*  61 */               amount = -1;
/*     */             } 
/*  63 */             if (amount >= 0) {
/*  64 */               if (amount == 0)
/*     */                 return;  break;
/*     */             } 
/*  67 */           }  deposit(amount, interest);
/*     */ 
/*     */ 
/*     */         
/*     */         case 2:
/*  72 */           Action.cls();
/*     */ 
/*     */           
/*  75 */           Ui.println("How much money would you like to withdraw?");
/*  76 */           Ui.println("You currently have " + get() + " coins in your bank.");
/*     */           do {
/*  78 */             amount = Action.getValidInt();
/*  79 */             if (amount <= get())
/*  80 */               continue;  Ui.println("You don't have enough coins in your bank. You only have " + get() + " coins.");
/*  81 */             amount = -1;
/*     */           }
/*  83 */           while (amount < 0);
/*     */ 
/*     */           
/*  86 */           withdraw(amount);
/*     */ 
/*     */         
/*     */         case 3:
/*  90 */           Loan.menu();
/*     */         case 4:
/*     */           break;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static int get() {
/*  98 */     return balance;
/*     */   }
/*     */   public static void set(int amount, boolean add) {
/* 101 */     if (!add) {
/* 102 */       balance = amount;
/*     */     } else {
/* 104 */       balance += amount;
/* 105 */       if (balance < 0) balance = 0; 
/*     */     } 
/*     */   }
/*     */   public static void setInterest(double price) {
/* 109 */     interest = price;
/*     */   }
/*     */ 
/*     */   
/*     */   private static void withdraw(int amount) {
/* 114 */     Coins.set(amount, true);
/* 115 */     set(-amount, true);
/*     */ 
/*     */     
/* 118 */     Action.cls();
/* 119 */     Ui.println("Amount withdrawn: " + amount);
/* 120 */     Ui.println("Current Balance: " + get());
/* 121 */     Action.pause();
/*     */   }
/*     */ 
/*     */   
/*     */   private static void deposit(int amount, double interest) {
/* 126 */     interest *= amount;
/* 127 */     if (amount < 10) interest = 1.0D;
/*     */ 
/*     */     
/* 130 */     Coins.set(-amount, true);
/*     */ 
/*     */     
/* 133 */     amount = (int)(amount - Math.round(interest));
/* 134 */     Stats.totalCoinsSpent = (int)(Stats.totalCoinsSpent + Math.round(interest));
/* 135 */     Stats.coinsSpentOnBankInterest = (int)(Stats.coinsSpentOnBankInterest + Math.round(interest));
/*     */ 
/*     */     
/* 138 */     set(amount, true);
/*     */ 
/*     */     
/* 141 */     Action.cls();
/* 142 */     Ui.println("Amount Deposited: " + amount + " coins");
/* 143 */     Ui.println("Interest Paid: " + Math.round(interest) + " coins");
/* 144 */     Ui.println("Current Balance: " + get() + " coins");
/* 145 */     Action.pause();
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\main\Bank.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */