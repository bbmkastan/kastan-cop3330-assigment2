package oop.assigment2.ex24.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Bao Kastan
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {
    @Test
    public void isAnagram_return_true_for_anagram() {
        AnagramDetector ad = new AnagramDetector();
        assertTrue(ad.isAnagram("tone", "note"));
    }

    @Test
    public void isAnagram_return_true_for_anagram_with_spaces() {
        AnagramDetector ad = new AnagramDetector();
        assertTrue(ad.isAnagram("i am lord voldemort", "tom marvolo riddle"));
    }

    @Test
    public void isAnagram_return_false_for_nonAnagram() {
        AnagramDetector ad = new AnagramDetector();
        assertFalse(ad.isAnagram("asdf", "asde"));
    }

    @Test
    public void isAnagram_return_false_for_different_size_nonAnagram() {
        AnagramDetector ad = new AnagramDetector();
        assertFalse(ad.isAnagram("car", "race"));
    }

    @Test
    public void isAnagram_return_true_for_different_caseSize_anagram() {
        AnagramDetector ad = new AnagramDetector();
        assertTrue(ad.isAnagram("CarRace", "racecar"));
    }
}