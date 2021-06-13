package oop.assigment2.ex25.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Bao Kastan
 */

public class PasswordIndicator {

    private int numNumbers = 0;
    private int numLetters = 0;
    private int numCharacters = 0;
    
    public String PasswordValidator(String password) {
        int strength = getPasswordStrength(password);
        return evaluateStrength(strength);
    }

    public String evaluateStrength(int strength) {
        if (strength >= 7) {return "very strong password";}
        if (strength >= 5) {return "strong password";}
        if (strength >= 2) {return "weak password";}
        if (strength >= 1) {return "very weak password";}
        return "invalid password";
    }

    public int getPasswordStrength(String password) {
        characterCounuter(password);
        return countPoints(password);
    }

    private int countPoints(String password) {
        int points = 0;
        if (password.length() >= 8) { points +=2; }
        if (numNumbers > 0) { points++; }
        if (numLetters > 0) { points +=2; }
        if (numCharacters > 0) { points +=2; }
        return points;
    }

    public void characterCounuter(String password) {
        for (int i = 0; i < password.length(); ++i) {
            if ((int)password.charAt(i) >= 48 && (int)password.charAt(i) <= 57) {
                numNumbers++;
            } else if ((int)password.toUpperCase().charAt(i) >= 65 &&
                    (int)password.toUpperCase().charAt(i) <= 90) {
                numLetters++;
            } else {
                numCharacters++;
            }
        }
    }
}
