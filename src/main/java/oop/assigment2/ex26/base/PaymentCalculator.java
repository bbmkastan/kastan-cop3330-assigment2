package oop.assigment2.ex26.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Bao Kastan
 */

import java.lang.Math;

public class PaymentCalculator {
    public int calculateMonthsUntilPaidOff(double balance, double apr, double monthlyPayment) {
        apr /= 100;
        double interest = apr/365;
        double months = (-(1.0/30.0)) * Math.log(1 + balance/monthlyPayment *
                (1 - Math.pow((1 + interest),30))) / Math.log(1 + interest);
        return (int) Math.ceil(months);
    }
}
