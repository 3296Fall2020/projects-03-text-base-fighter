/*    */ package com.hotmail.kalebmarc.textfighter.main;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ import javax.swing.JOptionPane;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Ui
/*    */ {
/*    */   public static boolean guiEnabled = true;
/*    */   
/*    */   public static void print(String input) {
/* 18 */     System.out.print(input);
/*    */   }
/*    */   public static void println(String input) {
/* 21 */     System.out.println(input);
/*    */   }
/*    */   public static void print(int input) {
/* 24 */     System.out.print(input);
/*    */   }
/*    */   public static void println(int input) {
/* 27 */     System.out.println(input);
/*    */   }
/*    */   public static void print(boolean input) {
/* 30 */     System.out.print(input);
/*    */   }
/*    */   public static void println(boolean input) {
/* 33 */     System.out.println(input);
/*    */   }
/*    */   public static void print(double input) {
/* 36 */     System.out.print(input);
/*    */   }
/*    */   public static void println(double input) {
/* 39 */     System.out.println(input);
/*    */   }
/*    */   public static void println() {
/* 42 */     System.out.println();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void popup(String body, String title, int msgType) {
/* 50 */     if (guiEnabled) {
/* 51 */       JOptionPane.showMessageDialog(null, body, title, msgType);
/*    */     } else {
/* 53 */       Action.cls();
/* 54 */       println(body);
/* 55 */       Action.pause();
/*    */     } 
/*    */   }
/*    */   
/*    */   public static int confirmPopup(String body, String title) {
/* 60 */     if (guiEnabled) {
/* 61 */       return JOptionPane.showConfirmDialog(null, body, title, 0);
/*    */     }
/* 63 */     Action.cls();
/* 64 */     println(body);
/* 65 */     println("(Y/N)");
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 70 */     Scanner in = new Scanner(System.in);
/*    */     
/* 72 */     while (!in.hasNextLine()) {
/* 73 */       in.nextLine();
/*    */     }
/*    */     
/* 76 */     String valid = in.nextLine();
/* 77 */     valid = valid.toUpperCase();
/* 78 */     char input = valid.charAt(0);
/*    */ 
/*    */     
/* 81 */     Action.cls();
/* 82 */     if (input == 'Y') return 0; 
/* 83 */     return 1;
/*    */   }
/*    */ }


/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\main\Ui.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */