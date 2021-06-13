package oop.assigment2.ex29.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 10 Solution
 *  Copyright 2021 Bao Kastan
 */

import java.util.Scanner;
import java.lang.Math;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();
        double rate = Double.parseDouble((app.getRate()));
        int years = app.getYears(rate);
        app.printOutput(years);
    }

    public void printOutput(int years) {
        System.out.println("It will take " + years + " to double yout initial investment.");
    }

    public int getYears(double rate) {
        return (int) (Math.ceil(72.0 / rate));
    }

    public String getRate() {
        String rate = "0";
        while (!isNumberAboveZero(rate)) {
            rate = getUserInput();
            if (!isNumberAboveZero(rate)) {
                System.out.println("Sorry. That's not a valid input.");
            }
        }
        return rate;
    }

    public String getUserInput() {
        String rate;
        System.out.println("What is the rate of return?");
        rate = in.nextLine();
        return rate;
    }

    public boolean isNumberAboveZero(String rate) {
        for (int i = 0; i < rate.length(); i++) {
            if (((double) rate.charAt(i) < 49) || ((double) rate.charAt(i) > 57)) {
                return false;
            }
        }
        return true;
    }
}
