package oop.assigment2.ex36.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void test_average() {
        App app = new App();
        ArrayList<Double> numList = new ArrayList<Double>();
        numList.add(100.0);
        numList.add(200.0);
        numList.add(1000.0);
        numList.add(300.0);

        assertEquals(400, app.average(numList));

    }

    @Test
    void test_maximum() {
        App app = new App();
        ArrayList<Double> numList = new ArrayList<Double>();
        numList.add(100.0);
        numList.add(200.0);
        numList.add(1000.0);
        numList.add(300.0);

        assertEquals(1000, app.maximum(numList));
    }

    @Test
    void test_minimum() {
        App app = new App();
        ArrayList<Double> numList = new ArrayList<Double>();
        numList.add(100.0);
        numList.add(200.0);
        numList.add(1000.0);
        numList.add(300.0);

        assertEquals(100, app.minimum(numList));
    }

    @Test
    void test_standardDeviation() {
        App app = new App();
        ArrayList<Double> numList = new ArrayList<Double>();
        numList.add(100.0);
        numList.add(200.0);
        numList.add(1000.0);
        numList.add(300.0);

        assertEquals(353.5533905932738, app.standardDeviation(numList, 400));
    }
}