package com.company;

import java.util.Scanner;

public class Money {

    public static void main(String[] args) {
        Scanner userdata = new Scanner(System.in);

        System.out.println("Enter ur name:");
        String name = userdata.nextLine();

        System.out.println("Enter ur age:");
        int age = userdata.nextInt();

        System.out.println("Enter the money u have:");
        double money = userdata.nextDouble();

        System.out.println();

        double moneyneeded = Math.ceil(money) - money;

        System.out.println("Your name is " + name + " and u are " + age + " old.");
        System.out.format("You have %.2f on your hand and needed %.2f.",money,moneyneeded);

    }
}
