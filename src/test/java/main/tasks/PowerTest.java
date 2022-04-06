package main.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerTest {

    @Test
    void test_power() {
        assertEquals(1, Power.power(0, 0));
        assertEquals(1, Power.power(2, 0));
        assertEquals(2, Power.power(2, 1));
        assertEquals(8, Power.power(2, 3));
        assertEquals(125, Power.power(5, 3));
        assertEquals(16807, Power.power(7, 5));
    }

}