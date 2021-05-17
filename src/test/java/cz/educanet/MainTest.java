package cz.educanet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Logic logic = new Logic();


    @Test
    void plus() {
        double total = logic.plus(2, 5);
        assertEquals(7, total);
        total = logic.plus(-2, 5);
        assertEquals(3, total);
        total = logic.plus(0, 5);
        assertEquals(5, total);
    }

    @Test
    void minus() {
        double total = logic.minus(5, 2);
        assertEquals(3, total);
        total = logic.minus(-5, 2);
        assertEquals(-7, total);
        total = logic.minus(0, 2);
        assertEquals(-2, total);
    }

    @Test
    void divide() {
        double total = logic.divide(6, 3);
        assertEquals(2, total);
        total = logic.divide(0, 3);
        assertEquals(0, total);
        total = logic.divide(-6, 3);
        assertEquals(-2, total);
    }

    @Test
    void times() {
        double total = logic.times(6, 3);
        assertEquals(18, total);
        total = logic.times(0, 3);
        assertEquals(0, total);
        total = logic.times(-2, 3);
        assertEquals(-6, total);
    }

    @Test
    void power() {
        double total = logic.power(2, 2);
        assertEquals(4, total);
        total = logic.power(-2, 2);
        assertEquals(4, total);
        total = logic.power(0, 2);
        assertEquals(0, total);
    }

    @Test
    void factorial() {
        int total = logic.factorial(5);
        assertEquals(120, total);
        total = logic.factorial(9);
        assertEquals(362880,total);
        total = logic.factorial(2);
        assertEquals(2, total);
    }
}