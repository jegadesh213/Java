package com.company;

import java.util.Scanner;

public class ElectionAge {

    public static void main(String[] args) {

        Scanner user =  new Scanner(System.in);

        System.out.println("Welcome to election booth");
        System.out.print("Enter ur age:");
        int age = user.nextInt();

        if(age > 18){
            System.out.println("You are eligible to vote!");
        }
        else if(age <= 18){
            System.out.println("Sorry!You are not eligible to vote!");
        }
    }
}
