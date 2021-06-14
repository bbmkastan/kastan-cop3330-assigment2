package oop.assigment2.ex28.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Bao Kastan
 */

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();
        int sum = app.getSum();
        System.out.println("The total is " + sum);
    }

    private int getSum() {
        int sum = 0;
        for (int i = 0; i < 5; ++i)
        {
            sum += getNum();
        }
        return sum;
    }

    private int getNum() {
        System.out.println("Enter a number: ");
        return in.nextInt();
    }
}
