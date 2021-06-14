package oop.assigment2.ex30.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Bao Kastan
 */


public class App {

    public static void main(String[] args){
        App app = new App();
        int width = 12;
        int height = 12;
        String table = app.getMultiplicationTable(width, height);
        System.out.println(table);
    }

    public String getMultiplicationTable(int width, int height) {
        String MultiplicationTable = "";
        for (int i = 1; i <= height; ++i) {
            for (int j = 1; j <= width; ++j) {
                MultiplicationTable += Multiply(i,j);
            }
            MultiplicationTable += "\n";
        }
        return MultiplicationTable;
    }

    public String Multiply(int i, int j) {
        return String.format("%5d", i*j);
    }
}
