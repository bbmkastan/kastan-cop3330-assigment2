package oop.assigment2.ex34.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Bao Kastan
 */

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void test_getNewEmployeeList_method() {
        App app = new App();
        ArrayList<String> expectedList = new ArrayList();
        String[] list = {"John Smith","Jackie Jackson", "Chris Jones",
                "Amanda Cullen", "Jeremy Goodwin"};

        for (int i = 0; i < list.length - 1; i++) {
                expectedList.add(list[i]);
        }

        assertEquals(expectedList, app.getNewEmployeeList("Jeremy Goodwin", list));
    }

}