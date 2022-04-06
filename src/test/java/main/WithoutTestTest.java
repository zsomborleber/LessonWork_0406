package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithoutTestTest {

    @Test
    void test_calculate() {
        int number1 = 10;
        int number2 = 2;

        String addition = WithoutTest.calculate(number1, number2, '+');
        assertEquals("12", addition);

        String subtraction = WithoutTest.calculate(number1, number2, '-');
        assertEquals("8", subtraction);

        String multiply = WithoutTest.calculate(number1, number2, '*');
        assertEquals("20", multiply);

        String division = WithoutTest.calculate(number1, number2, '/');
        assertEquals("5", division);

        String other = WithoutTest.calculate(number1, number2, 'a');
        assertEquals("", other);
    }

    @Test
    void test_isPrime() {
        assertTrue(WithoutTest.isPrime(2));
        assertTrue(WithoutTest.isPrime(3));
        assertTrue(WithoutTest.isPrime(7));
        assertTrue(WithoutTest.isPrime(11));
        assertTrue(WithoutTest.isPrime(Integer.MAX_VALUE));

        assertFalse(WithoutTest.isPrime(0));
        assertFalse(WithoutTest.isPrime(1));
        assertFalse(WithoutTest.isPrime(-2));
        assertFalse(WithoutTest.isPrime(9));
        assertFalse(WithoutTest.isPrime(25));
    }

    @Test
    void test_checkGender() {
        String result1 = WithoutTest.checkGender(0);
        assertEquals("nő", result1);

        String result2 = WithoutTest.checkGender(1);
        assertEquals("férfi", result2);

        String reuslt3 = WithoutTest.checkGender(-1);
        assertEquals("valami más", reuslt3);
    }

    @Test
    void test_trafficLight() {
        String result1 = WithoutTest.trafficLight("zöld");
        assertEquals("SZABAD", result1);

        String result2 = WithoutTest.trafficLight("sárga");
        assertEquals("SÁRGA", result2 );

        String result3 = WithoutTest.trafficLight("piros");
        assertEquals("MEGÁLLJ", result3);

        String other = WithoutTest.trafficLight("a");
        assertEquals("NEM TUDOM", other);
    }

    @Test
    void test_isLeapYear() {
        assertTrue(WithoutTest.isLeapYear(1584));
        assertTrue(WithoutTest.isLeapYear(1600));
        assertTrue(WithoutTest.isLeapYear(1996));
        assertTrue(WithoutTest.isLeapYear(2024));

        assertFalse(WithoutTest.isLeapYear(1200));
        assertFalse(WithoutTest.isLeapYear(1580));
        assertFalse(WithoutTest.isLeapYear(1800));
        assertFalse(WithoutTest.isLeapYear(20201));
    }

}