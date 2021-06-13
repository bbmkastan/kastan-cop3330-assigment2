package oop.assigment2.ex25.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void test_output_string() {
        App myApp = new App();
        String expectedOutput = "The password 'abc123xyz' is a strong password.";
        assertEquals(expectedOutput, myApp.getOutputString("abc123xyz", "strong password"));
    }
}