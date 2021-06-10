package oop.assigment2.ex24.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Bao Kastan
 */

import  java.util.Arrays;

public class AnagramDetector {
    public boolean isAnagram(String word1, String word2) {
            return isStringSameLetters(word1, word2);
    }

    public boolean isStringSameLetters(String word1, String word2) {
        char[] a1 = convertStringtoLowerCaseArrayWithoutSpaces(word1);
        Arrays.sort(a1);
        char[] a2 = convertStringtoLowerCaseArrayWithoutSpaces(word2);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }

    private char[] convertStringtoLowerCaseArrayWithoutSpaces(String word) {
        String s = word.toLowerCase();
        return s.replaceAll(" ", "").toCharArray();
    }
}
