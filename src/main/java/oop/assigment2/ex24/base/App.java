package oop.assigment2.ex24.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Bao Kastan
 */

import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        String word1 = myApp.getUserInput("Enter the First string: ");
        String word2 = myApp.getUserInput("Enter the Second string: ");

        if (myApp.isSameAmountLetters(word1, word2)){
            AnagramDetector ad = new AnagramDetector();
            String adverb = myApp.getAdverb(ad.isAnagram(word1, word2));
            String outputString = myApp.generateOutputString(word1, word2, adverb);
            myApp.printOutput(outputString);
        } else {
            myApp.printLengthNotEqualOutput(word1, word2);
        }
    }

    public void printLengthNotEqualOutput(String word1, String word2) {
        System.out.println("String does not have same amount of letters, therefore" +
                " \"" + word1 + "\" and \"" + word2 + "\" are not anagrams.");
    }

    public String getAdverb(boolean bool) {
        if (bool) {
            return "";
        }
        return " not";
    }

    public void printOutput(String outputString) {
        System.out.println(outputString);
    }

    public String generateOutputString(String word1, String word2, String adverb) {
        return "\"" + word1 + "\" and \"" + word2 + "\" are" + adverb + " anagrams.";
    }

    public String getUserInput(String prompt) {
        System.out.print(prompt);
        return in.nextLine();
    }

    public boolean isSameAmountLetters(String word1, String word2) {
        return (word1.replaceAll(" ","").length() ==
                word2.replaceAll(" ","").length());
    }
}
