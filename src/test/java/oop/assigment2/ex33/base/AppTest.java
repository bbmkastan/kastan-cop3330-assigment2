package oop.assigment2.ex33.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Bao Kastan
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void test_magic8Ball_random_number_0() {
        App app = new App();
        String actualOutput = app.shakeMagic8Ball(0);
        assertEquals("\nYes.", actualOutput);
    }

    @Test
    public void test_magic8Ball_random_number_1() {
        App app = new App();
        String actualOutput = app.shakeMagic8Ball(1);
        assertEquals("\nNo.", actualOutput);
    }

    @Test
    public void test_magic8Ball_random_number_2() {
        App app = new App();
        String actualOutput = app.shakeMagic8Ball(2);
        assertEquals("\nMaybe.", actualOutput);
    }

    @Test
    public void test_magic8Ball_random_number_3() {
        App app = new App();
        String actualOutput = app.shakeMagic8Ball(3);
        assertEquals("\nAsk again later.", actualOutput);
    }

}