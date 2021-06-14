package oop.assigment2.ex34.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Bao Kastan
 */

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);
    private static String[] list = {"John Smith","Jackie Jackson", "Chris Jones",
            "Amanda Cullen", "Jeremy Goodwin"};

    public static void main(String[] args) {
        App app = new App();
        app.outputList();
        String employeeName = app.getEmployeeName();
        ArrayList<String> employee = app.getNewEmployeeList(employeeName, list);
        app.replaceCurrentList(employee);
        app.outputList();
    }

    public void replaceCurrentList(ArrayList<String> employee) {
        list = employee.toArray(employee.toArray(new String[0]));
    }

    public ArrayList<String> getNewEmployeeList(String employeeName, String[] list) {
        ArrayList<String> employee = new ArrayList();
        for (int i = 0; i < list.length; i++) {
            if (!(employeeName.equalsIgnoreCase(list[i]))) {
                employee.add(list[i]);
            }
        }
        System.out.print("\n");
        return employee;
    }

    private String getEmployeeName() {
        System.out.println("Enter an employee name to remove: ");
        String employeeName  = in.nextLine();
        return employeeName;
    }

    public void outputList() {
        System.out.println("There are " + list.length + " employees: ");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        System.out.print("\n");
    }
}
