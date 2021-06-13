package oop.assigment2.ex31.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void test_if_rate_is_correct_at_55_intensity() {
        App app = new App();
        int actualRate = app.getRate(55, "65", "22");
        assertEquals(138,actualRate);
    }

    @Test
    void test_if_rate_is_correct_at_65_intensity() {
        App app = new App();
        int actualRate = app.getRate(65, "65", "22");
        assertEquals(151,actualRate);
    }

    @Test
    void test_if_rate_is_correct_at_85_intensity() {
        App app = new App();
        int actualRate = app.getRate(85, "65", "22");
        assertEquals(178,actualRate);
    }

    @Test
    void test_if_rate_is_correct_at_95_intensity() {
        App app = new App();
        int actualRate = app.getRate(95, "65", "22");
        assertEquals(191,actualRate);
    }
}