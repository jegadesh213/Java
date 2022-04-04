import jdk.dynalink.beans.StaticClass;

import java.awt.*;
import java.util.Scanner;

public class Main {

    static String[] guest = new String[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        samplenames();

        do {
            displayguest();
            displaymenu();
            int option = getoption();

            if (option == 1) {
                addname();
            }
            else if (option == 2){
                insertguest();
            }
            else if (option == 3){
                renameguest();
            }
            else if (option == 4){
                removename();
            }
            else if (option == 5){
                break;
            }
        }while (true);
            System.out.println("EXITING.....");
    }

    static void displayguest(){
        System.out.println("*************************************");
        System.out.println("              --GUESTS--               ");
        System.out.println("");

        boolean Isempty = true;

        for (int i = 0; i < guest.length; i++) {
            if (guest[i] != null){
            System.out.println( (i+1) + ")"  + guest[i]);
            Isempty = false;

            }
        }
        if (Isempty){
            System.out.println("--THE LIST IS EMPTY--");
        }
    }

    static void displaymenu(){
        System.out.println("");
        System.out.println("---------------------------------------");
        System.out.println("|               --MENU--              |");
        System.out.println("|                                     |");
        System.out.println("|  1 - ADD GUEST                      |");
        System.out.println("|  2 - INSERT GUEST                   |");
        System.out.println("|  3 - RENAME GUEST                   |");
        System.out.println("|  4 - REMOVE GUEST                   |");
        System.out.println("|  5 - EXIT                           |");
        System.out.println("|                                     |");
        System.out.println("---------------------------------------");
    }

    static int getoption(){
        System.out.print("OPTION:");
        System.out.print("");
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

    static void addname(){
        for (int i = 0; i < guest.length; i++) {
            if (guest[i]==null){
                System.out.print("NAME:");
                guest[i] = scanner.nextLine();
                break;
            }
        }
    }

    static void insertguest(){
        System.out.print("NUMBER:");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (num >=1 && num <=10 && guest[num - 1] != null) {
            System.out.print("NAME:");
            String name = scanner.nextLine();

            for (int i= guest.length - 1;i > num- 1;i--){
                guest[i] = guest[i-1];
            }


            guest[num - 1] = name;
        }
        else{
            System.out.println("ERROR: ENTER THE CORRECT NUMBER FOr INSERTING");
        }
    }

    static void renameguest(){
        System.out.print("NUMBER:");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (num >=1 && num <=10 && guest[num - 1] != null) {
            System.out.print("NAME:");
            String name = scanner.nextLine();

            guest[num - 1] = name;
        }
        else{

            System.out.println("ERROR: ENTER THE CORRECT NUMBER FOR RENAMING");

        }
    }

    static void removename(){
        System.out.print("NUMBER:");
        int num = scanner.nextInt();
        if (num >=1 && num <=10 && guest[num - 1] != null){
            guest[num - 1] = null;
            String temp [] = new String[guest.length];
            int ti = 0;
            for(int i = 0;i < guest.length;i++){
                if (guest[i] != null){
                    temp[ti] = guest[i];
                    ti++;
                }
            }
            guest = temp;
        }
        else{
            System.out.println("ERROR: ENTER THE CORRECT NUMBER");
        }
    }

    static void samplenames(){
        guest[0] = "Jacob Willey";
        guest[1] = "Edward Thomson";
        guest[2] = "Rose Walker";
        guest[3] = "Molly Walker";
        guest[4] = "Christopher Nolan";
    }
}
