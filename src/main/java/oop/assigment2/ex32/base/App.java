package oop.assigment2.ex32.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Bao Kastan
 */

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();
        GuessingGame gg = new GuessingGame();
        System.out.println("Let's play Guess the Number!\n");
        String playAgain = "y";
        do {
            gg.playGuessingGame();
            System.out.println("\nDo you wish to play again (Y/N)? ");
            playAgain = in.nextLine();
            if (!app.is_Y_Or_N(playAgain)){
                gg.printInvaild();
            }
        } while (playAgain.equalsIgnoreCase("y"));
    }

    public boolean is_Y_Or_N(String playAgain) {
        if (playAgain.equalsIgnoreCase("y") || playAgain.equalsIgnoreCase("n")){
            return true;
        }
        return false;
    }
}

