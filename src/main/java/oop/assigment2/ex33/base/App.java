package oop.assigment2.ex33.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Bao Kastan
 */

import java.util.Random;
import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);
    private static final Random rand = new Random();
    private static final String[] magic8Ball = {"Yes.","No.","Maybe.","Ask again later."};

    public static void main(String[] args) {
        App app = new App();
        app.promptForUserQuestion();
        int randNum = rand.nextInt(3);
        String outputString = app.shakeMagic8Ball(randNum);
    }

    public void promptForUserQuestion() {
        System.out.println("What's your question?");
        System.out.print("> ");
        in.nextLine();
    }

    public String shakeMagic8Ball(int randNum) {
        return "\n" + magic8Ball[randNum];
    }
}
