package oop.assigment2.ex35.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Bao Kastan
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class App {
    private static final Scanner in = new Scanner(System.in);
    private static Random rand = new Random();

    public static void main(String[] args) {
        App app = new App();
        ArrayList<String> emptyList = new ArrayList<String>();
        ArrayList<String> completedList = app.addNamesToList(emptyList);
        int winNum = app.getWiningNum(completedList);
        String winner = completedList.get(winNum);
        app.printOutput(winner);
    }

    public void printOutput(String winner) {
        String outputString = getOutputString(winner);
        System.out.println(outputString);
    }

    private String getOutputString(String winner) {
        return "The winner is ... " + winner;
    }

    public int getWiningNum(ArrayList<String> completedList) {
        return rand.nextInt(completedList.size());
    }

    public ArrayList<String> addNamesToList(ArrayList<String> list) {
        String name = getName();
        while (!(name.equalsIgnoreCase(""))) {
            list.add(name);
            name = getName();
        }
        return list;
    }

    public String getName() {
        System.out.print("Enter a name: ");
        return in.nextLine();
    }

}
