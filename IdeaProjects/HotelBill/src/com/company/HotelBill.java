package com.company;

import java.util.Scanner;

public class HotelBill {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.println("RESTAURANT BILL CALCULATOR:");

        System.out.print("Enter the Bill: $");
        double bill = data.nextDouble();

        System.out.print("No of people: ");
        int people = data.nextInt();

        double payment = bill/people;

        System.out.format("A bill of $%.2f split between "+ people +" people comes to approximately $%.2f each\n",bill,payment);

    }
}
