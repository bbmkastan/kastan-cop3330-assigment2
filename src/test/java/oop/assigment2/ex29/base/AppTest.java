package oop.assigment2.ex29.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void letter_return_false() {
        App app = new App();
        assertFalse(app.isNumberAboveZero("a"));
    }

    @Test
    public void character_return_false() {
        App app = new App();
        assertFalse(app.isNumberAboveZero("&"));
    }

    @Test
    public void zero_return_false() {
        App app = new App();
        assertFalse(app.isNumberAboveZero("0"));
    }

    @Test
    public void get_correct_amount_years() {
        App app = new App();
        assertEquals(18,app.getYears(4));
    }
}