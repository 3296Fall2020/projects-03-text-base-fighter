/*     */ package com.hotmail.kalebmarc.textfighter.main;
/*     */ 
/*     */ import com.hotmail.kalebmarc.textfighter.player.Coins;
/*     */ import com.hotmail.kalebmarc.textfighter.player.Stats;
/*     */ 
/*     */ 
/*     */ public class Casino
/*     */ {
/*   9 */   public static int totalCoinsWon = 0;
/*  10 */   public static int gamesPlayed = 0;
/*     */ 
/*     */   
/*     */   private static final String SLOT_HEADER = "------------------------------------------------------------------\n                                Slots                             \n------------------------------------------------------------------";
/*     */   
/*     */   private static final String DICE_HEADER = "------------------------------------------------------------------\n                            Dice Game                             \n------------------------------------------------------------------";
/*     */ 
/*     */   
/*     */   public static void menu() {
/*     */     while (true) {
/*  20 */       Action.cls();
/*  21 */       Ui.println("------------------------------------------------------------------");
/*  22 */       Ui.println("                      WELCOME TO THE CASINO                       ");
/*  23 */       Ui.println();
/*  24 */       Ui.println("     Coins: " + Coins.get());
/*  25 */       Ui.println("------------------------------------------------------------------");
/*  26 */       Ui.println("1) Dice Game");
/*  27 */       Ui.println("2) Slots");
/*  28 */       Ui.println("3) Back");
/*  29 */       Ui.println("------------------------------------------------------------------");
/*     */       
/*  31 */       int menuChoice = Action.getValidInt();
/*     */       
/*  33 */       switch (menuChoice) {
/*     */         case 1:
/*  35 */           dice();
/*     */         
/*     */         case 2:
/*  38 */           slots();
/*     */         case 3:
/*     */           return;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static void dice() {
/*     */     while (true) {
/*  49 */       Action.cls();
/*  50 */       Ui.println("------------------------------------------------------------------\n                            Dice Game                             \n------------------------------------------------------------------");
/*  51 */       Ui.println("     Coins: " + Coins.get());
/*  52 */       Ui.println("------------------------------------------------------------------");
/*  53 */       Ui.println("                           How to play                            ");
/*  54 */       Ui.println();
/*  55 */       Ui.println("You will pick two numbers between 1, and 6.");
/*  56 */       Ui.println("Two dice will be rolled. If one of the dice matches one of your    ");
/*  57 */       Ui.println("numbers, you will win double the coins you bet. If both dice      ");
/*  58 */       Ui.println("matches both of your numbers, you will win 5 times the amount     ");
/*  59 */       Ui.println("of coins you bet. If none of the dice matches either of your      ");
/*  60 */       Ui.println("numbers, then you lose all your coins that you have bet.          ");
/*  61 */       Ui.println("------------------------------------------------------------------");
/*  62 */       Ui.println("1) Let's play!                                                    ");
/*  63 */       Ui.println("2) Back to casino menu                                            ");
/*  64 */       Ui.println("------------------------------------------------------------------");
/*     */       
/*  66 */       int menuChoice = Action.getValidInt();
/*     */       
/*  68 */       switch (menuChoice) {
/*     */         case 1:
/*  70 */           dicePlay();
/*     */         case 2:
/*     */           break;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void slots() {
/*     */     while (true) {
/*  83 */       Action.cls();
/*     */       
/*  85 */       Ui.println("------------------------------------------------------------------\n                                Slots                             \n------------------------------------------------------------------");
/*  86 */       Ui.println("     Coins: " + Coins.get());
/*  87 */       Ui.println("------------------------------------------------------------------");
/*  88 */       Ui.println("                           How to play                            ");
/*  89 */       Ui.println();
/*  90 */       Ui.println("You will pick an amount of coins to bet. Then, 4 slots will spin, ");
/*  91 */       Ui.println("each containing 5 possibilities. You'll win coins depending on how");
/*  92 */       Ui.println("much of the same item you spin.                                   ");
/*  93 */       Ui.println();
/*  94 */       Ui.println("0 the same : Lose amount you bet                                  ");
/*  95 */       Ui.println("2 the same : Lose amount you bet                                  ");
/*  96 */       Ui.println("3 the same : Win 4 times the amount you bet                       ");
/*  97 */       Ui.println("4 the same : Win 8 times the amount you bet                       ");
/*  98 */       Ui.println("------------------------------------------------------------------");
/*  99 */       Ui.println("1) Let's play!                                                    ");
/* 100 */       Ui.println("2) Back to casino menu                                            ");
/* 101 */       Ui.println("------------------------------------------------------------------");
/*     */       
/* 103 */       int menuChoice = Action.getValidInt();
/*     */       
/* 105 */       switch (menuChoice) {
/*     */         case 1:
/* 107 */           slotsPlay();
/*     */         case 2:
/*     */           break;
/*     */       } 
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
/*     */   private static void dicePlay() {
/* 122 */     int bet, firstNumber, secondNumber, coinsWon = 0;
/*     */ 
/*     */     
/* 125 */     Action.cls();
/* 126 */     Ui.println("------------------------------------------------------------------\n                            Dice Game                             \n------------------------------------------------------------------");
/* 127 */     Ui.println();
/* 128 */     Ui.println("Coins: " + Coins.get());
/* 129 */     Ui.println();
/* 130 */     Ui.println("To begin, enter the amount of coins you would like to bet.. ");
/* 131 */     Ui.println("It must be between 10, and 250.");
/* 132 */     Ui.println("Enter 0 to go back");
/*     */     do {
/* 134 */       bet = Action.getValidInt();
/* 135 */       if (bet == 0)
/* 136 */         return;  if (bet <= Coins.get())
/* 137 */         continue;  Action.cls();
/* 138 */       bet = 0;
/* 139 */       Ui.println("You do not have enough coins. Please enter a smaller amount. (Or enter 0 to go back)");
/* 140 */       Action.pause();
/*     */     }
/* 142 */     while (bet < 10 || bet > 250);
/*     */     
/* 144 */     Coins.set(-bet, true);
/*     */     
/*     */     do {
/* 147 */       Action.cls();
/* 148 */       Ui.println("------------------------------------------------------------------\n                            Dice Game                             \n------------------------------------------------------------------");
/* 149 */       Ui.println();
/* 150 */       Ui.println("Now, pick your first number.");
/* 151 */       Ui.println("It must be between 1, and 6.");
/* 152 */       firstNumber = Action.getValidInt();
/* 153 */     } while (firstNumber < 1 || firstNumber > 6);
/*     */     do {
/* 155 */       Action.cls();
/* 156 */       Ui.println("------------------------------------------------------------------\n                            Dice Game                             \n------------------------------------------------------------------");
/* 157 */       Ui.println();
/* 158 */       Ui.println("Finally, pick your second number.");
/* 159 */       Ui.println("It must be between 1, and 6.");
/* 160 */       secondNumber = Action.getValidInt();
/* 161 */     } while (secondNumber < 1 || secondNumber > 6);
/*     */ 
/*     */     
/* 164 */     Action.cls();
/* 165 */     Ui.println("Rolling the two dice...");
/*     */     try {
/* 167 */       Thread.sleep(3000L);
/* 168 */     } catch (InterruptedException e) {
/* 169 */       Handle.error(e.toString());
/*     */     } 
/* 171 */     int dice1 = Random.RInt(6);
/* 172 */     int dice2 = Random.RInt(6);
/* 173 */     Ui.println("Results are ready! Press enter to continue.");
/* 174 */     Action.pause();
/*     */ 
/*     */     
/* 177 */     boolean fNum = false, sNum = false;
/* 178 */     if (firstNumber == dice1 || firstNumber == dice2) fNum = true; 
/* 179 */     if (secondNumber == dice1 || secondNumber == dice2) sNum = true; 
/* 180 */     if (fNum ^ sNum) coinsWon = bet * 2; 
/* 181 */     if (fNum && sNum) coinsWon = bet * 5; 
/* 182 */     Action.cls();
/* 183 */     Ui.println("------------------------------------------------------------------\n                            Dice Game                             \n------------------------------------------------------------------");
/* 184 */     Ui.println("Your bet: " + bet);
/* 185 */     Ui.println("First number: " + firstNumber);
/* 186 */     Ui.println("Second Number: " + secondNumber);
/* 187 */     Ui.println();
/* 188 */     Ui.println("Dice 1: " + dice1);
/* 189 */     Ui.println("Dice 2: " + dice2);
/* 190 */     Ui.println();
/* 191 */     Ui.println("Coins Won: " + coinsWon);
/* 192 */     Coins.set(coinsWon, true);
/* 193 */     totalCoinsWon += coinsWon;
/* 194 */     gamesPlayed++;
/* 195 */     Stats.diceGamesPlayed++;
/* 196 */     Action.pause();
/*     */   }
/*     */   
/*     */   private static void slotsPlay() {
/*     */     // Byte code:
/*     */     //   0: iconst_0
/*     */     //   1: istore_2
/*     */     //   2: iconst_5
/*     */     //   3: anewarray java/lang/String
/*     */     //   6: dup
/*     */     //   7: iconst_0
/*     */     //   8: ldc ''
/*     */     //   10: aastore
/*     */     //   11: dup
/*     */     //   12: iconst_1
/*     */     //   13: ldc ''
/*     */     //   15: aastore
/*     */     //   16: dup
/*     */     //   17: iconst_2
/*     */     //   18: ldc ''
/*     */     //   20: aastore
/*     */     //   21: dup
/*     */     //   22: iconst_3
/*     */     //   23: ldc ''
/*     */     //   25: aastore
/*     */     //   26: dup
/*     */     //   27: iconst_4
/*     */     //   28: ldc ''
/*     */     //   30: aastore
/*     */     //   31: astore_3
/*     */     //   32: bipush #6
/*     */     //   34: newarray int
/*     */     //   36: dup
/*     */     //   37: iconst_0
/*     */     //   38: iconst_0
/*     */     //   39: iastore
/*     */     //   40: dup
/*     */     //   41: iconst_1
/*     */     //   42: iconst_0
/*     */     //   43: iastore
/*     */     //   44: dup
/*     */     //   45: iconst_2
/*     */     //   46: iconst_0
/*     */     //   47: iastore
/*     */     //   48: dup
/*     */     //   49: iconst_3
/*     */     //   50: iconst_0
/*     */     //   51: iastore
/*     */     //   52: dup
/*     */     //   53: iconst_4
/*     */     //   54: iconst_0
/*     */     //   55: iastore
/*     */     //   56: dup
/*     */     //   57: iconst_5
/*     */     //   58: iconst_0
/*     */     //   59: iastore
/*     */     //   60: astore #4
/*     */     //   62: invokestatic cls : ()V
/*     */     //   65: ldc '------------------------------------------------------------------\\n                                Slots                             \\n------------------------------------------------------------------'
/*     */     //   67: invokestatic println : (Ljava/lang/String;)V
/*     */     //   70: invokestatic println : ()V
/*     */     //   73: new java/lang/StringBuilder
/*     */     //   76: dup
/*     */     //   77: invokespecial <init> : ()V
/*     */     //   80: ldc 'Coins: '
/*     */     //   82: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   85: invokestatic get : ()I
/*     */     //   88: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   91: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   94: invokestatic println : (Ljava/lang/String;)V
/*     */     //   97: invokestatic println : ()V
/*     */     //   100: ldc 'To begin, enter the amount of coins you would like to bet.. '
/*     */     //   102: invokestatic println : (Ljava/lang/String;)V
/*     */     //   105: ldc 'It must be between 10, and 250.'
/*     */     //   107: invokestatic println : (Ljava/lang/String;)V
/*     */     //   110: invokestatic getValidInt : ()I
/*     */     //   113: istore_0
/*     */     //   114: iload_0
/*     */     //   115: ifne -> 119
/*     */     //   118: return
/*     */     //   119: iload_0
/*     */     //   120: invokestatic get : ()I
/*     */     //   123: if_icmple -> 139
/*     */     //   126: invokestatic cls : ()V
/*     */     //   129: iconst_0
/*     */     //   130: istore_0
/*     */     //   131: ldc 'You do not have enough coins. Please enter a smaller amount, or type 0 to go back.'
/*     */     //   133: invokestatic println : (Ljava/lang/String;)V
/*     */     //   136: invokestatic pause : ()V
/*     */     //   139: iload_0
/*     */     //   140: bipush #10
/*     */     //   142: if_icmplt -> 110
/*     */     //   145: iload_0
/*     */     //   146: sipush #250
/*     */     //   149: if_icmpgt -> 110
/*     */     //   152: iload_0
/*     */     //   153: ineg
/*     */     //   154: iconst_1
/*     */     //   155: invokestatic set : (IZ)V
/*     */     //   158: iconst_5
/*     */     //   159: invokestatic RInt : (I)I
/*     */     //   162: istore_1
/*     */     //   163: iload_1
/*     */     //   164: iconst_1
/*     */     //   165: if_icmpne -> 173
/*     */     //   168: aload_3
/*     */     //   169: iconst_1
/*     */     //   170: ldc '$'
/*     */     //   172: aastore
/*     */     //   173: iload_1
/*     */     //   174: iconst_2
/*     */     //   175: if_icmpne -> 183
/*     */     //   178: aload_3
/*     */     //   179: iconst_1
/*     */     //   180: ldc '%'
/*     */     //   182: aastore
/*     */     //   183: iload_1
/*     */     //   184: iconst_3
/*     */     //   185: if_icmpne -> 193
/*     */     //   188: aload_3
/*     */     //   189: iconst_1
/*     */     //   190: ldc '&'
/*     */     //   192: aastore
/*     */     //   193: iload_1
/*     */     //   194: iconst_4
/*     */     //   195: if_icmpne -> 203
/*     */     //   198: aload_3
/*     */     //   199: iconst_1
/*     */     //   200: ldc '*'
/*     */     //   202: aastore
/*     */     //   203: iload_1
/*     */     //   204: iconst_5
/*     */     //   205: if_icmpne -> 213
/*     */     //   208: aload_3
/*     */     //   209: iconst_1
/*     */     //   210: ldc '@'
/*     */     //   212: aastore
/*     */     //   213: iconst_5
/*     */     //   214: invokestatic RInt : (I)I
/*     */     //   217: istore_1
/*     */     //   218: iload_1
/*     */     //   219: iconst_1
/*     */     //   220: if_icmpne -> 228
/*     */     //   223: aload_3
/*     */     //   224: iconst_2
/*     */     //   225: ldc '$'
/*     */     //   227: aastore
/*     */     //   228: iload_1
/*     */     //   229: iconst_2
/*     */     //   230: if_icmpne -> 238
/*     */     //   233: aload_3
/*     */     //   234: iconst_2
/*     */     //   235: ldc '%'
/*     */     //   237: aastore
/*     */     //   238: iload_1
/*     */     //   239: iconst_3
/*     */     //   240: if_icmpne -> 248
/*     */     //   243: aload_3
/*     */     //   244: iconst_2
/*     */     //   245: ldc '&'
/*     */     //   247: aastore
/*     */     //   248: iload_1
/*     */     //   249: iconst_4
/*     */     //   250: if_icmpne -> 258
/*     */     //   253: aload_3
/*     */     //   254: iconst_2
/*     */     //   255: ldc '*'
/*     */     //   257: aastore
/*     */     //   258: iload_1
/*     */     //   259: iconst_5
/*     */     //   260: if_icmpne -> 268
/*     */     //   263: aload_3
/*     */     //   264: iconst_2
/*     */     //   265: ldc '@'
/*     */     //   267: aastore
/*     */     //   268: iconst_5
/*     */     //   269: invokestatic RInt : (I)I
/*     */     //   272: istore_1
/*     */     //   273: iload_1
/*     */     //   274: iconst_1
/*     */     //   275: if_icmpne -> 283
/*     */     //   278: aload_3
/*     */     //   279: iconst_3
/*     */     //   280: ldc '$'
/*     */     //   282: aastore
/*     */     //   283: iload_1
/*     */     //   284: iconst_2
/*     */     //   285: if_icmpne -> 293
/*     */     //   288: aload_3
/*     */     //   289: iconst_3
/*     */     //   290: ldc '%'
/*     */     //   292: aastore
/*     */     //   293: iload_1
/*     */     //   294: iconst_3
/*     */     //   295: if_icmpne -> 303
/*     */     //   298: aload_3
/*     */     //   299: iconst_3
/*     */     //   300: ldc '&'
/*     */     //   302: aastore
/*     */     //   303: iload_1
/*     */     //   304: iconst_4
/*     */     //   305: if_icmpne -> 313
/*     */     //   308: aload_3
/*     */     //   309: iconst_3
/*     */     //   310: ldc '*'
/*     */     //   312: aastore
/*     */     //   313: iload_1
/*     */     //   314: iconst_5
/*     */     //   315: if_icmpne -> 323
/*     */     //   318: aload_3
/*     */     //   319: iconst_3
/*     */     //   320: ldc '@'
/*     */     //   322: aastore
/*     */     //   323: iconst_5
/*     */     //   324: invokestatic RInt : (I)I
/*     */     //   327: istore_1
/*     */     //   328: iload_1
/*     */     //   329: iconst_1
/*     */     //   330: if_icmpne -> 338
/*     */     //   333: aload_3
/*     */     //   334: iconst_4
/*     */     //   335: ldc '$'
/*     */     //   337: aastore
/*     */     //   338: iload_1
/*     */     //   339: iconst_2
/*     */     //   340: if_icmpne -> 348
/*     */     //   343: aload_3
/*     */     //   344: iconst_4
/*     */     //   345: ldc '%'
/*     */     //   347: aastore
/*     */     //   348: iload_1
/*     */     //   349: iconst_3
/*     */     //   350: if_icmpne -> 358
/*     */     //   353: aload_3
/*     */     //   354: iconst_4
/*     */     //   355: ldc '&'
/*     */     //   357: aastore
/*     */     //   358: iload_1
/*     */     //   359: iconst_4
/*     */     //   360: if_icmpne -> 368
/*     */     //   363: aload_3
/*     */     //   364: iconst_4
/*     */     //   365: ldc '*'
/*     */     //   367: aastore
/*     */     //   368: iload_1
/*     */     //   369: iconst_5
/*     */     //   370: if_icmpne -> 378
/*     */     //   373: aload_3
/*     */     //   374: iconst_4
/*     */     //   375: ldc '@'
/*     */     //   377: aastore
/*     */     //   378: invokestatic cls : ()V
/*     */     //   381: ldc 'Spinning slots...'
/*     */     //   383: invokestatic println : (Ljava/lang/String;)V
/*     */     //   386: ldc2_w 3000
/*     */     //   389: invokestatic sleep : (J)V
/*     */     //   392: goto -> 405
/*     */     //   395: astore #5
/*     */     //   397: aload #5
/*     */     //   399: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   402: invokestatic error : (Ljava/lang/String;)V
/*     */     //   405: iconst_1
/*     */     //   406: istore #5
/*     */     //   408: iload #5
/*     */     //   410: iconst_5
/*     */     //   411: if_icmpge -> 520
/*     */     //   414: aload_3
/*     */     //   415: iload #5
/*     */     //   417: aaload
/*     */     //   418: ldc '$'
/*     */     //   420: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   423: ifeq -> 434
/*     */     //   426: aload #4
/*     */     //   428: iconst_1
/*     */     //   429: dup2
/*     */     //   430: iaload
/*     */     //   431: iconst_1
/*     */     //   432: iadd
/*     */     //   433: iastore
/*     */     //   434: aload_3
/*     */     //   435: iload #5
/*     */     //   437: aaload
/*     */     //   438: ldc '%'
/*     */     //   440: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   443: ifeq -> 454
/*     */     //   446: aload #4
/*     */     //   448: iconst_2
/*     */     //   449: dup2
/*     */     //   450: iaload
/*     */     //   451: iconst_1
/*     */     //   452: iadd
/*     */     //   453: iastore
/*     */     //   454: aload_3
/*     */     //   455: iload #5
/*     */     //   457: aaload
/*     */     //   458: ldc '&'
/*     */     //   460: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   463: ifeq -> 474
/*     */     //   466: aload #4
/*     */     //   468: iconst_3
/*     */     //   469: dup2
/*     */     //   470: iaload
/*     */     //   471: iconst_1
/*     */     //   472: iadd
/*     */     //   473: iastore
/*     */     //   474: aload_3
/*     */     //   475: iload #5
/*     */     //   477: aaload
/*     */     //   478: ldc '*'
/*     */     //   480: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   483: ifeq -> 494
/*     */     //   486: aload #4
/*     */     //   488: iconst_4
/*     */     //   489: dup2
/*     */     //   490: iaload
/*     */     //   491: iconst_1
/*     */     //   492: iadd
/*     */     //   493: iastore
/*     */     //   494: aload_3
/*     */     //   495: iload #5
/*     */     //   497: aaload
/*     */     //   498: ldc '@'
/*     */     //   500: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   503: ifeq -> 514
/*     */     //   506: aload #4
/*     */     //   508: iconst_5
/*     */     //   509: dup2
/*     */     //   510: iaload
/*     */     //   511: iconst_1
/*     */     //   512: iadd
/*     */     //   513: iastore
/*     */     //   514: iinc #5, 1
/*     */     //   517: goto -> 408
/*     */     //   520: iconst_1
/*     */     //   521: istore #5
/*     */     //   523: iload #5
/*     */     //   525: iconst_5
/*     */     //   526: if_icmpge -> 548
/*     */     //   529: aload #4
/*     */     //   531: iload #5
/*     */     //   533: iaload
/*     */     //   534: iconst_3
/*     */     //   535: if_icmpne -> 542
/*     */     //   538: iload_0
/*     */     //   539: iconst_4
/*     */     //   540: imul
/*     */     //   541: istore_2
/*     */     //   542: iinc #5, 1
/*     */     //   545: goto -> 523
/*     */     //   548: iconst_1
/*     */     //   549: istore #5
/*     */     //   551: iload #5
/*     */     //   553: iconst_5
/*     */     //   554: if_icmpge -> 577
/*     */     //   557: aload #4
/*     */     //   559: iload #5
/*     */     //   561: iaload
/*     */     //   562: iconst_4
/*     */     //   563: if_icmpne -> 571
/*     */     //   566: iload_0
/*     */     //   567: bipush #8
/*     */     //   569: imul
/*     */     //   570: istore_2
/*     */     //   571: iinc #5, 1
/*     */     //   574: goto -> 551
/*     */     //   577: ldc 'Results Ready! Press enter to continue.'
/*     */     //   579: invokestatic println : (Ljava/lang/String;)V
/*     */     //   582: invokestatic pause : ()V
/*     */     //   585: ldc '------------------------------------------------------------------\\n                                Slots                             \\n------------------------------------------------------------------'
/*     */     //   587: invokestatic println : (Ljava/lang/String;)V
/*     */     //   590: new java/lang/StringBuilder
/*     */     //   593: dup
/*     */     //   594: invokespecial <init> : ()V
/*     */     //   597: ldc 'Your bet: '
/*     */     //   599: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   602: iload_0
/*     */     //   603: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   606: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   609: invokestatic println : (Ljava/lang/String;)V
/*     */     //   612: invokestatic println : ()V
/*     */     //   615: new java/lang/StringBuilder
/*     */     //   618: dup
/*     */     //   619: invokespecial <init> : ()V
/*     */     //   622: ldc 'Rolled Slots: '
/*     */     //   624: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   627: aload_3
/*     */     //   628: iconst_1
/*     */     //   629: aaload
/*     */     //   630: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   633: ldc '  '
/*     */     //   635: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   638: aload_3
/*     */     //   639: iconst_2
/*     */     //   640: aaload
/*     */     //   641: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   644: ldc '  '
/*     */     //   646: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   649: aload_3
/*     */     //   650: iconst_3
/*     */     //   651: aaload
/*     */     //   652: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   655: ldc '  '
/*     */     //   657: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   660: aload_3
/*     */     //   661: iconst_4
/*     */     //   662: aaload
/*     */     //   663: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   666: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   669: invokestatic println : (Ljava/lang/String;)V
/*     */     //   672: invokestatic println : ()V
/*     */     //   675: new java/lang/StringBuilder
/*     */     //   678: dup
/*     */     //   679: invokespecial <init> : ()V
/*     */     //   682: ldc 'Coins Won: '
/*     */     //   684: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   687: iload_2
/*     */     //   688: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   691: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   694: invokestatic println : (Ljava/lang/String;)V
/*     */     //   697: iload_2
/*     */     //   698: iconst_1
/*     */     //   699: invokestatic set : (IZ)V
/*     */     //   702: getstatic com/hotmail/kalebmarc/textfighter/main/Casino.totalCoinsWon : I
/*     */     //   705: iload_2
/*     */     //   706: iadd
/*     */     //   707: putstatic com/hotmail/kalebmarc/textfighter/main/Casino.totalCoinsWon : I
/*     */     //   710: getstatic com/hotmail/kalebmarc/textfighter/main/Casino.gamesPlayed : I
/*     */     //   713: iconst_1
/*     */     //   714: iadd
/*     */     //   715: putstatic com/hotmail/kalebmarc/textfighter/main/Casino.gamesPlayed : I
/*     */     //   718: getstatic com/hotmail/kalebmarc/textfighter/player/Stats.slotGamesPlayed : I
/*     */     //   721: iconst_1
/*     */     //   722: iadd
/*     */     //   723: putstatic com/hotmail/kalebmarc/textfighter/player/Stats.slotGamesPlayed : I
/*     */     //   726: invokestatic pause : ()V
/*     */     //   729: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #202	-> 0
/*     */     //   #203	-> 2
/*     */     //   #204	-> 32
/*     */     //   #207	-> 62
/*     */     //   #208	-> 65
/*     */     //   #209	-> 70
/*     */     //   #210	-> 73
/*     */     //   #211	-> 97
/*     */     //   #212	-> 100
/*     */     //   #213	-> 105
/*     */     //   #215	-> 110
/*     */     //   #216	-> 114
/*     */     //   #217	-> 119
/*     */     //   #218	-> 126
/*     */     //   #219	-> 129
/*     */     //   #220	-> 131
/*     */     //   #221	-> 136
/*     */     //   #223	-> 139
/*     */     //   #224	-> 152
/*     */     //   #228	-> 158
/*     */     //   #229	-> 163
/*     */     //   #230	-> 173
/*     */     //   #231	-> 183
/*     */     //   #232	-> 193
/*     */     //   #233	-> 203
/*     */     //   #235	-> 213
/*     */     //   #236	-> 218
/*     */     //   #237	-> 228
/*     */     //   #238	-> 238
/*     */     //   #239	-> 248
/*     */     //   #240	-> 258
/*     */     //   #242	-> 268
/*     */     //   #243	-> 273
/*     */     //   #244	-> 283
/*     */     //   #245	-> 293
/*     */     //   #246	-> 303
/*     */     //   #247	-> 313
/*     */     //   #249	-> 323
/*     */     //   #250	-> 328
/*     */     //   #251	-> 338
/*     */     //   #252	-> 348
/*     */     //   #253	-> 358
/*     */     //   #254	-> 368
/*     */     //   #257	-> 378
/*     */     //   #258	-> 381
/*     */     //   #260	-> 386
/*     */     //   #263	-> 392
/*     */     //   #261	-> 395
/*     */     //   #262	-> 397
/*     */     //   #265	-> 405
/*     */     //   #266	-> 414
/*     */     //   #267	-> 434
/*     */     //   #268	-> 454
/*     */     //   #269	-> 474
/*     */     //   #270	-> 494
/*     */     //   #265	-> 514
/*     */     //   #272	-> 520
/*     */     //   #273	-> 529
/*     */     //   #272	-> 542
/*     */     //   #275	-> 548
/*     */     //   #276	-> 557
/*     */     //   #275	-> 571
/*     */     //   #278	-> 577
/*     */     //   #279	-> 582
/*     */     //   #280	-> 585
/*     */     //   #281	-> 590
/*     */     //   #282	-> 612
/*     */     //   #283	-> 615
/*     */     //   #284	-> 672
/*     */     //   #285	-> 675
/*     */     //   #286	-> 697
/*     */     //   #287	-> 702
/*     */     //   #288	-> 710
/*     */     //   #289	-> 718
/*     */     //   #290	-> 726
/*     */     //   #291	-> 729
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   397	8	5	e	Ljava/lang/InterruptedException;
/*     */     //   408	112	5	i	I
/*     */     //   523	25	5	i	I
/*     */     //   551	26	5	i	I
/*     */     //   114	616	0	bet	I
/*     */     //   163	567	1	slot	I
/*     */     //   2	728	2	coinsWon	I
/*     */     //   32	698	3	slots	[Ljava/lang/String;
/*     */     //   62	668	4	s	[I
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   386	392	395	java/lang/InterruptedException
/*     */   }
/*     */ }


/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\main\Casino.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */