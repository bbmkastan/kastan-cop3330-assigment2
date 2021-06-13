package oop.assigment2.ex25.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordIndicatorTest {
    @Test
    public void test_strength_of_only_numbers_and_fewer_than_8_characters() {
        PasswordIndicator pi = new PasswordIndicator();
        int actualPoints = pi.getPasswordStrength("1234567");
        assertEquals(1, actualPoints);
    }

    @Test
    public void test_strength_of_only_letters_and_fewer_than_8_characters() {
        PasswordIndicator pi = new PasswordIndicator();
        int actualPoints = pi.getPasswordStrength("abcd");
        assertEquals(2, actualPoints);
    }

    @Test
    public void test_strength_of_only_numbers_and_greater_than_8_characters() {
        PasswordIndicator pi = new PasswordIndicator();
        int actualPoints = pi.getPasswordStrength("123456789");
        assertEquals(3, actualPoints);
    }

    @Test
    public void test_strength_of_numbers_and_letters_andIs_atLeast_8_characters() {
        PasswordIndicator pi = new PasswordIndicator();
        int actualPoints = pi.getPasswordStrength("hello123");
        assertEquals(5, actualPoints);
    }

    @Test
    public void test_strength_of_numbers_and_letters_and_specialCharacters_password_andIs_atLeast_8_characters() {
        PasswordIndicator pi = new PasswordIndicator();
        int actualPoints = pi.getPasswordStrength("1337h@xor!");
        assertEquals(7, actualPoints);
    }

    @Test
    public void test_evaluation_of_invalid_password() {
        PasswordIndicator pi = new PasswordIndicator();
        assertEquals("invalid password", pi.evaluateStrength(0));
    }

    @Test
    public void test_evaluation_of_very_strong_password_password() {
        PasswordIndicator pi = new PasswordIndicator();
        assertEquals("very strong password", pi.evaluateStrength(7));
    }
}