package oop.assigment2.ex27.base;
//TODO fix later

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Bao Kastan
 */

public class InputChecker {
    private static boolean[] inputChecker = {false};
    private static int checker = 0;
    private static int inputs = 0;

    public boolean[] validateInput(String[] userInput) {
        for (; inputs < 2; inputs++) {
            checkNameInput(userInput[inputs]);
        }
        inputs++;
        checkUserZipCode(userInput[inputs]);
        inputs++;
        checkUserID(userInput[inputs]);
        return inputChecker;
    }

    public void checkUserZipCode(String userInput) {
        if (userInput.length() != 5 || userInput.matches("\\d{5}")){
            inputChecker[checker] = true;
        }
    }

    public void checkUserID(String userInput) {
        if (!userInput.matches("[A-Z]{2}-\\d{4}")) {
            inputChecker[checker] = true;
        }
    }

    public void checkNameInput(String userInput) {
        if (userInput.length() >= 2) {
            inputChecker[checker] = true;
        }
        checker++;
        if (userInput.length() == 0) {
            inputChecker[checker] = true;
        }
        checker++;
    }

}
