package oop.assigment2.ex27.base;


import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);
    private static String[] userInput;
    private static final String[] prompts = {
            "Enter the first name: ",
            "Enter the last name: ",
            "Enter the ZIP code: ",
            "Enter the employee ID: "};

    public static void main(String[] args) {
        for (int i = 0; i < prompts.length; i++) {
            System.out.println(prompts[i]);
            userInput[i] = in.nextLine();
        }
    }
}
