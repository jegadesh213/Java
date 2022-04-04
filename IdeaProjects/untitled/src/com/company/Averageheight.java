package com.company;
import java.util.Scanner;

public class Averageheight {

    public static void main(String[] args) {

        Scanner keyinput= new Scanner(System.in);

        System.out.println("what is ur name:");
        String userinput = keyinput.nextLine();
        System.out.println(userinput + " is a nice name" );

        System.out.println("\nwhat is ur age:");
        int userage = keyinput.nextInt();
        System.out.print("Your name is " + userinput + " and ur age is " + userage +"\n");

        System.out.print("\nwhat is ur height in metre:");
        double userheight = keyinput.nextDouble();
        System.out.println("you are "+ userheight +" metre long");

        double averagemaleheightdifference   = userheight = 1.75;
        double averagefemaleheightdifference = userheight = 1.62;
        System.out.println("\n The difference between average height and ur height:");
        System.out.println(averagemaleheightdifference   + " if u r male. ");
        System.out.println(averagefemaleheightdifference + " if u r female.");
    }
}
