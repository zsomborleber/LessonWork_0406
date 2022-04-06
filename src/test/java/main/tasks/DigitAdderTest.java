package main.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitAdderTest {

    @Test
    void test_addDigits() {
        assertEquals(1, DigitAdder.addDigits(1));
        assertEquals(2, DigitAdder.addDigits(2));
        assertEquals(1, DigitAdder.addDigits(-1));
        assertEquals(3, DigitAdder.addDigits(12));
        assertEquals(33, DigitAdder.addDigits(-5483229));
    }

}