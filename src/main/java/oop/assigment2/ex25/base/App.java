package oop.assigment2.ex25.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Bao Kastan
 */

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        PasswordIndicator pi = new PasswordIndicator();
        String password = myApp.getPassword();
        String passwordStrength = pi.PasswordValidator(password);
        String outputString = myApp.getOutputString(password, passwordStrength);
        System.out.println(outputString);
    }

    public String getOutputString(String password, String passwordStrength) {
        return "The password '" + password + "' is a " + passwordStrength + ".";
    }

    private String getPassword() {
        System.out.println("Please enter your password: ");
        return in.nextLine();
    }
}
