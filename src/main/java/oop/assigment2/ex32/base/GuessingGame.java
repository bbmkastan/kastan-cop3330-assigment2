package oop.assigment2.ex32.base;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    private static final Scanner in = new Scanner(System.in);
    private static final Random rand = new Random();
    private static int randNum;

    public void playGuessingGame() {
        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        String difficulty = getDifficulty();
        getRandNum(difficulty);
        System.out.println("I have my number. What's your guess? ");
        playGame(randNum);
    }

    public void playGame(int randNum) {
        String userInput;
        int count = 0;
        do {
            userInput = in.nextLine();
            count++;
            while (!(isNumeric(userInput))) {
                printInvaild();
                userInput = in.nextLine();
                count++;
            }
            if (Integer.parseInt(userInput) < randNum) {
                System.out.println("Too low. Guess again: ");
            } else if (Integer.parseInt(userInput) > randNum) {
                System.out.println("Too high. Guess again: ");
            }
        } while (Integer.parseInt(userInput) != randNum);
        System.out.println("You got it in " + count + " guesses!");
    }

    public void getRandNum(String difficulty) {
        switch (difficulty) {
            case "1":
                randNum = rand.nextInt(9) + 1;
                break;
            case "2":
                randNum = rand.nextInt(99) + 1;
                break;
            case "3":
                randNum = rand.nextInt(999) + 1;
                break;
        }
    }

    public String getDifficulty() {
        String difficulty;
        do {
            difficulty = in.nextLine();
            if (!isCorrectDifficultyInput(difficulty)){
                printInvaild();
            }
        } while (!isCorrectDifficultyInput(difficulty));
        return difficulty;
    }

    public void printInvaild() {
        System.out.println("Invalid input, try again.");
    }

    public boolean isCorrectDifficultyInput(String difficulty) {
        return difficulty.length() == 1 && Integer.parseInt(difficulty) < 4 && Integer.parseInt(difficulty) > 0;
    }

    public boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}


