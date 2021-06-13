package oop.assigment2.ex26.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Bao Kastan
 */

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    private static double balance;
    private static double apr;
    private static double monthlyPayment;

    public static void main(String[] args)
    {
        App app = new App();
        PaymentCalculator pc = new PaymentCalculator();

        app.getUserInformation();
        int months = pc.calculateMonthsUntilPaidOff(balance,apr,monthlyPayment);
        String outputString = app.getOutputString(months);
        System.out.println(outputString);
    }

    private String getOutputString(int months) {
        return "It will take you " + months + " months to pay off this card.";
    }

    public void getUserInformation() {
        System.out.println("What is your balance?");
        balance = in.nextDouble();
        System.out.println("What is the APR on the card (as a percent)?");
        apr = in.nextDouble();
        System.out.println("What is the monthly payment you can make?");
        monthlyPayment = in.nextDouble();
    }
}
