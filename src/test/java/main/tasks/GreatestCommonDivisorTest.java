package main.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {

    @Test
    void test_findGCD() {
        int result1 = GreatestCommonDivisor.findGCD(0, 0);
        assertEquals(0, result1);

        int result2 = GreatestCommonDivisor.findGCD(10, 5);
        assertEquals(5, result2);

        int result3 = GreatestCommonDivisor.findGCD(225, 360);
        assertEquals(45, result3);

        int result4 = GreatestCommonDivisor.findGCD(5432, 2345);
        assertEquals(7, result4);

        int result5 = GreatestCommonDivisor.findGCD(11, Integer.MAX_VALUE);
        assertEquals(1, result5);
    }

}