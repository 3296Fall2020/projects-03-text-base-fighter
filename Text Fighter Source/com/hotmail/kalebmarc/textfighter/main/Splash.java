/*    */ package com.hotmail.kalebmarc.textfighter.main;
/*    */ 
/*    */ import java.awt.Component;
/*    */ import javax.swing.ImageIcon;
/*    */ import javax.swing.JFrame;
/*    */ import javax.swing.JLabel;
/*    */ 
/*    */ class Splash {
/*    */   public static void screen() {
/* 10 */     if (!Ui.guiEnabled)
/* 11 */       return;  if (Debug.enabled()) {
/*    */       return;
/*    */     }
/*    */ 
/*    */ 
/*    */     
/* 17 */     JFrame splashFrame = new JFrame();
/* 18 */     ImageIcon splashIcon = new ImageIcon(Start.class.getResource("/com/hotmail/kalebmarc/textfighter/main/gfx/TFLogo.png"));
/* 19 */     JLabel splashLabel = new JLabel(splashIcon);
/*    */ 
/*    */     
/* 22 */     splashFrame.add(splashLabel);
/* 23 */     splashFrame.setAlwaysOnTop(true);
/* 24 */     splashFrame.setUndecorated(true);
/* 25 */     splashFrame.pack();
/* 26 */     splashFrame.setLocationRelativeTo((Component)null);
/* 27 */     splashFrame.setDefaultCloseOperation(3);
/* 28 */     splashFrame.setVisible(true);
/*    */ 
/*    */     
/*    */     try {
/* 32 */       Thread.sleep(750L);
/* 33 */     } catch (Exception e) {
/* 34 */       Handle.error(e.toString());
/*    */     } 
/*    */ 
/*    */     
/* 38 */     splashFrame.setVisible(false);
/* 39 */     splashFrame.dispose();
/*    */   }
/*    */ }


/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\main\Splash.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */