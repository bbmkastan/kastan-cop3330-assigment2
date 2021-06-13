package oop.assigment2.ex31.base;



import java.util.Scanner;
import java.lang.Math;

public class App {
    private static final Scanner in = new Scanner(System.in);

    private static String pulse;
    private static String age;

    public static void main(String[] args) {
        App app = new App();
        app.getUserInput();
        app.printHeader();
        for (int intensity = 55; intensity <= 95; intensity += 5) {
            int rate = app.getRate(intensity, pulse, age);
            app.printOutput(intensity, rate);
        }
    }

    public void printOutput(int intensity, int rate) {
        System.out.format("%d%s%10s%d bpm\n", intensity, "%", "|", rate);
    }

    public void printHeader() {
        System.out.format("Intensity%4s Rate\n", "|");
        System.out.println("------------|-------");
    }

    public int getRate(int intensity, String pulse, String age) {
        return (int)Math.round((((220 -  Double.parseDouble(age)) - Double.parseDouble(pulse)) *
                ((double)intensity/100)) + Double.parseDouble(pulse));
    }

    public void getUserInput() {
        while (!isNum(pulse)) {
            System.out.print("Resting Pulse: ");
            pulse = in.nextLine();
            printIfInvaild(pulse);
        }
        while (!isNum(age)) {
            System.out.print("Age: ");
            age = in.nextLine();
            printIfInvaild(age);
        }
    }

    public void printIfInvaild(String pulse) {
        if (!isNum(pulse)) {
            System.out.println("Invalid Input, try again.");
        }
    }

    public boolean isNum(String str) {
        if (str == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
