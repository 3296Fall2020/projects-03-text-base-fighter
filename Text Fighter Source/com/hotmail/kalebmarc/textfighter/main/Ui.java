/*    */ package com.hotmail.kalebmarc.textfighter.main;

/*    */
 /*    */ import java.util.Scanner;
/*    */ import javax.swing.JOptionPane;
         import com.hotmail.kalebmarc.textfighter.player.Health;
         import static java.lang.Math.sqrt;

/*    */
 /*    */
 /*    */
 /*    */
 /*    */
 /*    */
 /*    */
 /*    */
 /*    */ public class Ui /*    */ {

    /*    */ public static boolean guiEnabled = true;

    /*    */
 /*    */ public static void print(String input) {
        /* 18 */ System.out.print(input);
        /*    */    }

    /*    */ public static void println(String input) {
        /* 21 */ System.out.println(input);
        /*    */    }

    /*    */ public static void print(int input) {
        /* 24 */ System.out.print(input);
        /*    */    }

    /*    */ public static void println(int input) {
        /* 27 */ System.out.println(input);
        /*    */    }

    /*    */ public static void print(boolean input) {
        /* 30 */ System.out.print(input);
        /*    */    }

    /*    */ public static void println(boolean input) {
        /* 33 */ System.out.println(input);
        /*    */    }

    /*    */ public static void print(double input) {
        /* 36 */ System.out.print(input);
        /*    */    }

    /*    */ public static void println(double input) {
        /* 39 */ System.out.println(input);
        /*    */    }

    /*    */ public static void println() {
        /* 42 */ System.out.println();
        /*    */    }
            public static void print_health_bar(){
                int current_health = Health.get();
                double health_percent = (current_health / 100.0)*10;
                int bar =(int) Math.floor(health_percent);
                String out="[";
                for(int i=0; i<bar;i++){
                    out+="#";
                }
                for(int i=0; i<(10-bar);i++){
                    out+="*";
                }
                out +="]";
                System.out.println(out);
            }
            public static void enemy_health_bar(int current, int max){
                double health_percent = (current / (double)max)*10;
                int bar =(int) Math.floor(health_percent);
                String out="[";
                for(int i=0; i<bar;i++){
                    out+="#";
                }
                for(int i=0; i<(10-bar);i++){
                    out+="*";
                }
                out +="]";
                System.out.println(out);
            }
            

    /*    */
 /*    */
 /*    */
 /*    */
 /*    */
 /*    */ public static void popup(String body, String title, int msgType) {
        /* 50 */ if (guiEnabled) {
            /* 51 */ JOptionPane.showMessageDialog(null, body, title, msgType);
            /*    */        } else {
            /* 53 */ //Action.cls();
            /* 54 */ println(body);
            /* 55 */ Action.pause();
            /*    */        }
        /*    */    }

    /*    */
 /*    */ public static int confirmPopup(String body, String title) {
        /* 60 */ if (guiEnabled) {
            /* 61 */ return JOptionPane.showConfirmDialog(null, body, title, 0);
            /*    */        }
        /* 63 */ Action.cls();
        /* 64 */ println(body);
        /* 65 */ println("(Y/N)");
        /*    */
 /*    */
 /*    */
 /*    */
 /* 70 */ Scanner in = new Scanner(System.in);
        /*    */
 /* 72 */ while (!in.hasNextLine()) {
            /* 73 */ in.nextLine();
            /*    */        }
        /*    */
 /* 76 */ String valid = in.nextLine();
        /* 77 */ valid = valid.toUpperCase();
        /* 78 */ char input = valid.charAt(0);
        /*    */
 /*    */
 /* 81 */ Action.cls();
        /* 82 */ if (input == 'Y') {
            return 0;
        }
        /* 83 */ return 1;
        /*    */    }

    public static void ememies_pop() {
        System.out.println("            _.------.  ");
        System.out.println("           /         \\_");
        System.out.println("          |  O    O   |");
        System.out.println("          |  .vvvvv.  |");
        System.out.println("          /  |     |  |");
        System.out.println("         /   `^^^^^'  |");
        System.out.println("       ./  /|         |");
        System.out.println("      /   / |         |");
        System.out.println("     /   /  |        / ");
        System.out.println("       `'   |  _     |");
        System.out.println("         _.-'-' `-'-'");

    }

    public static void coin_pop() {
        System.out.println("          __-----__\n"
                + "     ..;;;--'~~~`--;;;..\n"
                + "   /;-~IN GOD WE TRUST~-.\\\n"
                + "  //      ,;;;;;;;;      \\\\\n"
                + ".//      ;;;;;    \\       \\\\\n"
                + "||       ;;;;(   /.|       ||\n"
                + "||       ;;;;;;;   _\\      ||\n"
                + "||       ';;  ;;;;=        ||\n"
                + "||LIBERTY | ''\\;;;;;;      ||\n"
                + " \\\\     ,| '\\  '|><| 1995 //\n"
                + "  \\\\   |     |      \\  A //\n"
                + "   `;.,|.    |      '\\.-'/\n"
                + "     ~~;;;,._|___.,-;;;~'\n"
                + "         ''=--'");

    }

    public static void victory_pop() {
        System.out.println("        _      _                   \n"
                + "      (_)    | |                  \n"
                + "__   ___  ___| |_ ___  _ __ _   _ \n"
                + "\\ \\ / / |/ __| __/ _ \\| '__| | | |\n"
                + " \\ V /| | (__| || (_) | |  | |_| |\n"
                + "  \\_/ |_|\\___|\\__\\___/|_|   \\__, |\n"
                + "                             __/ |\n"
                + "                            |___/");
    }

    public static void town_pop() {
        System.out.println("             |   _   _\n"
                + "      . | . x .|.|-|.|\n"
                + "   |\\ ./.\\-/.\\-|.|.|.|\n"
                + "~~~|.|_|.|_|.|.|.|_|.|~~~");
    }

    public static void home_pop() {
        System.out.println("           x\n"
                + ".-. _______|\n"
                + "|=|/     /  \\\n"
                + "| |_____|_\"\"_|\n"
                + "|_|_[X]_|____|");
    }

    public static void casino_pop() {
        System.out.println("  ____\n"
                + " /\\' .\\    _____\n"
                + "/: \\___\\  / .  /\\\n"
                + "\\' / . / /____/..\\\n"
                + " \\/___/  \\'  '\\  /\n"
                + "          \\'__'\\/");
    }

    public static void shop_pop() {
        System.out.println("  ____||____\n"
                + " ///////////\\\n"
                + "///////////  \\\n"
                + "| SH _ OP |  |\n"
                + "|[] | | []|[]|\n"
                + "|   | |   |  |");
    }

    public static void battle_pop() {
        System.out.println("/\\                    /\\\n"
                + "\\ \\                  / /\n"
                + " \\ \\                / /\n"
                + "  \\.\\              /./\n"
                + "   \\.\\            /./\n"
                + "    \\.\\          /./\n"
                + "     \\\\\\        ///\n"
                + "      \\.\\      /./\n"
                + "       \\.\\    /./\n"
                + "        \\.\\__/./\n"
                + "       _/)))(((\\_\n"
                + "       \\|)\\##/(|/\n"
                + "       _|)/##\\(|_\n"
                + "       \\|)))(((|/\n"
                + "        /o/  \\o\\\n"
                + "       /o/    \\o\\\n"
                + "      /_/      \\_ ");
    }

    public static void Player() {
        System.out.println("              _______\n"
                + "         ..-'`       ````---.\n"
                + "       .'          ___ .'````.'SS'.\n"
                + "      /        ..-SS####'.  /SSHH##'.\n"
                + "     |       .'SSSHHHH##|/#/#HH#H####'.\n"
                + "    /      .'SSHHHHH####/||#/: \\SHH#####\\\n"
                + "   /      /SSHHHHH#####/!||;`___|SSHH###\\\n"
                + "-..__    /SSSHHH######.         \\SSSHH###\\\n"
                + "`.'-.''--._SHHH#####.'           '.SH####/\n"
                + "  '. ``'-  '/SH####`/_             `|H##/\n"
                + "  | '.     /SSHH###|`'==.       .=='/\\H|\n"
                + "  |   `'-.|SHHHH##/\\__\\/        /\\//|~|/\n"
                + "  |    |S#|/HHH##/             |``  |\n"
                + "  |    \\H' |H#.'`              \\    |\n"
                + "  |        ''`|               -     /\n"
                + "  |          /H\\          .----    /\n"
                + "  |         |H#/'.           `    /\n"
                + "  |          \\| | '..            /\n"
                + "  |    ^~DLF   /|    ''..______.'\n"
                + "   \\          //\\__    _..-. | \n"
                + "    \\         ||   ````     \\ |_\n"
                + "     \\    _.-|               \\| |_\n"
                + "     _\\_.-'   `'''''-.        |   `--.\n"
                + " ''``    \\            `''-;    \\ /\n"
                + "          \\      .-'|     ````.' -\n"
                + "          |    .'  `--'''''-.. |/\n"
                + "          |  .'               \\|\n"
                + "          |.'");
    }
;
/*    */ }


/* Location:              C:\Users\User\Documents\Text-Base Fighter\Text-Fighter.jar!\com\hotmail\kalebmarc\textfighter\main\Ui.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */
