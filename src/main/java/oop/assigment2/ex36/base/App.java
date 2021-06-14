package oop.assigment2.ex36.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Bao Kastan
 */

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();
        ArrayList<Double> numList = new ArrayList<Double>();
        String num = app.getNum();
        while (!num.equalsIgnoreCase("done")) {
            numList.add(Double.parseDouble(num));
            num = app.getNum();
        }
        app.printOutput(numList);
    }

    public void printOutput(ArrayList<Double> numList) {
        DecimalFormat stdFormat = new DecimalFormat ("#.00");
        System.out.println("Numbers: " + numList);
        System.out.println("The minimum is " + average(numList));
        System.out.println("The minimum is " + minimum(numList));
        System.out.println("The minimum is " + maximum(numList));
        System.out.println("The minimum is " + stdFormat.format(standardDeviation(numList, average(numList))));
    }

    public double average (ArrayList<Double> numList) {
        double avg = 0;
        for (int i = 0; i < numList.size(); ++i){
            avg += numList.get(i);
        }
        return avg/numList.size();
    }

    public double maximum (ArrayList<Double> numList) {
        double max;
        Collections.sort(numList);
        max = numList.get(numList.size()-1);
        return max;
    }

    public double minimum (ArrayList<Double> numList) {
        double min;
        Collections.sort(numList);
        min = numList.get(0);
        return min;
    }

    public double standardDeviation (ArrayList<Double> numList, double avg) {
        double std = 0;
        for (int i = 0; i < numList.size(); ++i){
            std += Math.pow(numList.get(i) - avg, 2);
        }
        return Math.sqrt(std/(double) numList.size());
    }

    private String getNum() {
        System.out.print("Enter a number: ");
        String num = in.nextLine();
        while (!isNumeric(num)) {
            if(num.equalsIgnoreCase("done")){
                break;
            }
            System.out.println("Invaild Input, try again.");
            System.out.print("Enter a number: ");
            num = in.nextLine();
        }
        return num;
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
