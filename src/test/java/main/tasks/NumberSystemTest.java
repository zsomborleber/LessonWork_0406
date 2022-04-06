package main.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberSystemTest {

    @Test
    void test_decimalToBinary() {
        assertEquals(0, NumberSystem.decimalToBinary(0));
        assertEquals(1, NumberSystem.decimalToBinary(1));
        assertEquals(10, NumberSystem.decimalToBinary(2));
        assertEquals(101, NumberSystem.decimalToBinary(5));
        assertEquals(1011, NumberSystem.decimalToBinary(11));
        assertEquals(1000010010010L, NumberSystem.decimalToBinary(4242));
    }

}