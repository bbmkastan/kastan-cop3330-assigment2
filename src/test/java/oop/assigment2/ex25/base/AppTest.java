package oop.assigment2.ex25.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Bao Kastan
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void test_output_string() {
        App myApp = new App();
        String expectedOutput = "The password 'abc123xyz' is a strong password.";
        assertEquals(expectedOutput, myApp.getOutputString("abc123xyz", "strong password"));
    }
}