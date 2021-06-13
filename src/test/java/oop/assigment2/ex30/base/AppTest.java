package oop.assigment2.ex30.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void correct_MultiplicationTable() {
        App myApp = new App();
        String expectedOutput =
                "    1    2    3    4\n" +
                "    2    4    6    8\n" +
                "    3    6    9   12\n" +
                "    4    8   12   16\n";
        assertEquals(expectedOutput, myApp.getMultiplicationTable(4,4));
    }
}