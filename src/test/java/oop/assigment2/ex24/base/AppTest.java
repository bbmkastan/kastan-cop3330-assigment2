package oop.assigment2.ex24.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Bao Kastan
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void check_if_returns_correct_adverb_if_anagram() {
        App myApp = new App();
        String expectedAdverb = "";
        String ActualAdverb = myApp.getAdverbBasedOnWetherIsAnagram("note", "tone");

        assertEquals(expectedAdverb, ActualAdverb);
    }

    @Test
    public void check_if_returns_correct_adverb_if_nonAnagram() {
        App myApp = new App();
        String expectedAdverb = " not";
        String ActualAdverb = myApp.getAdverbBasedOnWetherIsAnagram("not", "tone");

        assertEquals(expectedAdverb, ActualAdverb);
    }

    @Test
    public void check_output_if_anagram() {
        App myApp = new App();

        String expectedOutput = "\"note\" and \"tone\" are anagrams.";
        String ActualOutput = myApp.generateOutputString("note", "tone", "");

        assertEquals(expectedOutput, ActualOutput);
    }

    @Test
    public void check_output_if_nonAnagram() {
        App myApp = new App();

        String expectedOutput = "\"not\" and \"tone\" are not anagrams.";
        String ActualOutput = myApp.generateOutputString("not", "tone", " not");

        assertEquals(expectedOutput, ActualOutput);
    }
}