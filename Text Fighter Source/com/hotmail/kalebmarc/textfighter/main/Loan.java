/*     */ package com.hotmail.kalebmarc.textfighter.main;
/*     */ 
/*     */ import com.hotmail.kalebmarc.textfighter.player.Coins;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Xp;
/*     */ 
/*     */ public class Loan
/*     */ {
/*     */   private static final double INTEREST_RATE = 0.15D;
/*     */   private static int currentLoan;
/*     */   private static int netDue;
/*     */   
/*     */   public static void menu() {
/*     */     while (true) {
/*  14 */       Action.cls();
/*  15 */       Ui.println("-------------------------------");
/*  16 */       Ui.println("          PLAYER LOAN          ");
/*  17 */       Ui.println();
/*  18 */       Ui.println("Current interest rate: 0.15");
/*  19 */       Ui.println("Max loan amount: " + getMaxLoan());
/*  20 */       Ui.println("Current loan: " + currentLoan);
/*  21 */       Ui.println("-------------------------------");
/*  22 */       Ui.println("Net due: " + netDue);
/*  23 */       Ui.println("Interest due: " + (netDue * 0.15D));
/*  24 */       Ui.println("Gross due: " + getGrossDue());
/*  25 */       Ui.println("-------------------------------");
/*  26 */       Ui.println("1) Get loan");
/*  27 */       Ui.println("2) Pay off loan");
/*  28 */       Ui.println("3) Back");
/*  29 */       switch (Action.getValidInt()) {
/*     */         case 1:
/*  31 */           createLoan();
/*     */         
/*     */         case 2:
/*  34 */           payLoan();
/*     */         case 3:
/*     */           break;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static void createLoan() {
/*  43 */     if (hasLoan()) {
/*  44 */       Action.cls();
/*  45 */       Ui.println("You can not request a loan while you already have one.");
/*  46 */       Action.pause();
/*     */       
/*     */       return;
/*     */     } 
/*  50 */     Action.cls();
/*  51 */     Ui.println("Enter the amount you would like");
/*  52 */     Ui.println("to borrow.");
/*  53 */     Ui.println("Your max amount allowed is " + getMaxLoan());
/*  54 */     int request = Action.getValidInt();
/*     */     
/*  56 */     Action.cls();
/*     */     
/*  58 */     if (request > getMaxLoan()) {
/*  59 */       Ui.println("Your max amount you can borrow is " + getMaxLoan() + "!");
/*  60 */       Action.pause();
/*     */       return;
/*     */     } 
/*  63 */     if (request <= 0) {
/*  64 */       Ui.println("You must enter at least 1 coin.");
/*  65 */       Action.pause();
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/*  70 */     Coins.set(request, true);
/*  71 */     currentLoan = request;
/*  72 */     netDue = request;
/*  73 */     Action.cls();
/*  74 */     Ui.println("You have borrowed " + request + " from the bank.");
/*  75 */     Ui.println("You will not be able to deposit coins into the bank until your loan is fully paid off.");
/*  76 */     Action.pause();
/*     */   }
/*     */   private static void payLoan() {
/*  79 */     if (getGrossDue() == 0) {
/*  80 */       Ui.println("You must enter at least 1 coin.");
/*  81 */       Action.pause();
/*     */       
/*     */       return;
/*     */     } 
/*  85 */     Action.cls();
/*  86 */     Ui.println("You currently owe " + getGrossDue() + " coins.");
/*  87 */     Ui.println("You will not be able to deposit coins into the bank until your loan is fully paid off.");
/*  88 */     Ui.println("How much would you like to pay off?");
/*  89 */     int amountToPay = Action.getValidInt();
/*     */     
/*  91 */     Action.cls();
/*  92 */     if (Coins.get() < amountToPay) {
/*  93 */       Ui.println("You don't have enough coins.");
/*  94 */       Action.pause();
/*     */       
/*     */       return;
/*     */     } 
/*  98 */     if (amountToPay <= 0) {
/*  99 */       Ui.println("You must enter at least 1 coin.");
/* 100 */       Action.pause();
/*     */       
/*     */       return;
/*     */     } 
/* 104 */     if (amountToPay > getGrossDue()) {
/* 105 */       Ui.println("You only owe " + getGrossDue() + "! Enter a small amount");
/* 106 */       Action.pause();
/*     */     } 
/* 108 */     netDue = getGrossDue() - amountToPay;
/* 109 */     Coins.set(-amountToPay, true);
/*     */     
/* 111 */     Ui.println("You have paid back " + amountToPay + " coins.\nYou now have " + getGrossDue() + " left to pay.");
/* 112 */     if (getGrossDue() == 0) currentLoan = 0; 
/* 113 */     Action.pause();
/*     */   }
/*     */   private static int getMaxLoan() {
/* 116 */     return Xp.getLevel() * 100;
/*     */   }
/*     */   public static int getCurrentLoan() {
/* 119 */     return currentLoan;
/*     */   }
/*     */   public static boolean hasLoan() {
/* 122 */     return (getCurrentLoan() > 0);
/*     */   }
/*     */   public static int getGrossDue() {
/* 125 */     return (int)(netDue + netDue * 0.15D);
/*     */   }
/*     */   public static int getNetDue() {
/* 128 */     return netDue;
/*     */   }
/*     */   public static void setNetDue(int due) {
/* 131 */     netDue = due;
/*     */   }
/*     */   public static void setCurrentLoan(int loan) {
/* 134 */     currentLoan = loan;
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\main\Loan.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */