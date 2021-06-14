package oop.assigment2.ex26.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Bao Kastan
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {
    @Test
    void testCalculateMonthsUntilPaidOff() {
        PaymentCalculator pc = new PaymentCalculator();
        assertEquals(70, pc.calculateMonthsUntilPaidOff(5000, 12, 100));
    }
}